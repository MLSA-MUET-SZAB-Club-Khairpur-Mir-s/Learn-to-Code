
public class FortyPrimeNumbers {
    public static void main(String[] args) {
                int n1 = 0;
                boolean flag = true;
                int j=0;
                while(j!=40){
                flag = true;
                    for(int a = 2; a < n1; a++){
                        if(n1%a==0){
                            flag = false;
                        }
                    }
                    if(n1!=0&&n1!=1&&flag){
                        System.out.print(n1+" ");
                        j++;
                    }
                    n1++;
            }
    }
}
