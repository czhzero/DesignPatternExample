package abstractfactory;

/**
 * Created by chenzhaohua on 17/3/12.
 */
public class SUVTire implements ITire{
    @Override
    public void tire() {
        System.out.println("SUV轮胎");
    }
}
