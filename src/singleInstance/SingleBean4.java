package singleInstance;

/**
 * Created by chenzhaohua on 17/5/6.
 */
public class SingleBean4 {

    private int num;

    private static SingleBean4 instance;

    private SingleBean4() {
        num++;
        System.out.println(getClass().getSimpleName() + " 第" + num + "次初始化");
    }

    public static synchronized SingleBean4 getInstance() {
        if (instance == null) {
            instance = new SingleBean4();
        }
        return instance;
    }

}
