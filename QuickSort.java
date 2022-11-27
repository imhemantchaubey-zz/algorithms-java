import java.util.Arrays;

class QuickSort {
  static void quickSort(int[] arr) {
    quickSort(arr, 0, arr.length - 1);
    System.out.println(Arrays.toString(arr));
  }

  static void quickSort(int[] arr, int low, int high) {
    if (low < high) {
      int j = partition(arr, low, high);
      quickSort(arr, low, j);
      quickSort(arr, j + 1, high);
    }
  }

  static int partition(int[] arr, int low, int high) {
    int pivot = arr[low];
    int i = low, j = high;
    while (i < j) {
      while (arr[i] <= pivot)
        i++;
      while (arr[j] > pivot)
        j--;
      if (i < j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
      }
    }
    int temp = arr[j];
    arr[j] = pivot;
    arr[low] = temp;
    return j;
  }

  public static void main(String[] args) {
    int[] arr = { 15, 26, 78, 59, 20, 41 };
    quickSort(arr);
  }
}
