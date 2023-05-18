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
    public void devConsoleEntry(String text){
        if(text.equals("Office Chair")){
            textArea1.setText(textArea1.getText()+"\n"+"clicked");
        }
        else if(text.equals("Benches")){
            textArea1.setText(textArea1.getText()+"\n"+"clicked");
        }
        else if(text.equals("Stools")){
            textArea1.setText(textArea1.getText()+"\n"+"clicked");
        }
        else if(text.equals("Wheelchair")){
            textArea1.setText(textArea1.getText()+"\n"+"clicked");
        }
        else if(text.equals("DevConsole")){
            textArea1.setText(textArea1.getText()+"\n"+"clicked");
        }
    }
}
