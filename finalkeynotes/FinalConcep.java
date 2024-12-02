package finalkeynotes;

final class Calc // this is the second use of final keyword when it is use with class it makes
                 // that class un extendable.
{
    public final void show() { // this is the third use of final keyword when it is use with method it help to
                               // prevent overriding of methods
        System.out.println("in Calc show");
    }

    public void add(int a, int b) {
        System.out.println(a + b);
    }
}

class Advcalc // extends Calc
{
    public void mul(int a, int b) {
        System.out.println(a * b);
    }

    public void show() {

    }
}

public class FinalConcep {
    public static void main(String[] args) {

        final int num = 8; // final keyword has three uses 1st one is variable when it is uses in variable
                           // the variable is fix not changeable
        // num = 20;
        System.out.println(num);
    }
}
