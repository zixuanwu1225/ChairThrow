import java.net.InetAddress;
import java.net.UnknownHostException;

public class Test {
    //assign proper names for all variables
    OfficeChair o = new OfficeChair(3,4,7);
    Benches b = new Benches(3,4,14);
    Stools s = new Stools(3,3,3);
    WoodenChair w = new WoodenChair(3,4,9);
    Chair c = new Chair(3,4,5);
    Player1 p1 = new Player1();
    Player2 p2 = new Player2();
    public static void main(String[] args) {
        Test t = new Test();
        t.assignChair();
        Chair c = new Chair(3,4,5);
        if(t.getP1().getC()instanceof OfficeChair){
            OfficeChair o = new OfficeChair(4,4,7);
            o.grantBuff();
        } else if (t.getP1().getC()instanceof Stools) {
            Stools s = new Stools(3,3,3);
            s.isDoubleHit();
        } else if (t.getP1().getC()instanceof WoodenChair) {
            WoodenChair w = new WoodenChair(4,4,7);
            w.grantDebuff();
        } else if (t.getP1().getC()instanceof Benches) {
            Benches b = new Benches(5,4,12);
            b.isStun();
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

    public WoodenChair getW() {
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
