public class Notepad {
    static NTextArea textArea;

    public static void main(String[] args) {

        //Frame
        NFrame frame = new NFrame("Notepad");
        
        //Set a MenuBar
        frame.setMenuBar(new NMenu());

        //textArea
        textArea = new NTextArea("", 50, 50, NTextArea.SCROLLBARS_VERTICAL_ONLY);
        frame.add(textArea);
        
        //Set frame visible true at the end
        frame.setVisible(true);
    }
}