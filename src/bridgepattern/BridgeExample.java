package bridgepattern;

public class BridgeExample {
    public static void main(String[] args) {
        Barbecue barbecue = new ChickenWing(new SlightSpicy());
        barbecue.eat();
        Barbecue barbecue2 = new ChickenWing(new ExtraSpicy());
        barbecue2.eat();
    }
}
