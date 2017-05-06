package singleInstance;

/**
 * Created by chenzhaohua on 17/5/6.
 * 饿汉单利
 */
public class SingleBean3 {

    private int num;

    private static SingleBean3 instance = new SingleBean3();

    private SingleBean3() {
        num++;
        System.out.println(getClass().getSimpleName() + " 第" + num + "次初始化");
    }

    public static SingleBean3 getInstance() {
        return instance;
    }

}
