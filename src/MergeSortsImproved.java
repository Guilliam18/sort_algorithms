

/**
 * Improved MergeSort class.
 * 
 * @author Alex Guilliams This code complies with the JMU Honor Code.
 */

public class MergeSortsImproved {

  /**
   * Merge sort the provided array using an improved merge operation.
   */
  @SuppressWarnings("unchecked")
  public static <T extends Comparable<T>> void mergeSort1(T[] items) {

    T[] temp = (T[]) new Comparable[items.length / 2 + items.length % 2];

    mergeSort1(items, temp, 0, items.length - 1);
  }

  /**
   * Recursive helper method for the improved merge sort algorithm.
   * 
   * @param items The array to sort
   * @param temp Temporary array for merge operation
   * @param left Index of the left end of the region to sort
   * @param right Index of the right end of the region to sort.
   */
  private static <T extends Comparable<T>> void mergeSort1(T[] items, T[] temp, int left,
      int right) {
    if (left >= right) {
      return; // Region has one record
    }

    int mid = (left + right) / 2; // Select midpoint

    mergeSort1(items, temp, left, mid); // Mergesort first half
    mergeSort1(items, temp, mid + 1, right); // Mergesort second half

    merge1(items, temp, left, mid, right);

  }

  /**
   * Merge two sorted sub-arrays.
   */
  private static <T extends Comparable<T>> void merge1(T[] items, T[] temp, int left, int mid,
      int right) {

    int j = 0;
    for (int i = left; i <= mid; i++) {
      temp[j] = items[i];// Copy half of subarray
      j++;
    }

    int i1 = 0;
    int i2 = mid + 1;
    for (int curr = left; curr <= right; curr++) {
      if (i1 >= j) { // Left subarray exhausted
        items[curr] = items[i2++];
      } else if (i2 > right) { // Right subarray exhausted
        items[curr] = temp[i1++];
      } else if (temp[i1].compareTo(items[i2]) <= 0) { // Get smaller value
        items[curr] = temp[i1++];
      } else {
        items[curr] = items[i2++];
      }
    }
  }

  /**
   * Merge sort the provided array by using an improved merge operation and switching to insertion
   * sort for small sub-arrays.
   */
  @SuppressWarnings("unchecked")
  public static <T extends Comparable<T>> void mergeSort2(T[] items) {

    T[] temp = (T[]) new Comparable[items.length];

    mergeSort2(items, temp, 0, items.length - 1);

  }

  /**
   * Merge sort the provided sub-array using our improved merge sort. This is the fallback method
   * used by introspective sort.
   */
  @SuppressWarnings("unchecked")
  public static <T extends Comparable<T>> void mergeSort2(T[] items, int start, int end) {

    T[] temp = (T[]) new Comparable[items.length];

    mergeSort2(items, temp, start, end);
  }


  private static <T extends Comparable<T>> void mergeSort2(T[] items, T[] temp, int left,
      int right) {
    if (right - left < 60) {
      BasicSorts.insertionSort(items, left, right);
      return;
    }

    int mid = (left + right) / 2; // Select midpoint

    mergeSort2(items, temp, left, mid); // Mergesort first half
    mergeSort2(items, temp, mid + 1, right); // Mergesort second half

    merge2(items, temp, left, mid, right);
  }

  /**
   * Merge two sorted sub-arrays.
   */
  private static <T extends Comparable<T>> void merge2(T[] items, T[] temp, int left, int mid,
      int right) {

    for (int i = left; i <= right; i++) {
      temp[i] = items[i];// Copy subarray to temp
    }

    int i1 = left;
    int i2 = mid + 1;
    for (int curr = left; curr <= right; curr++) {
      if (i1 == mid + 1) { // Left subarray exhausted
        items[curr] = temp[i2++];
      } else if (i2 > right) { // Right subarray exhausted
        items[curr] = temp[i1++];
      } else if (temp[i1].compareTo(temp[i2]) <= 0) { // Get smaller value
        items[curr] = temp[i1++];
      } else {
        items[curr] = temp[i2++];
      }
    }
  }
}
