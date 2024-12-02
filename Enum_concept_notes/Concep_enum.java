package Enum_concept_notes;

// enum Status { // enumeration
//     Running, Failed, Pending, Sucess;
// }
enum Laptop {
    Macbook(500), Vivobook(200), Lenovo(300), Acer(700), hp;

    private int price;

    private Laptop() {
        price = 1500;
    }

    private Laptop(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

}

public class Concep_enum {
    public static void main(String args[]) {

        // Status s = Status.Failed; //this is normal calling of status.
        // System.out.println(s);
        // Status[] s1 = Status.values(); //this is all values calling at same time
        // for (Status status : s1) {
        // System.out.println(status + " : " + status.ordinal());
        // }

        // NOW WE USE SWITCH CASE --
        // Status s = Status.Running;

        // switch (s) {
        // case Running:
        // System.out.println("your code is running");
        // break;

        // case Failed:
        // System.out.println("your code is failed");
        // break;

        // case Pending:
        // System.out.println("your code is in process");
        // break;

        // default:
        // System.out.println("your code is succesfully run");
        // break;
        // }
        Laptop[] lap = Laptop.values();

        for (Laptop laptop : lap) {
            System.out.println(laptop + " : " + laptop.getPrice());
        }
    }

}