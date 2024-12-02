package EncapsulationNotes;
class Human {
    private java.lang.String name; // capsulation the variable *** all instance variable are declared in
    // capsulation
    private int age; // meaning of private is the private variable can call only in same class where
                     // its diclaration occur

    public Human() // constructor (it is a special method . it has a same name as a class name .
                   // a constructor never return anything ) constructor is call by itself
                   // whenever we create a object and call the object
    {
        age = 25; // basically constructor is used to assigning tha values safely
        name = "dipanshu";
    }

    public int getAge() { // this function describe the encapsulation
        return age;
    }

    public void setAge(int a) {
        age = a;
    }

    public java.lang.String getName() {
        return name;
    }
}

public class Encapsulate {
    public static void main(String[] args) {
        Human obj1 = new Human();
        // obj1.setAge(19);
        // obj1.setName("vanshika");
        System.out.print(obj1.getName() + " : " + obj1.getAge());
    }
}
