//table of 10 in reverse order

public class TableOfNumberNInReverseOrder {
    public static void main(String[]args){
        int tab = 10;
        for(int a = 10; a >= 1; a--){
            System.out.printf("%d * %d = %d\n",tab,a,tab*a);
        }
    }
}
