package assignment1;

public class Insertion_sort {
    void sort(int arr[])
    {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }


    static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");

        System.out.println();
    }
    public static void main(String args[])
    {
        int arr[] = { 67, 209, 198, 2, 99 };

        Insertion_sort ob = new Insertion_sort();
        ob.sort(arr);
        System.out.println("sorted array by insertion sort:");
        printArray(arr);
    }
}
