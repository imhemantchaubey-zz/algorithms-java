import java.util.Arrays;

class BubbleSort {
  static void bubbleSort(int[] arr) {
    int n = arr.length;
    int temp;
    for (int i = 0; i < n - 1; i++)
      for (int j = 0; j < n - i - 1; j++)
      // after each iteration, the largest element among the unsorted elements is placed at the end...
        if (arr[j] > arr[j + 1]) {
          temp = arr[j];
          arr[j] = arr[j + 1];
          arr[j + 1] = temp;
        }

    System.out.println("Sorted array: " + print(arr));
  }

  private static String print(int[] arr) {
    return Arrays.toString(arr);
  }

  public static void main(String[] args) {
    int[] arr = { 15, 26, 78, 59, 20, 41 };
    bubbleSort(arr);
  }
}