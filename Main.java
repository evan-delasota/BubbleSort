class Main {
  public static void main(String[] args) {
    int[] arr = {1, 5, 1, 10, 13, 9, 40, 33, 28, 15};
    
    System.out.print("Unsorted: ");
    for (int n : arr) {
      System.out.print(n + " ");
    }
    System.out.println();

    bSort(arr);
    
    System.out.print("Sorted:   ");
    for (int n : arr) {
      System.out.print(n + " ");
    }
    System.out.println();

  }
  // On average O(n^2) time complexity, O(1) space complexity
  static void bSort(int[] arr) {
    int length = arr.length;
    
    for (int i = 0; i < length - 1; ++i) {
      for (int j = 0; j < length - i - 1; ++j) {
        if (arr[j] > arr[j + 1]) {
          int temp = arr[j];
          arr[j] = arr[j + 1];
          arr[j + 1] = temp;
        }
      }
    }

  }
}