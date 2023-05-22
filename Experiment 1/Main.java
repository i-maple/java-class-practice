// Main.java
// Experiment 1

class Main{
    public static void main(String[] args) {
        Rectangle rect = new Rectangle(19, 20);
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