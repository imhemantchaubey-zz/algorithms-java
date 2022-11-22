import java.util.Arrays;

class SelectionSort {
  static void selectionSort(int[] arr) {
    int minIndex;
    for (int i = 0; i < arr.length-1; i++) {
      minIndex = i;
      // after each iteration, minimum is placed in the front of the unsorted list...
      for (int j = i; j < arr.length; j++)
        if (arr[j] < arr[minIndex])
          minIndex = j;
      int temp = arr[i];
      arr[i] = arr[minIndex];
      arr[minIndex] = temp;
    }
    System.out.println("Sorted array: " + print(arr));
  }

  private static String print(int[] arr) {
    return Arrays.toString(arr);
  }

  public static void main(String[] args) {
    int[] arr = { 15, 26, 78, 59, 20, 41 };
    selectionSort(arr);
  }
}
