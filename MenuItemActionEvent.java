import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuItemActionEvent implements ActionListener{
    NFrame frame;
    NFileMenuActionEvent fileMenuEventObj;
    NEditMenuActionEvent editMenuEventObj;

    MenuItemActionEvent(NFrame frame) {
        this.frame = frame;
        this.fileMenuEventObj =  new NFileMenuActionEvent(this);
        this.editMenuEventObj = new NEditMenuActionEvent(this);
    }

    //Event Method
    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource() == this.frame.menuBar.newWindowMenuItem) {
            this.fileMenuEventObj.handleNewWindow();
        } else if(ae.getSource() == this.frame.menuBar.saveMenuItem) {
            this.fileMenuEventObj.handleSave();
        } else if(ae.getSource() == this.frame.menuBar.openMenuItem) {
            this.fileMenuEventObj.handleOpen();
        }else if(ae.getSource() == this.frame.menuBar.findAndReplaceMenuItem) {
            this.editMenuEventObj.setMatchStartIndex(0);
            this.editMenuEventObj.setMatchEndIndex(0);
            this.editMenuEventObj.handleFindAndReplace();
        }
    }
}
