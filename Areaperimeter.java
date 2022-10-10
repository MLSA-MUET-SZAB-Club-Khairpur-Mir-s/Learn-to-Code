class Rectangle {
    int length, breadth;
    Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }
    void printArea() {
        System.out.println("The Area of the rectangle is: " + (length*breadth));
    }
    void printPerimeter() {
        System.out.println("The Perimeter is: " + 2*(length*breadth));
    }
}
class Square extends Rectangle {
    int s;
    Square(int s) {
    super(s,s);
    this.s = s;
}
    void printArea() {
    System.out.println("The area of the square is:" + (s*s));
    }
    void printPerimeter() {
    System.out.println("The perimeter of the square is:" + 4*(s));
    }
}
public class Areaperimeter {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(5, 10);
        Square s1 = new Square(5);
        r1.printArea();
        r1.printPerimeter();
        s1.printArea();
        s1.printPerimeter();
    }
}

