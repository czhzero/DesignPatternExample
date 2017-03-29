package builder;

/**
 * Created by chenzhaohua on 17/3/29.
 */
public class BuilderExample {

    interface Builder {

        void makeWindow();

        void makeFloor();

        Room getRoom();
    }

    private static class Window {

    }

    private static class Floor {

    }

    private static class Room {

        private Window window;
        private Floor floor;

        public Window getWindow() {
            return window;
        }

        public void setWindow(Window window) {
            this.window = window;
        }

        public Floor getFloor() {
            return floor;
        }

        public void setFloor(Floor floor) {
            this.floor = floor;
        }
    }


    private static class RoomBuilder implements Builder {

        private Room room = new Room();

        @Override
        public void makeWindow() {
            room.setWindow(new Window());
        }

        @Override
        public void makeFloor() {
            room.setFloor(new Floor());
        }

        @Override
        public Room getRoom() {
            return room;
        }

    }

    private static class Designer {

        public void command(Builder builder) {
            // 先建造地板
            builder.makeFloor();
            // 再建造窗户
            builder.makeWindow();
        }
    }

    public static void main(String[] args) {
        // 先找来一个工人
        Builder builder = new RoomBuilder();
        // 再找来一个房屋设计师
        Designer designer = new Designer();
        // 工人按照设计师设计建造
        designer.command(builder);
        // 工人向雇主交房子
        Room newRoom = builder.getRoom();
    }

}
