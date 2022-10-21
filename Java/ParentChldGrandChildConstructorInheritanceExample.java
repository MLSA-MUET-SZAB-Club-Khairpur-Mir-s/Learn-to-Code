
class Parent{
    public void show(){
        System.out.println("This is parent show");
    }
}
class Child extends Parent {
    @Override
    public void show() {
        System.out.println("This is child show from parent");
    }
}
class GrandChild extends Parent{
    public void show(){
        System.out.println("This is GrandChild Show from parent");
    }
    public void grandChildShow(){
        System.out.println("This is Grandchild own Show");
    }
}
public class ParentChldGrandChildConstructorInheritanceExample {
    public static void main(String[]args){
        Parent obj = new GrandChild();
        obj.show();
//        obj.grandChildShow(); --> it will throw an error because this method is nawt in Parent class
    }
}
