package polymorphismAndCasting;

class C { // superclass
    public void show() {
        System.out.println("in C show");
    }
}

class D extends C { // subclass
    public void show1() {
        System.out.println("in D show");
    }
}

public class Demo {
    public static void main(String args[]) {
        C obj = (C) new D(); // upcasting (we say this upcasting because we create object of subclass and we
                             // type cast it in superclass basically we go up in priority thats why this is
                             // upcasting)
        obj.show();

        D obj1 = (D) obj; // downcasting (WE SAY THIS IS A DOWNCASTING BECAUSE THE REFRENCE IS obj WHICH
                          // IS BELONGS TO SUPERCLASS AND WE SIMPLY TYPECAST IT INTO SUBCLASS THATS WHY WE
                          // SAY THAT IT IS DOWNCAST basically we go DOWN in priority thats why this is CALLED
                          // DOWNCASTING)
        obj1.show1();

    }
}
