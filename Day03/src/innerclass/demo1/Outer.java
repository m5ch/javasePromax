package innerclass.demo1;
/*
    外部类
 */
public class Outer {
    /*
        内部静态类
     */
    public static class Inner{
        private String name;

        public Inner() {
        }

        public Inner(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}
