
class Animal{
    public void makeNoise(){
        System.out.println("Animal Sound.. ");
    }
}
class Dog extends Animal{
    @Override
    public void makeNoise(){
        System.out.println("Woaf! Woaf!");
    }
}
class Cat extends Animal{
    @Override
    public void makeNoise(){
        System.out.println("Meow! Meow!");
    }
}
public class OverrideExampleWithAnimalClass {
    public static void main(String[] args) {
        Dog obj1 = new Dog();
        Cat obj2 = new Cat();
        obj1.makeNoise();
        obj2.makeNoise();
    }
}
