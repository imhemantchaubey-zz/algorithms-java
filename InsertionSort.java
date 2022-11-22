import java.util.Arrays;

class InsertionSort {
  static void insertionSort(int[] arr) {
    for (int i = 1; i < arr.length; i++) {
      int current = arr[i];
      int j = i - 1;
      while (j >= 0 && arr[j] > current) {
        arr[j + 1] = arr[j];
        j--;
      }
      arr[j + 1] = current;
    }
    System.out.println("Sorted array: " + print(arr));
  }

  private static String print(int[] arr) {
    return Arrays.toString(arr);
  }

  public static void main(String[] args) {
    int[] arr = { 15, 26, 78, 59, 20, 41 };
    insertionSort(arr);
  }
}
