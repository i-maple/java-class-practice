class Outer {
    private int value;

    public void display() {
        System.out.println("Value: " + value);
    }

    public class Inner {
        public void changeValue(int newValue) {
            value = newValue;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.display();

        Outer.Inner inner = outer.new Inner();
        inner.changeValue(42);

        outer.display();
    }
}