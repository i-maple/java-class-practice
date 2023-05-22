// Main.java
// Experiment 1

class Main{
    public static void main(String[] args) {
        int l = 10, b = 20;
        Rectangle rect = new Rectangle(l, b);
        System.out.println("Area = " + rect.area());
    }
}

class Rectangle{
    int length;
    int breadth;

    public Rectangle(int length, int breadth){
        this.length = length;
        this.breadth = breadth;
    }

    public int area(){
        return (length*breadth);
    }
}