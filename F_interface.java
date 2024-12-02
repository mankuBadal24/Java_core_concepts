
@FunctionalInterface // notation
interface H {
    int show(int i, int j);
}

public class F_interface {
    public static void main(String args[]) {
        // H obj = new H() { //NORMAL CALLING
        // public void show() {
        // System.out.println("in show ");
        // }
        // };
        // obj.show();

        // CALLING BY USING LAMBDA EXPRESSION LAMBDA SYMBOL IS (->).
        // H obj = () ->
        // {
        // System.out.println(" in show ");
        // };
        // obj.show();

        // WE CAN ALSO REDUCE THIS CODE MORE
        // H obj = i -> System.out.println("in show" + i);
        // obj.show(6);
        // RETURN TYPE NORMAL CODE
        // H obj = new H() {
        // public int show(int i, int j) {
        // return i + j;
        // }
        // };
        // int result = obj.show(8, 9);
        // System.out.println(result);

        // RETURN TYPE CODE USING LAMBDA EXPRESSION
        H obj = (i, j) -> i + j;
        int result = obj.show(8, 9);
        System.out.println(result);
    }
}
