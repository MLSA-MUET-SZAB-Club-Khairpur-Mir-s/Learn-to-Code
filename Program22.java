package assignment1;
public class Program22 {
    static void swap(int[] arr, int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    static int partition(int[] arr, int low, int high)
    {

        int pivot = arr[high];

        int i = (low - 1);

        for(int j = low; j <= high - 1; j++)
        {
            if (arr[j] < pivot)
            {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, high);
        return (i + 1);
    }

    static void quickSort(int[] arr, int low, int high)
    {
        if (low < high)
        {

            int pi = partition(arr, low, high);


            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    static void printArray(int[] arr, int size)
    {
        for(int i = 0; i < size; i++)
            System.out.print(arr[i] + " ");

        System.out.println();
    }
    public static void main(String[] args)
    {
        int[] arr = { 10, 8, 56, 11, 76, 55 };
        int n = arr.length;

        quickSort(arr, 0, n - 1);
        System.out.println("Sorted array by quick sort: ");
        printArray(arr, n);
    }
}
// your coding skill is great keep it up.
// java language zindabad
// thaks bro
// bye bye
