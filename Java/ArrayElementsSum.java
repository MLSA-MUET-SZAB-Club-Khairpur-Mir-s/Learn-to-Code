public class ArrayElementsSum {
    public static void main(String[]args){
        float [] arr = {1.8f, 1.3f, 1.7f, 1.7f, 1.5f};
        float sum = 0; // 2.5 + 2 + 1.5
        for(float ely : arr){
            sum += ely;
        }
        System.out.print(sum);
    }
}
