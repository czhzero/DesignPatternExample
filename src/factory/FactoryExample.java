package factory;

/**
 * Created by chenzhaohua on 17/3/12.
 */
public class FactoryExample {

    public static void main(String args[]) {

        //反射方式实现工厂模式
        FactoryType1 factory = new ConcreateFactoryType1();
        Product A1 = factory.createProduct(ConcreatProductA.class);
        Product B1 = factory.createProduct(ConcreatProductB.class);
        A1.method();
        B1.method();

        //多工厂方法模式
        FactoryType2 factoryType2A = new ConcreateFactoryType2A();
        Product A2 = factoryType2A.createProduct();
        FactoryType2 factoryType2B = new ConcreateFactoryType2B();
        Product B2 = factoryType2B.createProduct();
        A2.method();
        B2.method();

        //简单工厂模式或者静态工厂模式{
        Product A3 = FactoryType3.createProduct();
        A3.method();



    }

}
