package abstractfactory;

/**
 * Created by chenzhaohua on 17/3/12.
 */
public class NormalTire implements ITire{
    @Override
    public void tire() {
        System.out.println("普通轮胎");
    }
}
