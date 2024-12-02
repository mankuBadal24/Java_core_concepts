
public class Reverse {
    public static void main(String[] args) {
        System.out.println(reverseNum(-123));
        
        // while (N!=0) {
        //     rev = N%10;
        //     System.out.print((int)rev);
        
        //     N /=10;
        // }
        // if (rev > Integer.MAX_VALUE || rev < Integer.MIN_VALUE){

        // }
        
    }

    public static int reverseNum(int n){
        int rev = 0;
        while (n!=0) {
            int digit = n%10;
            rev = rev*10 + digit;
            if(rev > Integer.MAX_VALUE/10 || rev < Integer.MIN_VALUE/10){
                return 0;
            }
            n /=10;
        }
        return rev;
    }
}
