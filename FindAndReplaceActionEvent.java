import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
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
        if(ae.getSource() == this.miae.findBtn) {
            String text = this.frame.textArea.getText();
            String regex = "\\w*?(" + this.miae.findTf.getText() + ")\\w*?";
            
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(text);

            if( ((this.miae.findIndex) < text.length() ) &&  matcher.find(this.miae.findIndex)) {
                // System.out.println(matcher.group(1));
                this.frame.textArea.requestFocus();
                this.frame.textArea.select(matcher.start(1), matcher.end(1));
                this.miae.setFindIndex(matcher.end(1));
            }
        }
    }
}