package builder;

/**
 * Created by chenzhaohua on 17/3/29.
 */
public class BuilderExample2 {

    private static class User {

        private String name;
        private int age;
        private String address;

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        public String getAddress() {
            return address;
        }

        public static class Builder {
            private User user = new User();

            public Builder setName(String name) {
                user.name = name;
                return this;
            }

            public Builder setAge(int age) {
                user.age = age;
                return this;
            }

            public Builder setAddress(String address) {
                user.address = address;
                return this;
            }

            public User build() {
                return user;
            }
        }
    }


    public static void main(String[] args) {
        User.Builder builder = new User.Builder();
        User user = builder.setName("corn").setAge(100).setAddress("广州").build();
    }


}
