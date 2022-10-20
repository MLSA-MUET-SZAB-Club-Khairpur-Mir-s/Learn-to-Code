
class Father{
    public String home = "Father's Home";  // Father has home
    public String car = "Father's Car";  // Father has car
}
class Son extends Father{
    public String car = "Son's car"; // Son has his own car
}
public class FatherSonPropertyOverrideInheritance {
    public static void main(String[]args){
        Son obj = new Son();
        System.out.println(obj.home); // Father's home
        System.out.println(obj.car);  // Son's car
    }
}
