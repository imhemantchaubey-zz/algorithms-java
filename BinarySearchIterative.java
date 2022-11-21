class BinarySearchIterative {
  static int binarySearch(int[] arr, int key) {
    int high = arr.length-1;
    int low = 0;
    int mid;
    while (low <= high) {
      mid = (high + low) / 2;
      if (arr[mid] == key)
        return mid;
      else if (arr[mid] > key)
        high = mid - 1;
      else
        low = mid + 1;
    }
    return -1;
  }

  public static void main(String[] args) {
    int[] arr = { 15, 26, 28, 59, 70, 91 };
    int result = binarySearch(arr, 102);
    if (result == -1)
      System.out.println("Element specified is not present in the array...");
    else
      System.out.println("Element is present at the index " + result + " in the array...");
  }
}
