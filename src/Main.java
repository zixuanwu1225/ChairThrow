public class Main {
    //polish this so that main method can be ran in test instead of main because of clumping purposes and convenience
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
    }
}
