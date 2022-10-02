import java.awt.TextField;

public class PlaceHolderTextField extends TextField {
    String placeHolderText;
    boolean isText = false;
        
    PlaceHolderTextField(String placeHolderText) {
        super();
        this.placeHolderText = placeHolderText;
        addFocusListener(new PlaceHolderFocusEvent(this));
        addKeyListener(new PlaceHolderKeyEvent(this));
    }
    PlaceHolderTextField(int cols, String placeHolderText) {
        super(cols);
        this.placeHolderText = placeHolderText;
        addFocusListener(new PlaceHolderFocusEvent(this));
        addKeyListener(new PlaceHolderKeyEvent(this));
    }
    PlaceHolderTextField(String text, String placeHolderText) {
        super(text);
        this.placeHolderText = placeHolderText;
        addFocusListener(new PlaceHolderFocusEvent(this));
        addKeyListener(new PlaceHolderKeyEvent(this));
    }
    
    PlaceHolderTextField(String text, int cols, String placeHolderText) {
        super(text, cols);
        this.placeHolderText = placeHolderText;
        addFocusListener(new PlaceHolderFocusEvent(this));
        addKeyListener(new PlaceHolderKeyEvent(this));
    }
}