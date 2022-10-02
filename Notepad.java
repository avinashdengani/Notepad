public class Notepad {
    
    public static void main(String[] args) {

        //Frame
        NFrame frame = new NFrame("Notepad");
        
        //Set a MenuBar
        frame.setMenuBar(new NMenu());

        //Set frame visible true at the end
        frame.setVisible(true);
    }
}