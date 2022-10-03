import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class FindAndReplaceActionEvent implements ActionListener{
    MenuItemActionEvent miae;
    NFrame frame;

    FindAndReplaceActionEvent(MenuItemActionEvent miae) {
        this.miae = miae;
        this.frame = miae.frame;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        String findText = this.miae.findTf.getPlaceHolderTextFieldText();
        String replaceText = this.miae.replaceTf.getPlaceHolderTextFieldText();
        
        if(ae.getSource() == this.miae.findBtn) {
            find(findText, false);
        } else if(ae.getSource() == this.miae.replaceBtn) {
            // replace(findText, replaceText);
        }
    }

    private void find(String findText, boolean isReplace) {
        String textAreaText = this.frame.textArea.getText().replaceAll("\\R", " ");

        String regex = "\\w*?(" + findText + ")\\w*?";
        
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(textAreaText);
        
        if( ((this.miae.findIndex) < textAreaText.length() ) &&  matcher.find(this.miae.findIndex)) {
            // System.out.println(matcher.group(1));
            this.frame.textArea.requestFocus();
            this.frame.textArea.select(matcher.start(1), matcher.end(1));
            if(!isReplace) {
                this.miae.setFindIndex(matcher.end(1));
            }
        }
    }

   
}