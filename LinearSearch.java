class LinearSearch {
  static int linearSearch(int[] arr, int key) {
    for (int i = 0; i < arr.length; i++)
      if (arr[i] == key)
        return i;

    return -1;
  }

  public static void main(String[] args) {
    int[] arr = { 15, 26, 78, 59, 20, 41 };
    int result = linearSearch(arr, 102);
    if (result == -1)
      System.out.println("Element specified is not present in the array...");
    else
      System.out.println("Element is present at the index " + result + " in the array...");
  }
}