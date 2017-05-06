package model;

/**
 * Created by chenzhaohua on 17/4/6.
 */
public class ModelExample {


    public static abstract class CarModel {

        //发动
        protected abstract void start();

        //鸣笛
        protected abstract void alarm();

        //引擎轰鸣
        protected abstract void engineBoom();

        //停止
        protected abstract void stop();

        //模版方法,增加final关键字,不允许被复写
        final public void run() {
            start();
            engineBoom();
            if(isAlarm()) {
                alarm();
            }
            stop();
        }

        //钩子函数
        protected boolean isAlarm() {
            return true;
        }

    }


    public static class AudiCar extends CarModel {

        private boolean flag;

        @Override
        protected void start() {
            System.out.println("奥迪启动");
        }

        @Override
        protected void alarm() {
            System.out.println("奥迪鸣笛");
        }

        @Override
        protected void engineBoom() {
            System.out.println("奥迪车引擎轰轰作响");
        }

        @Override
        protected void stop() {
            System.out.println("奥迪停车");
        }

        @Override
        protected boolean isAlarm() {
            return flag;
        }

        public void setAlarmFlag(boolean flag) {
            this.flag = flag;
        }

    }


    public static void main(String[] args) {
        AudiCar car = new AudiCar();
        car.setAlarmFlag(false);
        car.run();
    }

}
