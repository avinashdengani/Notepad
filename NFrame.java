import java.awt.Frame;

public class NFrame extends Frame{
    public NFrame(String title) {
        super(title);
        setSize(800, 600);
        setLocationRelativeTo(null);

        addWindowListener(new NWindowClosing(this));
    }
}
