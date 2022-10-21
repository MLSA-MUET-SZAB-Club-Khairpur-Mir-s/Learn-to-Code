
// Overloaded and overrided
class Geometric_figures{
    void calculateArea(float x){}   // Overload
    void calculateArea(float x, float y){}  // Overload
    void calculateArea(double r){}  // Overload
}
class AreaClaculator extends  Geometric_figures {
    @Override
    void calculateArea(float x) //Override
    {
        System.out.println("Area of the square: "+x*x+" sq units");
    }
    @Override
    void calculateArea(float x, float y)    // Override
    {
        System.out.println("Area of the rectangle: "+x*y+" sq units");
    }
    @Override
    void calculateArea(double r)    // Override
    {
        double area = 3.14*r*r;
        System.out.println("Area of the circle: "+area+" sq units");
    }
}
public class OvrloadAndOverrideExapmle {
    public static void main(String[] args) {
        AreaClaculator obj = new AreaClaculator();
        obj.calculateArea(3);
        obj.calculateArea(3,3);
        obj.calculateArea(3.9);
    }
}
