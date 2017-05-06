package proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by chenzhaohua on 17/3/29.
 */
public class ProxyExample {

    /**
     * 诉讼流程
     */
    public interface ILawsuit {
        void submit();

        void burden();

        void defend();

        void finish();
    }


    /**
     * 诉讼人
     */
    public static class XiaoMing implements ILawsuit {

        @Override
        public void submit() {
            System.out.println("老板拖欠工资,申请仲裁");
        }

        @Override
        public void burden() {
            System.out.println("合同书和银行流水在此");
        }

        @Override
        public void defend() {
            System.out.println("铁证如山,不必多说");
        }

        @Override
        public void finish() {
            System.out.println("诉讼成功,回家等通知");
        }
    }


    /**
     * 律师
     */
    public static class Lawyer implements ILawsuit {

        private ILawsuit mLawsuit;

        public Lawyer(ILawsuit lawsuit) {
            mLawsuit = lawsuit;
        }

        @Override
        public void submit() {
            System.out.println("律师开始替 " + mLawsuit.getClass().getSimpleName() + "提交诉讼");
            mLawsuit.submit();
            System.out.println("律师提交诉讼完毕");
        }

        @Override
        public void burden() {
            System.out.println("律师开始替 " + mLawsuit.getClass().getSimpleName() + "举证");
            mLawsuit.burden();
            System.out.println("律师举证完成");
        }

        @Override
        public void defend() {
            System.out.println("律师开始替 " + mLawsuit.getClass().getSimpleName() + "辩护");
            mLawsuit.defend();
            System.out.println("律师辩护完成");
        }

        @Override
        public void finish() {
            System.out.println("律师申请" + mLawsuit.getClass().getSimpleName() + "回执");
            mLawsuit.finish();
            System.out.println("律师等待回执");
        }
    }

    public static class DynamicProxy implements InvocationHandler {

        private Object object;

        public DynamicProxy(Object obj) {
            this.object = obj;
        }

        @Override
        public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
            System.out.println("律师开始" + method.getName());
            Object result = method.invoke(object, args);
            System.out.println("律师结束" + method.getName());
            return result;
        }
    }


    public static void main(String args[]) {

        XiaoMing user = new XiaoMing();
        Lawyer lawyer = new Lawyer(user);
        lawyer.submit();
        lawyer.burden();
        lawyer.defend();
        lawyer.finish();

        DynamicProxy dynamicProxy = new DynamicProxy(user);
        ClassLoader loader = user.getClass().getClassLoader();
        ILawsuit dynamicLawyer = (ILawsuit) Proxy.newProxyInstance(loader, new Class[]{ILawsuit.class}, dynamicProxy);
        dynamicLawyer.submit();
        dynamicLawyer.burden();
        dynamicLawyer.defend();
        dynamicLawyer.finish();

    }





}
