import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Button;
import java.awt.Panel;

public class MenuItemActionEvent implements ActionListener{
    NFrame frame;
    NDialog findAndReplaceDialog;
    Panel findPanel;
    Panel replacePanel;
    PlaceHolderTextField findTf;
    PlaceHolderTextField replaceTf;
    Button findBtn;
    Button replaceBtn;
    int findIndex = 0;
    

    MenuItemActionEvent(NFrame frame) {
        this.frame = frame;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource() == this.frame.menuBar.newWindowMenuItem) {
            this.newWindow();
        } else if(ae.getSource() == this.frame.menuBar.findAndReplaceMenuItem) {
            this.findAndReplace();
        }
    }

    public void setFindIndex(int index) {
        this.findIndex = index;
    }

    private void newWindow() {
        new Notepad();
    }
    private void findAndReplace() {

        findAndReplaceDialog = new NDialog(this.frame, "Find and Replace");

        findPanel = new Panel();
        replacePanel = new Panel();

        findTf = 
                new PlaceHolderTextField(this.frame.textArea.getSelectedText(), 15, "Find", this);
        
        replaceTf = 
                new PlaceHolderTextField(15, "Replace", this);

        findBtn = new Button("Find");
        replaceBtn = new Button("Replace");

        findBtn.addActionListener(new FindAndReplaceActionEvent(this));
        replaceBtn.addActionListener(new FindAndReplaceActionEvent(this));
       
        findPanel.add(findTf);
        findPanel.add(findBtn);

        replacePanel.add(replaceTf);
        replacePanel.add(replaceBtn);

        findAndReplaceDialog.add(findPanel);
        findAndReplaceDialog.add(replacePanel);

        findAndReplaceDialog.setVisible(true);
    }
}
