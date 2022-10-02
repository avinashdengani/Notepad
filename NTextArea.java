import java.awt.TextArea;
import java.awt.Font;

public class NTextArea extends TextArea{
    {
        setFont(new Font("Times New Roman", Font.PLAIN, 25));
    }
    NTextArea() {
        
    }
    NTextArea(int rows, int columns) {
        super(rows, columns);
    }
    NTextArea(String text) {
        super(text);
    }
    NTextArea(String text, int rows, int columns) {
        super(text, rows, columns);
    }
    NTextArea(String text, int rows, int columns, int scrollbars) {
        super(text, rows, columns, scrollbars);
    }
}
