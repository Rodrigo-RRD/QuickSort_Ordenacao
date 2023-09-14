import java.util.Arrays;

/*
 * @author Rodrigo Rodrigues Ribeiro Dutra
 */
public class QuickSort {
    
    /* passa o array inteiro, inteiro de baixo e o inteiro de cima */
    public int partition(int arr[], int low, int high) {
        int pivot = arr[high];
        int i = (low - 1);
        for (int j = low; j < high; j++) {

            if (arr[j] <= pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

    public void quickSort(int arr[], int low, int high) {
        if (low < high) {

            int pi = partition(arr, low, high);

            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    public static void main(String args[]) {
        int arr[] = { 3, 8, 7, 10, 0, 23, 2, 1, 77, 7 };
        QuickSort quickSort = new QuickSort();
        System.out.println("Antes : " + Arrays.toString(arr));
        quickSort.quickSort(arr, 0, arr.length - 1);
        System.out.println("Ordenado : " + Arrays.toString(arr));
    }
}
