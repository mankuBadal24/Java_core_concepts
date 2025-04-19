public class Hello{
    public static void main(String args[]) {
        StringBuffer bro = new StringBuffer("mayank");
        System.out.println(bro.append(" hello"));
        System.out.println(bro.delete(6, 9));
        // System.out.println(bro.isEmpty());
        System.out.println(bro.deleteCharAt(5));
    }
}
