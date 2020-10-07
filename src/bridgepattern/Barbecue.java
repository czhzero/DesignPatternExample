package bridgepattern;

public abstract class Barbecue {
    protected Spicy mSpicy;    //实现部分实例

    //桥接模式的关键，组合实现和抽象
    public Barbecue(Spicy spicy) {
        this.mSpicy = spicy;
    }

    public abstract void eat();
}