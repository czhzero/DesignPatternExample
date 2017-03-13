package abstractfactory;

/**
 * Created by chenzhaohua on 17/3/12.
 */
public class AudiFactory extends CarFactory {

    @Override
    public ITire createTire() {
        return new NormalTire();
    }

    @Override
    public IEngine createEngine() {
        return new DomesticEngine();
    }

}
