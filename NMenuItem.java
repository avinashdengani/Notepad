import java.awt.MenuItem;
import java.awt.Font;

public class NMenuItem extends MenuItem{
    NFrame frame;

    NMenuItem(NFrame frame) {
        this.frame = frame;
        addActionListener(new MenuItemActionEvent(this.frame));
    }

    NMenuItem(String title, NFrame frame) {
        super(title);
        this.frame = frame;
        addActionListener(new MenuItemActionEvent(this.frame));
    }

    {
        setFont(new Font("Times New Roman", Font.PLAIN, 15));
    }
}
