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

    public void handleSave() {
        File newFile;

        this.fileDialog = new NFileDialog(this.frame, "Save File", NFileDialog.SAVE);

        this.fileDialog.setVisible(true);
        
        if(fileDialog.getFile() != null) {
            
            String[] fileNames = fileDialog.getFile().split("\\.");

            String fileName = fileNames[0] + ".ht";

            newFile = new File(fileDialog.getDirectory(), fileName);
            try {
                newFile.createNewFile();
                NFileWriter.setTextInFile(newFile, this.frame.textArea.getText());
            } catch (IOException io) {
                System.out.println(io.getMessage());
            }
        }
    }

    public void handleOpen() {
        this.fileDialog = new NFileDialog(this.frame, "Open File", NFileDialog.LOAD);

        this.fileDialog.setVisible(true);
        
        String data = NFileReader.getTextFromFile(new File(fileDialog.getDirectory(), fileDialog.getFile()));

        this.frame.textArea.setText(data);
    }

}
