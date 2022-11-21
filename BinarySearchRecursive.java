class BinarySearchRecursive {
  static int binarySearch(int[] arr, int key, int low, int high) {
    if (low > high)
      return -1;
    else {
      int mid = (high + low) / 2;
      if (arr[mid] == key)
        return mid;
      else if (arr[mid] > key)
        return binarySearch(arr, key, low, mid - 1);
      else
        return binarySearch(arr, key, mid + 1, high);
    }
  }

  public static void main(String[] args) {
    int[] arr = { 15, 26, 28, 59, 70, 91 };
    int result = binarySearch(arr, 91, 0, arr.length - 1);
    if (result == -1)
      System.out.println("Element specified is not present in the array...");
    else
      System.out.println("Element is present at the index " + result + " in the array...");
  }
}
