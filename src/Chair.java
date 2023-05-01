public class Chair {
    private int toughness;
    private int legs;
    private int weight;
    public Chair(int toughness,int legs,int weight){
        this.toughness = toughness;//damage
        this.legs = legs;//dmg multipler based on dmg*amt of legs
        this.weight=weight;//drop off + chance to miss if you use too little force(use JSlider to determine force used to throw the chair)
        // (will be determined by type of chair + random weight)(make cool text like "this chair feels heavy")
    }
    //make file writer to make dev console on history of everything player did and be able to pull it up from gui.
}
