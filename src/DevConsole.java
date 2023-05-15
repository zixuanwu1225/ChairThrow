import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DevConsole extends JFrame {
    private JTextArea textArea1;
    private JPanel panel1;
    public DevConsole(){
        setContentPane(panel1);
        setTitle("DevConsole");
        setSize(500,300);
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setVisible(true);
    }

}
