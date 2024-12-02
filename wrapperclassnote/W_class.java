package wrapperclassnote;
public class W_class {
    public static void main(String args[]){

        int num = 7;
        Integer num1 = num; // autoboxing(THIS IS CALLED AUTO-BOXING BEACAUSE WHEN WE
                            // TRANSFER PRIMITIVE TYPE VALUE INTO AN OBJECT AUTOMATICALLY)

         int num2 = num1; // auto-unboxing(THIS IS CALLED AUTO-UNBOXING BECAUSE WHEN
                            // WE TAKE OUT THE VALUE FROM OBJECT TO PRIMITIVE TYPE VALUE AUTOMATICALLY)
         System.out.println(num2);

        String str = "12";
        int num3 = Integer.parseInt(str);

        System.out.println(num3 * 4);

    }
}
