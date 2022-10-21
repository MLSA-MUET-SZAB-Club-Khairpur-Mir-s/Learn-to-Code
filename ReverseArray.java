public class ReverseArray {
    public static void main(String[] args) {
       int[] myarr1 = {1,2,3,4,5,6,7,8,9,10};
       System.out.println("Array Before Reversing Order: ");
       for(int i=0; i<myarr1.length; i++)
       {
           System.out.print(myarr1[i] + " ");
       }
        System.out.println();
        System.out.println("Array After Reversing Order");
        for(int i=myarr1.length-1; i>=0; i--)
        {
            System.out.print(myarr1[i] + " ");
        }
        
    }
}
