package anonymusclass;

class E {
    public void show() {
        System.out.println("in E class");
    }
}

public class AIclass {
    public static void main(String args[]) {
        E obj = new E() /*{ // annonymus inner class
            public void show() {
                System.out.println("in AI class");
            }
        }*/;
        obj.show();
    }
}
