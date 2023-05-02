public class Stools extends Chair{
    private boolean doubleHit;
    public Stools(int toughness,int legs,int weight){
        super(toughness,legs,weight);
    }
    public boolean isDoubleHit(){
        //return random chance for double hit
        int DBHit = (int)(Math.random()*5)+1;
        return DBHit == 1;
    }
}
