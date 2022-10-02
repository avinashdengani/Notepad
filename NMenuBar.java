import java.awt.MenuBar;
import java.awt.Menu;
import java.awt.MenuItem;
import java.awt.Font;

public class NMenuBar extends MenuBar{
    Menu file;
    Menu edit;
    MenuItem new1;
    MenuItem newWindow;
    MenuItem open;
    MenuItem save;
    MenuItem cut;
    MenuItem copy;
    MenuItem findAndReplace;

    NMenuBar() {
        file = new Menu("File");
        edit = new Menu("Edit");

        //MenuItems for "file" Menu
        new1 = new MenuItem("New");
        newWindow = new MenuItem("New Window");
        open = new MenuItem("Open");
        save = new MenuItem("Save");

        //MenuItems for "edit" Menu
        cut = new MenuItem("Cut");
        copy = new MenuItem("Copy");
        findAndReplace = new MenuItem("Find and Replace");

        //Adding MenuItem to Menu 
        file.add(new1);
        file.addSeparator();
        file.add(open);
        file.add(save);

        edit.add(cut);
        edit.add(copy);
        edit.addSeparator();
        edit.add(findAndReplace);
        
        //Adding Menu to MenuBar
        add(file);
        add(edit);
        
        setFont(new Font("Times New Roman", Font.PLAIN, 15));
    }
}