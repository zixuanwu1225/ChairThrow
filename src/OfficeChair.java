public class OfficeChair extends Chair{
    private String buff;
    public OfficeChair(int toughness,int legs,int weight){
        super(toughness,legs,weight);
    }
    //make return int instead so that can be compared and called as compared to a String type
    public String grantBuff(){
        //make math.random into 1-4 and for whatever number correlate to a buff type
        int buffType = (int)(Math.random()*4)+1;
        if(buffType==1){
            return "Attack+";
        }
        else if(buffType==2){
            return "Defense+";
        }
        else if(buffType==3){
            return "Nullify next attack";
        }
        else{
            return "Immunity to next debuff";
        }
    }
}
