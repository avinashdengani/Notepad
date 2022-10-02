import java.awt.Frame;

public class NFrame extends Frame{
    NMenuBar menuBar;
    NTextArea textArea;
    
    public NFrame(String title) {
        super(title);
        setSize(800, 600);
        setLocationRelativeTo(null);

        addWindowListener(new NWindowClosing(this));

        menuBar = new NMenuBar(this);
        setMenuBar(menuBar);
        
        textArea = new NTextArea("", 50, 50, NTextArea.SCROLLBARS_VERTICAL_ONLY);
        add(textArea);
    }
}
