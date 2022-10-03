import java.awt.Frame;
import java.awt.Dialog;
import java.awt.FileDialog;
import java.awt.Font;

public class NFileDialog extends FileDialog{
    NFileDialog(Dialog parent) {
        super(parent);
    }
    NFileDialog(Dialog parent, String title) {
        super(parent, title);
    }
    NFileDialog(Dialog parent, String title, int mode) {
        super(parent, title, mode);
    }
    NFileDialog(Frame parent) {
        super(parent);
    }
    NFileDialog(Frame parent, String title) {
        super(parent, title);
    }
    NFileDialog(Frame parent, String title, int mode) {
        super(parent, title, mode);
    }

    //Intializer block
    {
        setLocationRelativeTo(null);
        setFont(new Font("Times New Roman", Font.PLAIN, 25));
    }
}
