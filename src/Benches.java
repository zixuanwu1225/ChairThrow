public class Benches extends Chair{
    private boolean stun;
    public Benches(int toughness,int legs,int weight){
        super(toughness,legs,weight);
    }
    public boolean isStun(){
        //return random IDK like 2 percent chance for stun, actually no return like 20 percent chance to stun
        int stunChance = (int)(Math.random()*5)+1;
        return stunChance == 1;
    }
}
