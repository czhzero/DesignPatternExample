package factory;

/**
 * Created by chenzhaohua on 17/3/12.
 */
public class ConcreateFactoryType2A extends FactoryType2 {

    @Override
    public Product createProduct() {
        return new ConcreatProductA();
    }
}
