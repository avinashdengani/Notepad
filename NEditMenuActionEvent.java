import java.awt.Button;
import java.awt.Panel;

public class NEditMenuActionEvent {
    MenuItemActionEvent miae;
    NFrame frame;
    
    /************* FIND AND REPLACE ********/
    private NDialog findAndReplaceDialog;
    private Panel findPanel;
    private Panel replacePanel;
    private PlaceHolderTextField findTf;
    private PlaceHolderTextField replaceTf;
    private Button findBtn;
    private Button replaceBtn;
    private int findIndex = 0;
    private int matchStartIndex = 0;
    private int matchEndIndex = 0;

    NEditMenuActionEvent(MenuItemActionEvent miae) {
        this.miae = miae;
        this.frame = miae.frame;
    }

    public void handleFindAndReplace() {

        this.findAndReplaceDialog = new NDialog(this.frame, "Find and Replace");

        this.findPanel = new Panel();
        this.replacePanel = new Panel();

        this.findTf = 
                new PlaceHolderTextField(this.frame.textArea.getSelectedText(), 15, "Find", this.miae);
        
        this.replaceTf = 
                new PlaceHolderTextField(15, "Replace", this.miae);

        this.findBtn = new Button("Find");
        this.replaceBtn = new Button("Replace");

        this.findBtn.addActionListener(new FindAndReplaceActionEvent(this));
        this.replaceBtn.addActionListener(new FindAndReplaceActionEvent(this));
       
        this.findPanel.add(findTf);
        this.findPanel.add(findBtn);

        this.replacePanel.add(replaceTf);
        this.replacePanel.add(replaceBtn);

        this.findAndReplaceDialog.add(findPanel);
        this.findAndReplaceDialog.add(replacePanel);

        this.findIndex = 0;
        this.findAndReplaceDialog.setVisible(true);
    }

    //Getters and Setters
    public int getFindIndex() {
        return this.findIndex;
    }

    public void setFindIndex(int index) {
        this.findIndex = index;
    }

    public int getMatchStartIndex() {
        return this.matchStartIndex;
    }

    public void setMatchStartIndex(int matchStartIndex) {
        this.matchStartIndex = matchStartIndex;
    }

    public int getMatchEndIndex() {
        return this.matchEndIndex;
    }
    public void setMatchEndIndex(int matchEndIndex) {
        this.matchEndIndex = matchEndIndex;
    }

    public PlaceHolderTextField getFindPlaceHolderTextField() {
        return this.findTf;
    }
    public PlaceHolderTextField getReplacePlaceHolderTextField() {
        return this.replaceTf;
    }

    public Button getFindBtn() {
        return this.findBtn;
    }

    public Button getReplaceBtn() {
        return this.replaceBtn;
    }

}
