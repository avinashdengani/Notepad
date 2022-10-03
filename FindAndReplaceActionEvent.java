import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class FindAndReplaceActionEvent implements ActionListener{
    NEditMenuActionEvent editMenuEventObj;
    NFrame frame;

    FindAndReplaceActionEvent(NEditMenuActionEvent editMenuEventObj) {
        this.editMenuEventObj = editMenuEventObj;
        this.frame = editMenuEventObj.frame;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {

        if(ae.getSource() == this.editMenuEventObj.getFindBtn()) {
            this.handleFind();
        } else if(ae.getSource() == this.editMenuEventObj.getReplaceBtn()) {
            // this.handleReplace();
        }
    }

    private void handleFind() {
        String notepadText = this.frame.textArea.getText().replaceAll("\\R", " ");

        String searchText = this.editMenuEventObj.getFindPlaceHolderTextField().getPlaceHolderTextFieldText();
        String regex = "\\w*?(" + searchText + ")\\w*?";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(notepadText);

        if ((this.editMenuEventObj.getFindIndex() < notepadText.length())
                && matcher.find(this.editMenuEventObj.getFindIndex())) {
            this.frame.textArea.select(matcher.start(1), matcher.end(1));
            this.frame.textArea.requestFocus();

            // Setting globally index of matched text
            this.editMenuEventObj.setMatchStartIndex(matcher.start(1));
            this.editMenuEventObj.setMatchEndIndex(matcher.end(1));

            // Setting skip index for getting next occurrence
            this.editMenuEventObj.setFindIndex(matcher.end(1));
        }
    }
}