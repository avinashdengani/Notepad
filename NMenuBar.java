import java.awt.MenuBar;

public class NMenuBar extends MenuBar{
    NFrame frame;

    NMenu fileMenu;
    NMenu editMenu;

    NMenuItem newMenuItem;
    NMenuItem newWindowMenuItem;
    NMenuItem openMenuItem;
    NMenuItem saveMenuItem;
    NMenuItem cutMenuItem;
    NMenuItem copyMenuItem;
    NMenuItem findAndReplaceMenuItem;

    NMenuBar(NFrame frame) {
        this.frame = frame;
        fileMenu = new NMenu("File");
        editMenu = new NMenu("Edit");

        //MenuItems for "file" Menu
        newMenuItem = new NMenuItem("New", frame);
        newWindowMenuItem = new NMenuItem("New Window", frame);
        openMenuItem = new NMenuItem("Open", frame);
        saveMenuItem = new NMenuItem("Save", frame);

        //MenuItems for "edit" Menu
        cutMenuItem = new NMenuItem("Cut", frame);
        copyMenuItem = new NMenuItem("Copy", frame);
        findAndReplaceMenuItem = new NMenuItem("Find and Replace", frame);

        //Adding MenuItem to Menu 
        fileMenu.add(newMenuItem);
        fileMenu.add(newWindowMenuItem);
        fileMenu.addSeparator();
        fileMenu.add(openMenuItem);
        fileMenu.add(saveMenuItem);

        editMenu.add(cutMenuItem);
        editMenu.add(copyMenuItem);
        editMenu.addSeparator();
        editMenu.add(findAndReplaceMenuItem);
        
        //Adding Menu to MenuBar
        add(fileMenu);
        add(editMenu);
    }
}