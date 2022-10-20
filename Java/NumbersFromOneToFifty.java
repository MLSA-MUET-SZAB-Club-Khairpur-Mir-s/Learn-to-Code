public class NumbersFromOneToFifty {
    public static void main(String[]args){
        for(int i = 1; i <= 50; i++){
            if(i == 11 || i == 21 || i == 31 || i == 41 ){
                System.out.println();
            }
            System.out.print(i+"\t");
        }
    }
}
