package singleInstance;

/**
 * Created by chenzhaohua on 17/5/6.
 * 枚举单利
 */
public class SingleBean1 {


    private int num;

    private SingleBean1() {
        num++;
        System.out.println(getClass().getSimpleName() + " 第" + num + "次初始化");
    }


    public static enum Test {

        INSTANCE;

        private SingleBean1 instance;

        Test() {
            instance = new SingleBean1();
        }


        public SingleBean1 getInstance() {
            return instance;
        }

    }

}
