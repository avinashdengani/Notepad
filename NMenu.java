import java.awt.Menu;
import java.awt.Font;

public class NMenu extends Menu {
    
    NMenu() {}
    
    NMenu(String title) {
        super(title);
    }

    {
        setFont(new Font("Times New Roman", Font.PLAIN, 15));
    }
}
