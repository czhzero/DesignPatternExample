package abstractfactory;

/**
 * Created by chenzhaohua on 17/3/12.
 */
public abstract class CarFactory {

    //生产轮胎
    public abstract ITire createTire();

    //生产发动机
    public abstract IEngine createEngine();

}
