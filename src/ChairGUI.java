import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;
import java.io.File;
import java.io.IOException;
import java.net.*;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.net.MalformedURLException;
import java.net.URL;

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
    private JLabel label2;
    private JLabel label;
    private Images image = new Images();
    private Graphics g;

    private DevConsole d;

    public ChairGUI(){
        BufferedImage img = null;
        try {
            img = ImageIO.read(new File("download.jpg"));
            g = img.getGraphics();
        } catch (IOException e) {
        }
        g.drawImage(img,0, 0, Gay);
        init();
    }
    public void init(){
        setContentPane(Gay);
        setTitle("Frame");
        setSize(1000,700);
        setLocation(500,250);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        devConsoleButton.addActionListener(this);
        benchesButton.addActionListener(this);
        stoolsButton.addActionListener(this);
        officeChairButton.addActionListener(this);
        wheelchairButton.addActionListener(this);
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
            setImage(text);

            d.devConsoleEntry(text);
        }
        else if(text.equals("Benches")){ImageIcon imageIcon = image.getIcon(text);
            setImage(text);
            d.devConsoleEntry(text);
        }
        else if(text.equals("Stools")){
            setImage(text);
            d.devConsoleEntry(text);
        }
        else if(text.equals("Wheelchair")){
            setImage(text);
            d.devConsoleEntry(text);
        }
        else if(text.equals("DevConsole")){
            //this.setVisible(true);
            d.setVisible(true);
            System.out.println("Pressed");

        }
    }

    public void itemStateChanged(ItemEvent e) {

    }
    /*public void paint(Graphics g){
        super.paint(g);
        try {
            URL url = new URL("https://4.imimg.com/data4/XC/HA/MY-424912/imagefile-productimage-images-4498_productimage_ach-057-250x250.jpg");
            image = ImageIO.read(url);
            image = image.getScaledInstance(100,100,Image.SCALE_DEFAULT);
            ImageObserver observer = null;
            g.drawImage(image,250,250, observer);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }*/
    public void setImage(String text){
        ImageIcon imageIcon = image.getIcon(text);
        Image image = imageIcon.getImage(); // transform it
        Image newimg = image.getScaledInstance(120, 150,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way
        imageIcon = new ImageIcon(newimg);
        label2.setIcon(imageIcon);
        label.setIcon(imageIcon);
    }

    public void stateChanged(ChangeEvent e) {

    }
}
