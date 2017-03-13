package factory;

/**
 * Created by chenzhaohua on 17/3/12.
 */
public class ConcreateFactoryType2B extends FactoryType2 {

    @Override
    public Product createProduct() {
        return new ConcreatProductB();
    }
}
