import java.awt.TextField;

public class PlaceHolderTextField extends TextField {
    String placeHolderText;
    boolean isText = false;
    MenuItemActionEvent miae;
        
    PlaceHolderTextField(String placeHolderText, MenuItemActionEvent miae) {
        super();
        this.placeHolderText = placeHolderText;
        addFocusListener(new PlaceHolderFocusEvent(this));
        addKeyListener(new PlaceHolderKeyEvent(this));
        this.miae = miae;
    }
    PlaceHolderTextField(int cols, String placeHolderText, MenuItemActionEvent miae) {
        super(cols);
        this.placeHolderText = placeHolderText;
        addFocusListener(new PlaceHolderFocusEvent(this));
        addKeyListener(new PlaceHolderKeyEvent(this));
        this.miae = miae;
    }
    PlaceHolderTextField(String text, String placeHolderText, MenuItemActionEvent miae) {
        super(text);
        this.placeHolderText = placeHolderText;
        addFocusListener(new PlaceHolderFocusEvent(this));
        addKeyListener(new PlaceHolderKeyEvent(this));
        this.miae = miae;
    }
    
    PlaceHolderTextField(String text, int cols, String placeHolderText, MenuItemActionEvent miae) {
        super(text, cols);
        this.placeHolderText = placeHolderText;
        addFocusListener(new PlaceHolderFocusEvent(this));
        addKeyListener(new PlaceHolderKeyEvent(this));
        this.miae = miae;
    }
}