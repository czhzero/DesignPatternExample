package abstractfactory;

/**
 * Created by chenzhaohua on 17/3/12.
 *
 * 宝马车工厂
 */
public class BMWFactory extends CarFactory {

    @Override
    public ITire createTire() {
        return new SUVTire();
    }

    @Override
    public IEngine createEngine() {
        return new ImportEngine();
    }

}
