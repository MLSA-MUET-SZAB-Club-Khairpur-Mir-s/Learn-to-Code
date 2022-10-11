import java.util.Scanner;

public class ascendingorder {

    public static void main(String[] args) {
        Scanner UserInput=new Scanner(System.in);
        int temp;
        int[] a={36,19,29,12,5};
        for(int i=0;i<a.length;i++){
            int counter=0;
            for (int j=0;j<a.length-1-i;j++)
            {
                if(a[j]>a[j+1])
                {
                    temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                    counter=1;
                }
            }if(counter==0)
            {
                break;
            }
        }
for (int i=0;i<a.length;i++)
{
    System.out.print(a[i]+ " ");
}


    }
}
