public class Pallindr {
    public static void main(String[] args) {
        int x = 0;
        System.out.println(isPallin(x));
    }
    public static boolean isPallin(int x){
        int revNum = 0;
        int n=x;
        while(n!=0){
            int rem = n%10;
            revNum = revNum*10 + rem;
            n /= 10;
        }
        if(x==revNum && x>=0){
            return true;
        }else{
            return false;
        }
    }
}
