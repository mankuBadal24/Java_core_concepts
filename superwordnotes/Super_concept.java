package superwordnotes;
class A {
    public A() {
        super();
        System.out.println("in A");
        
    }

    public A(int n) {
        this();
        System.out.println("in A int");
    }
}

class B extends A {
    public B() {
        super();
        System.out.println("in B");
    }

    public B(int x) {
        super(6);
        System.out.println("in B int");
    }
}

public class Super_concept {
    public static void main(String args[]) {
        // B ag = new B(6);
    }

}