package singleInstance;

/**
 * Created by chenzhaohua on 17/5/6.
 */
public class SingleExample {



    public static void main(String args[]) {
        SingleBean1.Test.INSTANCE.getInstance();
        SingleBean1.Test.INSTANCE.getInstance();

        SingleBean2.getInstance();
        SingleBean2.getInstance();

        SingleBean3.getInstance();
        SingleBean3.getInstance();

        SingleBean4.getInstance();
        SingleBean4.getInstance();
    }

}
