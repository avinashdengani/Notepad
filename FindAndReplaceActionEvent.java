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
            this.handleReplace();
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

    private void handleReplace() {
        if (!this.frame.textArea.getSelectedText().equals("")) {
            if (this.frame.textArea.getSelectedText()
                    .equals(this.editMenuEventObj.getFindPlaceHolderTextField().getPlaceHolderTextFieldText())) {

                if (this.editMenuEventObj.getMatchEndIndex() == 0) {
                    String text = this.frame.textArea.getText().substring(0,
                            this.frame.textArea.getSelectionStart() - 1);
                    Pattern pattern = Pattern.compile("\\R");
                    Matcher matcher = pattern.matcher(text);
                    int countOfEnters = 0;
                    while (matcher.find()) {
                        countOfEnters++;
                    }
                    this.editMenuEventObj
                            .setFindIndex(this.frame.textArea.getSelectionStart() - countOfEnters);
                    this.handleFind();
                }
    
                this.editMenuEventObj.setFindIndex(this.editMenuEventObj.getMatchEndIndex());


                this.frame.textArea.replaceRange(this.editMenuEventObj.getReplacePlaceHolderTextField().getPlaceHolderTextFieldText(),
                        this.editMenuEventObj.getMatchStartIndex(),
                        this.editMenuEventObj.getMatchEndIndex());

                this.handleFind();
            } else {
  
                this.handleFind();
                this.handleReplace();
            }
        } else {
            this.handleFind();
        }
    }
}