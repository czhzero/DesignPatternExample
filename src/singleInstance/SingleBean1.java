package singleInstance;

/**
 * Created by chenzhaohua on 17/5/6.
 * 枚举单利
 */
public enum SingleBean1 {

    INSTANCE;

    private int num;

    private Inner innerObject = null;

    private SingleBean1() {
        num++;
        System.out.println(getClass().getSimpleName() + " 第" + num + "次初始化");
        innerObject = new Inner();
    }

    public Inner getInstance() {
        return innerObject;
    }


    public static class Inner {

    }


}
