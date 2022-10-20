
class Rectangle{
    int breadth, length;
    Rectangle(int breadth, int length){
        this.breadth = breadth;
        this.length = length;
    }
    public double rectoArea(){
        return this.breadth * this.length;
    }
    public double rectoPerimeter(){
        return 2*(this.length + this.breadth);
    }
}
class Square extends  Rectangle{
        Square(int breadth, int length){
            super(breadth,length);
        }
        public double sqArea(){
            return breadth*breadth;
        }
        public double sqPerimeter(){
            return 4*breadth;
        }
}
public class RectangleSquareInheritanceExample {
    public static void main(String[]args){
            Square obj = new Square(23,43);
            System.out.println("Rectangle Area : "+obj.rectoArea());
            System.out.println("Rectangle Perimeter : "+obj.rectoPerimeter());
            System.out.println("Square Area : "+obj.sqArea());
            System.out.println("Square Perimeter : "+obj.sqPerimeter());
    }
}
