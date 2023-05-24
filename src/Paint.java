import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.ImageObserver;
import java.io.IOException;
import java.net.URL;


public class Paint {
    private Image image = null;
    public void paint(Graphics g){
        try {
            URL url = new URL("https://4.imimg.com/data4/XC/HA/MY-424912/imagefile-productimage-images-4498_productimage_ach-057-250x250.jpg");
            image = ImageIO.read(url);
            image = image.getScaledInstance(100,100,Image.SCALE_DEFAULT);
            ImageObserver observer = null;
            g.drawImage(image,250,250, observer);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
