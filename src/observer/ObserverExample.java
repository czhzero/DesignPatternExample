package observer;

import java.util.Enumeration;
import java.util.Vector;

/**
 * Created by chenzhaohua on 17/4/6.
 */
public class ObserverExample {

    interface Observer {
        public void update();
    }

    public static class ObserverA implements Observer {

        @Override
        public void update() {
            System.out.println("ObserverA has received!");
        }
    }


    public static class ObserverB implements Observer {

        @Override
        public void update() {
            System.out.println("ObserverB has received!");
        }
    }

    public static abstract class Observable {

        private Vector<Observer> vector = new Vector<Observer>();

        public void add(Observer observer) {
            vector.add(observer);
        }

        public void del(Observer observer) {
            vector.remove(observer);
        }

        public void notifyObservers() {
            Enumeration<Observer> enumo = vector.elements();
            while (enumo.hasMoreElements()) {
                enumo.nextElement().update();
            }
        }

        public void operation() {

        }
    }

    public static class ConcretObservable extends Observable{

        @Override
        public void operation() {
            System.out.println("update self!");
            notifyObservers();
        }

    }

    public static void main(String[] args) {
        Observable sub = new ConcretObservable();
        sub.add(new ObserverA());
        sub.add(new ObserverB());

        sub.operation();
    }

}
