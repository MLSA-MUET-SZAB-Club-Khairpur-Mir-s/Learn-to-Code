public class task16 {
    public static void main(String[] args) {
        System.out.print(1+ "\t|");
        for(int i=2; i<=9; i++) {
            System.out.print("\t" + i);

        }
        System.out.println(); 
        for(int i=1; i<=10; i++) {
            for(int j=1; j<=9; j++) {

                if(j==1){
                    System.out.print(i*j + "\t" + "|\t");
                }
                
                else
                System.out.print(i*j + "\t");
            }
            System.out.println();
            
        }
    }
}
