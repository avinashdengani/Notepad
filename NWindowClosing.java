import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Button;
import java.awt.Label;

public class NWindowClosing extends WindowAdapter{
    NFrame frame;
    NWindowClosing(NFrame frame) {
        this.frame = frame;
    }

    @Override
    public void windowClosing(WindowEvent we) {
        NDialog closingDialog = new NDialog(this.frame, "Close Notepad", true);

        Label label = new Label("Are you sure you want to exit?");
        Button yes = new Button("Yes");
        Button no = new Button("No");

        //Close Frame completely if clicked on yes
        yes.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                System.exit(0);
            }
        });

        //Close Dialog if clicked on No
        no.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                closingDialog.dispose();
            }
        });

        closingDialog.add(label);
        closingDialog.add(yes);
        closingDialog.add(no);

        closingDialog.setVisible(true);
    }
}
