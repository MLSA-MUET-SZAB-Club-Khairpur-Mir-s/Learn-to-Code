
class NegativeNumberException extends Exception{
    @Override
    public String toString() {
        return "Program Stawpped"+"\n"+"Negative Number Found";
    }
}
class Rectangle{
    public int height, width ;
    Rectangle(int height, int width) throws NegativeNumberException{
        if (width<0||height<0){
            throw new NegativeNumberException();
        }
        this.height = height;
        this.width = width;
    }

    public int area(){
        return width*height;
    }
}
public class CustomExceptionClassExtending {
    public static void main(String[] args) {
        try {
            Rectangle obj = new Rectangle(-3, 4);
        } catch (NegativeNumberException e) {
            System.out.println(e);
        }
    }
}
