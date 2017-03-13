package factory;

/**
 * Created by chenzhaohua on 17/3/12.
 */
public class ConcreateFactoryType1 extends FactoryType1 {
    @Override
    public <T extends Product> T createProduct(Class<T> c) {

        Product p = null;

        try {
            p = (Product) Class.forName(c.getName()).newInstance();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        return (T) p;
    }
}
