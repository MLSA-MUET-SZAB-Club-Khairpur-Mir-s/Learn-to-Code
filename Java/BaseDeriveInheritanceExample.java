
class Base{
    String name;
    Base(){
        System.out.println("I'm non parameterized constructor of Base Class2");
    }
    Base(String name){
        System.out.println("I'm parameterized constructor of Base Class");
    }
}
class Derived extends Base{
    Derived(){
        System.out.println("I'm non parameterized constructor of Derived Class1");
    }
    Derived(String name){
        super(name);
        System.out.println("I'm parameterized constructor of Derived Class");
    }
}
public class BaseDeriveInheritanceExample {
    public static void main(String[] args) {
        Derived obj = new Derived("hi");
    }
}
