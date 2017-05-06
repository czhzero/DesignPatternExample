package proxy;

/**
 * Created by chenzhaohua on 17/3/30.
 * <p>
 * 强制代理
 */
public class MustProxyExample {

    public interface IGamePlayer {
        void login();

        void upgrade();

        IGamePlayer getProxy();
    }

    public static class GamePlayerProxy implements IGamePlayer {

        public GamePlayer mPlayer;

        public GamePlayerProxy(GamePlayer player) {
            mPlayer = player;
        }

        @Override
        public void login() {
            mPlayer.login();
        }

        @Override
        public void upgrade() {
            mPlayer.upgrade();
        }

        @Override
        public IGamePlayer getProxy() {
            return this;
        }
    }


    public static class GamePlayer implements IGamePlayer {

        public GamePlayerProxy mProxy;
        public String mName;

        public GamePlayer(String name) {
            mName = name;
        }

        @Override
        public void login() {
            if (isMyProxy()) {
                System.out.println("登录游戏");
            } else {
                System.out.println("请使用官方指定代理");
            }
        }

        @Override
        public void upgrade() {
            if (isMyProxy()) {
                System.out.println("打怪升级");
            } else {
                System.out.println("请使用官方指定代理");
            }
        }

        @Override
        public IGamePlayer getProxy() {
            mProxy = new GamePlayerProxy(this);
            return mProxy;
        }

        private boolean isMyProxy() {
            if (mProxy == null) {
                return false;
            } else {
                return true;
            }
        }

    }

    public static void main(String args[]) {
        GamePlayer player = new GamePlayer("zhangsan");

        player.login();                 //被禁用
        player.upgrade();               //被禁用

        GamePlayerProxy proxy = new GamePlayerProxy(player);
        proxy.login();                  //被禁用
        proxy.upgrade();                //被禁用

        player.getProxy().login();      //指定代理
        player.getProxy().upgrade();    //指定代理
    }

}
