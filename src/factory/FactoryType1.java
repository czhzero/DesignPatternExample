package factory;

/**
 * Created by chenzhaohua on 17/3/12.
 */
public abstract class FactoryType1 {
    public abstract <T extends Product> T createProduct(Class<T> c);
}
