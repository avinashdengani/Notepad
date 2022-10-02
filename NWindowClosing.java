import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class NWindowClosing extends WindowAdapter{
    NFrame frame;
    NWindowClosing(NFrame frame) {
        this.frame = frame;
    }

    @Override
    public void windowClosing(WindowEvent we) {
        System.exit(0);
    }
}
