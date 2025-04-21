// interface Mayank{
//     void talking();
// }

//  interface Neetu{
//     void Walking();
// }
// class Jo implements Neetu,Mayank{
//     public void Walking(){
//         System.out.println(" neetu  is walking");
//     }
//     public void talking(){
//         System.out.println("mayank is talking");
//     }
// }



class Hello {
    public void Maths() {
        System.out.println("i am in maths class");
    }
}

class Mine extends Hello {
    public void Physics() {
        System.out.println("i am in physics class");
    }
}

public class NeetuInterface extends Mine {
    public static void main(String[] args) {
        // Jo obj = new Jo();
        // obj.Walking();
        // obj.talking();
        // Hello hi = new Hello();
        // hi.Maths();
        // hi.Physics();
        Mine hi = new Mine();
        hi.Maths();
        hi.Physics();
        // Mine ji = new Mine();
        // ji.Physics();
    }
}
