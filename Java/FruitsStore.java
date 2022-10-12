class FruitDetails{
    private String name;
    private int price;
    private String color;
    FruitDetails(String n,int p,String c){
        this.name=n;
        this.price=p;
        this.color=c;
    }
    public void setName(String nam){
        this.name=nam;
    }
    public void setPrice(int prc){
        this.price=prc;
    }
    public void setColor(String clr){
        this.color=clr;
    }
    public String getName(){
        return name;
    }
    public int getPrice(){
        return price;
    }
    public String getColor(){
        return color;
    }
}
public class FruitsStore {
    public static void main(String[] args) {
     FruitDetails fruit1=new FruitDetails("Apple",50,"Red");
     fruit1.setName("Bannana");
     fruit1.setPrice(40);
     fruit1.setColor("Yellow");
        System.out.println("Name "+fruit1.getName()+" Price "+fruit1.getPrice()+" Color "+fruit1.getColor());
    }
}
