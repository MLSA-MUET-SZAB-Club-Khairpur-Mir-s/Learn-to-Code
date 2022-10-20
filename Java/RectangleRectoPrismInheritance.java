
class Rectangle_02{
    int height , width;
    Rectangle_02(int height , int width){
        this.height = height;
        this.width = width;
    }
    public void setHeight(int height){
        this.height = height;
    }
    public void setWidth(int width){
        this.width = width;
    }
    public int getHeight(){
        return height;
    }
    public int getWidth(){
        return width;
    }
    public int computeArea(){
        return this.width * this.height;
    }
    @Override
    public String toString(){
        return "Surface Area :" + computeArea() ;
    }
}
class RectPrism extends Rectangle_02{
    int depth;

    RectPrism(int height, int width, int depth) {
        super(height, width);
        this.depth = depth;
    }
    public void setDepth(int depth){
        this.depth = depth;
    }
    public int getDepth(){
        return this.depth;
    }
    public int computeVolume(){
        return this.height * this.width * this.depth;
    }
    public int computeSurfaceArea(){
        return 2*(this.depth * this.width * this.depth * this.height * this.width * this.height);
    }
    @Override
    public String toString(){
        return "Volume: " + computeVolume() + "\nSurface Area: " + computeSurfaceArea();
    }
}
public class RectangleRectoPrismInheritance {
    public static void main(String[]args){
        Rectangle_02 rectobj = new Rectangle_02(43,54);
        RectPrism obj = new RectPrism (32,43,4);
        obj.setHeight(45);
        obj.setWidth(43);
        obj.setDepth(43);
        System.out.println("Height: "+obj.getHeight());
        System.out.println("Width: "+obj.getWidth());
        System.out.println("Depth: "+obj.getDepth());
        System.out.println(rectobj);
        System.out.println(obj);
//        System.out.println(obj2);
    }
}
