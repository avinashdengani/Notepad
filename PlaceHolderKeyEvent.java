import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class PlaceHolderKeyEvent extends KeyAdapter{
    PlaceHolderTextField phtf;

    PlaceHolderKeyEvent(PlaceHolderTextField phtf) {
        this.phtf = phtf;
    }

    @Override
    public void keyReleased(KeyEvent ke) {
        this.phtf.miae.editMenuEventObj.setFindIndex(0);
        if(this.phtf.getText().equals(phtf.placeHolderText)) {
            this.phtf.isText = true;
        } else {
            phtf.isText = false;
        }
    }
}
