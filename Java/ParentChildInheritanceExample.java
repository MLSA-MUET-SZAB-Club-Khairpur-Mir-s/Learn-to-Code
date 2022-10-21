
class Parent{
    public void printParent(){
        System.out.println("This is parent Class");
    }
}
class Child extends Parent{
    public void printChild(){
        System.out.println("This is child Class");
    }
}
public class ParentChildInheritanceExample {
    public static void main(String[] args) {
        Parent parentObj = new Parent();
        Child childObj = new Child();
        parentObj.printParent(); // parent method by parent object
        childObj.printChild();   // child method by child object
        childObj.printParent();  // parent method by child object
    }
}
