import java.io.File;
import java.io.IOException;

public class NFileMenuActionEvent {
    MenuItemActionEvent miae;
    NFrame frame;
    
     /************* OPEN AND SAVE ********/
     NFileDialog fileDialog;

    NFileMenuActionEvent(MenuItemActionEvent miae) {
        this.miae = miae;
        this.frame = miae.frame;
    }

    public void handleNewWindow() {
        new Notepad();
    }

}
