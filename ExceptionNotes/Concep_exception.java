package ExceptionNotes;

//CREATING SELF EXCEPTION BY USING EXCEPTION CLASS
// class MyException extends Exception {
//     public MyException(String string) {
//         super(string);
//     }
// }

public class Concep_exception {
    public static void main(String args[]) {
        int i = 0;
        int j = 0;
        // int nums[] = new int[5];
        // String str = "mayank";

        // HERE THE EXCEPTION CONCEPT IS OCCUR
        // j = 18/i;
        // System.out.println(j);

        // HERE THE FINDING OF ERROR BY TRY AND CATCH CONCEPT
        try {
            j = 18 / i;
            // if (j == 0)
            // throw new MyException("i dont want to print zero"); // throw keyword is use
            // to throwing a object for
            // catching
            // System.out.println(nums[1]);
            // System.out.println(nums[4]);
            // System.out.println(str.length());
            // System.out.println(str);

        } catch (Exception e) {
            System.out.println("something went wrong.. .. ");
        } finally // FINALLY IS THE PART OF TRY AND CATCH FAMILY WHICH WORK IS TO RUN WHENEVER AN
                  // EXCEPTION OCCUR OR NOT
        {
            System.out.println("byeeee...");
        }
        // catch (MyException e) {
        // j = 18 / 1;
        // System.out.println("this is the by default answer " + e);
        // }
        // catch(ArrayIndexOutOfBoundsException e){
        // System.out.println(" stay in your limit bro why you cross");
        // }

        // THE EXCEPTION IS THE PARENT OF ALL EXCEPTIONS THIS IS ALSO CALLED BY DEFAULT
        // EXCEPTION THIS IS ALWAYS CALLING AT LAST
        // catch (Exception e) {
        // System.out.println("something went wrong.. ");
        // }
        // System.out.println(i);
        System.out.println(j);
        // System.out.println("finalized");

    }
}
