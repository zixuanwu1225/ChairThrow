public class WheelChair extends Chair{
    private String buff;
    public WheelChair(int toughness,int legs,int weight){
        super(toughness,legs,weight);
    }
    //make return int instead so that can be compared and called as compared to a String type
    public String heal(){
        //part this so that variable of players health will be increased
        return"Heal+2 HP";
    }
}
