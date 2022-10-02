import java.awt.Dialog;
import java.awt.event.WindowEvent;
import java.awt.event.WindowAdapter;
import java.awt.FlowLayout;

public class NDialog extends Dialog{
    
    NDialog(NFrame frame, String title) {
        super(frame, title);
    }
    NDialog(NFrame frame, String title, boolean modal) {
        super(frame, title, modal);
    }

    //Intializer block
    {
        setSize(400, 200);
        setLayout(new FlowLayout());
        setLocationRelativeTo(null);

        addWindowListener(new WindowAdapter() {
           @Override
            public void windowClosing(WindowEvent we) {
                dispose();
            }
        });
    }
}
