import java.awt.event.*;
import java.awt.Color;

public class PlaceHolderFocusEvent implements FocusListener{
    PlaceHolderTextField phtf;
    
    PlaceHolderFocusEvent(PlaceHolderTextField phtf) {
        this.phtf = phtf;
        if(phtf.getText().equals("")) { 
            setPlaceHolderText();
        }
    }

    public void focusGained(FocusEvent fe) {
        this.phtf.setForeground(Color.RED);
        if(this.phtf.getText().equals(this.phtf.placeHolderText) && !phtf.isText) {
            this.phtf.setText("");
        }
    }
    public void focusLost(FocusEvent fe) {
        if(phtf.getText().equals("")) {
            setPlaceHolderText();
        }
    }
    private void setPlaceHolderText() {
        this.phtf.setText(this.phtf.placeHolderText);
        this.phtf.setForeground(Color.GRAY);
    }
}
