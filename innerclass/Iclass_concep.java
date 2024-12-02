package innerclass;
class G{
    int age;

    public void show(){
        System.out.println("in G class");
    }
    class H{   //inner class 
        public void config(){
            System.out.println("in config....");
            }
        }
    }

class Rakesh{
    public void family(){
        System.out.println("My family is :\n wife = Mrs. Manju \n 1st child = Mayank \n 2nd child = Nandini(kittu) \n 3rd child = Saksham");
    }
    class Mayank{
        public void kittu(){
            System.out.println("\n 2nd child of family \n ***kittu***");
        }
    }
}

public class Iclass_concep {
    public static void main(String args[]){

        // G obj = new G();
        // obj.show();

        // G.H obj1 = obj.new H();  //inner class method calling 
        // obj1.config();
        Rakesh obj = new Rakesh();
        obj.family();

        Rakesh.Mayank obj1 = obj.new Mayank();
        obj1.kittu();
    }
}
