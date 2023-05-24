import javax.swing.*;

public class Images {
    private JPanel panel1;
    private JLabel label;
    private JLabel label2;
    private JLabel label3;
    private JLabel label4;
    private JLabel label5;
    private ImageIcon icon=(ImageIcon)label.getIcon();
    private ImageIcon icon2=(ImageIcon)label2.getIcon();
    private ImageIcon icon3=(ImageIcon)label3.getIcon();
    private ImageIcon icon4=(ImageIcon)label4.getIcon();



    public ImageIcon getIcon(String text) {
        if(text.equals("Office Chair")){
            return icon;
        }
        else if(text.equals("Benches")){
            return icon2;
        }
        else if(text.equals("Stools")){
            return icon3;
        }
        else if(text.equals("Wheelchair")){
            return icon4;
        }
        return null;
    }
}
