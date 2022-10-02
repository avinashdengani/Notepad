import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class PlaceHolderKeyEvent extends KeyAdapter{
    PlaceHolderTextField phtf;

    PlaceHolderKeyEvent(PlaceHolderTextField phtf) {
        this.phtf = phtf;
    }

    @Override
    public void keyReleased(KeyEvent ke) {
        if(phtf.getText().equals(phtf.placeHolderText)) {
            phtf.isText = true;
        } else {
            phtf.isText = false;
        }
    }
}
