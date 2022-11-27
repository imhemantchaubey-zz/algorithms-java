import java.util.Arrays;

class CountSort {
  static void countSort(int[] arr) {
    int max = max(arr);
    int[] count = new int[max + 1];
    getCount(arr, count);
    sort(arr, count);
    System.out.println(Arrays.toString(arr));
  }

  static void sort(int[] arr, int[] count) {
    int[] sortedArray = new int[arr.length];
    for (int i = 0; i < arr.length; i++)
      sortedArray[count[arr[i]]-- - 1] = arr[i];
    System.arraycopy(sortedArray, 0, arr, 0, arr.length);
  }

  static void getCount(int[] arr, int[] count) {
    for (int i = 0; i < arr.length; i++)
      count[arr[i]]++;
    getCumulativeCount(count);
  }

  static void getCumulativeCount(int[] count) {
    for (int i = 1; i < count.length; i++)
      count[i] += count[i - 1];
  }

  static int max(int[] arr) {
    int max = arr[0];
    for (int i = 1; i < arr.length; i++)
      if (arr[i] > max)
        max = arr[i];
    return max;
  }

  public static void main(String[] args) {
    int[] arr = { 2, 8, 2, 4, 0, 6, 8, 7, 1, 2, 4, 5, 1 };
    countSort(arr);
  }

}
