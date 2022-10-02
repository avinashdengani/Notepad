import java.awt.MenuBar;
import java.awt.Menu;
import java.awt.MenuItem;

public class NMenu extends MenuBar{
    {
        Menu file = new Menu("File");
        Menu edit = new Menu("Edit");
        
        MenuItem new1 = new MenuItem("New");
        MenuItem open = new MenuItem("Open");
        MenuItem save = new MenuItem("Save");
        
        MenuItem cut = new MenuItem("Cut");
        MenuItem copy = new MenuItem("Copy");
        MenuItem findAndReplace = new MenuItem("Find and Replace");
        
        file.add(new1);
        file.addSeparator();
        file.add(open);
        file.add(save);

        edit.add(cut);
        edit.add(copy);
        edit.addSeparator();
        edit.add(findAndReplace);

        add(file);
        add(edit);
    }
}