package singleInstance;

/**
 * Created by chenzhaohua on 17/5/6.
 *
 * 静态内部类单利
 */
public class SingleBean2 {

    private int num;

    private SingleBean2() {
        num++;
        System.out.println(getClass().getSimpleName() + " 第" + num + "次初始化");
    }

    private static class Test {
        private static final SingleBean2 instance = new SingleBean2();
    }

    public static SingleBean2 getInstance() {
        return Test.instance;
    }

}
