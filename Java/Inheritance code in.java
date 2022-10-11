class Fruit{
private String name;
private int  price;
private String color;
 	Fruit(String n, int p, String c){
		this.name=n;
		this.price=p;
		this.color=c;}
public void setName(String nam){
this.name=nam;}
public void setPrice(int prc){
this.price=prc;}
public void setColor(String col){
this.color=col;}
public String getName(){
return this.name;}
public int getPrice(){
return this.price;
}
public String getColor(){
return this.color;}
}
public class Fruit_code{
public static void main(String [] args){
Fruit f1=new Fruit("Apple", 50 ,"Red");
f1.setName("Orange");
f1.setPrice(80);
f1.setColor("Orang");
System.out.println("Name: "+f1.getName());
System.out.println("Price: "+f1.getPrice());  
System.out.println("Color:  "+f1.getColor());
}
}
