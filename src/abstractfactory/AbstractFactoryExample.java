package abstractfactory;

/**
 * Created by chenzhaohua on 17/3/12.
 */
public class AbstractFactoryExample {

    public static void main(String args[]) {
        CarFactory audiFactory = new AudiFactory();
        audiFactory.createEngine().engine();
        audiFactory.createTire().tire();

        CarFactory bmwFactory = new BMWFactory();
        bmwFactory.createEngine().engine();
        bmwFactory.createTire().tire();
    }

}
