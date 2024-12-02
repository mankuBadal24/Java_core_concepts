package abstractNotes;
abstract class Car { // abstract method is only use when the class is also an abstract class
    public abstract void drive(); // abstract word is used to make the empty method which define in another class

    public abstract void fly();

    public void playmusic() {
        System.out.println("in car");
    }
}

abstract class WagonR extends Car { // abstract class can contained all methods there is no compulsion that abstract
                                    // class is only containing abstract method

    public void drive() {
        System.out.println("driving....");
    }
}

class UpdatedWagonR extends WagonR { // by default class is known as concrete class
    public void fly() {
        System.out.println("flying......");
    }
}

public class ConcepAbstract {
    public static void main(String args[]) {
        // Car obj = new Car(); // we can not create a object of abstract class
        Car obj = new UpdatedWagonR();
        obj.playmusic();
        obj.drive();
        obj.fly();
    }
}
