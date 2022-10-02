import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuItemActionEvent implements ActionListener{
    NFrame frame;
    
    MenuItemActionEvent(NFrame frame) {
        this.frame = frame;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource() == this.frame.menuBar.newWindowMenuItem) {
            new Notepad();
        }
    }
}
