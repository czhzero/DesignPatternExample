package abstractfactory;

/**
 * Created by chenzhaohua on 17/3/12.
 */
public class DomesticEngine implements IEngine {
    @Override
    public void engine() {
        System.out.println("国产发动机");
    }
}
