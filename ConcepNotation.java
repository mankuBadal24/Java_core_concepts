
class Notate {
    public void showTheDataWhichBelongThis() {
        System.out.println("in class Notate");
    }
}

class Mol extends Notate {
    @Override // THIS IS NOTATION
    public void showTheDataWhichBelongThis() {
        System.out.println("in class Mol");
    }
}

public class ConcepNotation {
    public static void main(String args[]) {
        Mol obj = new Mol();
        obj.showTheDataWhichBelongThis();
    }
}
