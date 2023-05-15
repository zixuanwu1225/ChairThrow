import java.net.InetAddress;
import java.net.UnknownHostException;

public class Test {
    //assign proper names for all variables
    OfficeChair o = new OfficeChair(3,4,7);
    Benches b = new Benches(3,4,14);
    Stools s = new Stools(3,3,3);
    WheelChair w = new WheelChair(3,4,9);
    Chair c = new Chair(3,4,5);
    Player1 p1 = new Player1();
    Player2 p2 = new Player2();
    public static void main(String[] args) {
        Test t = new Test();
        t.assignChair();
        Chair c = new Chair(3,4,5);
        if(t.getP1().getC()instanceof OfficeChair){

        } else if (t.getP1().getC()instanceof Stools) {

        } else if (t.getP1().getC()instanceof WheelChair) {

        } else if (t.getP1().getC()instanceof Benches) {

        }
        ChairGUI gui = new ChairGUI();
        gui.setVisible(true);
    }

    public Player1 getP1() {
        return p1;
    }

    public Chair getC() {
        return c;
    }

    public WheelChair getW() {
        return w;
    }

    public Stools getS() {
        return s;
    }

    public Benches getB() {
        return b;
    }

    public OfficeChair getO() {
        return o;
    }

    public Player2 getP2() {
        return p2;
    }

    public void assignChair(){
        int chair1 = (int)(Math.random()*5)+1;
        int chair2 = (int)(Math.random()*5)+1;
        //player1 assigned chair
        if(chair1==1){
            p1.setC(c);
        }
        else if(chair1==2){
            p1.setC(o);
        }
        else if(chair1==3){
            p1.setC(b);
        }
        else if(chair1==4){
            p1.setC(s);
        }
        else{
            p1.setC(w);
        }
        //player2 assigned chair
        if(chair2==1){
            p2.setC(c);
        }
        else if(chair2==2){
            p2.setC(o);
        }
        else if(chair2==3){
            p2.setC(b);
        }
        else if(chair2==4){
            p2.setC(s);
        }
        else{
            p2.setC(w);
        }
    }
}
