package arrayallprogram;

import java.util.Arrays;

public class Concep_array {
    public static void main(String []args){
        int[] num = {2,7,4,9,6,8};
        System.out.println("the array is : ");
        for (int i : num) {
            System.out.println(i);
            Arrays.sort(num);
        }
    }
}
