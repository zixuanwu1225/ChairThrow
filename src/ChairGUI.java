import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class ChairGUI extends JFrame implements ActionListener, ItemListener, ChangeListener {
    OfficeChair o = new OfficeChair(3,4,7);
    Benches b = new Benches(3,4,14);
    Stools s = new Stools(3,3,3);
    WheelChair w = new WheelChair(3,4,9);
    Chair c = new Chair(3,4,5);
    private JSlider slider1;
    private JButton officeChairButton;
    private JButton benchesButton;
    private JButton stoolsButton;
    private JButton wheelchairButton;
    private JSlider slider2;
    private JButton devConsoleButton;
    private JPanel Fat;
    private JPanel Gay;

    private DevConsole d;

    public ChairGUI(){
        init();
    }
    public void init(){
        setContentPane(Gay);
        setTitle("Frame");
        setSize(1000,700);
        setLocation(500,250);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        devConsoleButton.addActionListener(this);
        d = new DevConsole();
        d.setVisible(false);
        this.setVisible(true);
    }
    //make file writer for action performed so that when buttons pressed will appear in a file that will be dev console for later
    //make so that you have limited amounts of each chair so they will have to strategically use chairs.
    public void actionPerformed(ActionEvent e) {
        Test t = new Test();
        Object source = e.getSource();
        JButton button = (JButton) source;
        String text = button.getText();
        if(text.equals("Office Chair")){
            if(o.getBuffType()==1){
                o.setToughness(5);
            }
        }
        else if(text.equals("Benches")){

        }
        else if(text.equals("Stools")){

        }
        else if(text.equals("Wheelchair")){

        }
        else if(text.equals("DevConsole")){
            //this.setVisible(true);
            d.setVisible(true);
            System.out.println("Pressed");
        }
    }

    public void itemStateChanged(ItemEvent e) {

    }

    public void stateChanged(ChangeEvent e) {

    }
}
