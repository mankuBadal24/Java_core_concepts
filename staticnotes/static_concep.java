package staticnotes;
class Mobile {
    java.lang.String brand;
    int price;
    static String name;

    public void show() {
        System.out.println(brand + ":" + price + ":" + name);
    }
}

public class static_concep {
    public static void main(String args[]) {
        Mobile obj1 = new Mobile();
        obj1.brand = "realme";
        obj1.price = 1700;
        Mobile.name = "smartphone";

        Mobile obj2 = new Mobile();
        obj2.brand = "apple";
        obj2.price = 2000;
        Mobile.name = "smartphone";

        Mobile obj3 = new Mobile();
        obj3.brand = "oneplus";
        obj3.price = 1900;
        Mobile.name = "smartphone";

        Mobile.name = "Brand";

        obj1.show();
        obj2.show();
        obj3.show();
    }
}
