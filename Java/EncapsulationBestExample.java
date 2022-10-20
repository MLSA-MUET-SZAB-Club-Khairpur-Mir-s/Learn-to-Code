
class FruitDetails{
    private String name, color;
    private int price;
    FruitDetails(String name, String color, int price){
        this.name = name;
        this.color = color;
        this.price = price;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setColor(String color){
        this.color = color;
    }
    public void setPrice(int price){
        this.price = price;
    }
    public String getName(){
        System.out.print("Name : ");
        return name;
    }
    public String getColor(){
        System.out.print("Color : ");
        return color;
    }
    public int getPrice(){
        System.out.print("Price : ");
        return price;
    }
}
public class EncapsulationBestExample {
    public static void main(String[]args){
            FruitDetails fruit1 = new FruitDetails("Apple","Red",20);
            FruitDetails fruit2 = new FruitDetails("Orange","Orange",30);
            System.out.println("Details Of Fruits Through Constructor");
            System.out.println(fruit1.getName());
            System.out.println(fruit1.getColor());
            System.out.println(fruit1.getPrice());
            System.out.println(fruit2.getName());
            System.out.println(fruit2.getColor());
            System.out.println(fruit2.getPrice());

            fruit1.setName("Lemon");
            fruit1.setColor("Yellow");
            fruit1.setPrice(5);
            fruit2.setName("Strawberry");
            fruit2.setColor("Red");
            fruit2.setPrice(50);

            System.out.println("\nAfter Updating the Details Of fruits through setters");
            System.out.println(fruit1.getName());
            System.out.println(fruit1.getColor());
            System.out.println(fruit1.getPrice());
            System.out.println(fruit2.getName());
            System.out.println(fruit2.getColor());
            System.out.println(fruit2.getPrice());

    }
}
