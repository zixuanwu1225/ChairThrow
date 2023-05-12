import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class ChairGUI extends JFrame implements ActionListener, ItemListener {
    private JSlider slider1;
    private JButton attack1Button;
    private JButton attack2Button;
    private JButton defendButton;
    private JButton specialButton;
    private JSlider slider2;
    private JButton devConsoleButton;
    private JPanel Gay;

    public ChairGUI(){
        setContentPane(Gay);
        setTitle("Frame");
        setSize(500,300);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    }
    public void init(){

    }

    public void actionPerformed(ActionEvent e) {

    }

    public void itemStateChanged(ItemEvent e) {

    }
}
