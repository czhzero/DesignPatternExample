package bridgepattern;

public class ChickenWing extends Barbecue{
    public ChickenWing(Spicy spicy) {
        super(spicy);
    }

    public void eat() {
        System.out.println("鸡翅：" + super.mSpicy.taste());
    }
}