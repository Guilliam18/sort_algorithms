

/**
 * Introsort class.
 * 
 * @author Alex Guilliams This code complies with the JMU Honor Code.
 */
public class IntroSort {

  /**
   * Sort the provided items using the introsort algorithm.
   */
  public static <T extends Comparable<T>> void introSort(T[] items) {
    introSort(items, 0, items.length - 1,
        2 * (int) Math.floor(Math.log(items.length) / Math.log(2)));
  }

  /**
   * Recursive helper method for introsort.
   * 
   * @param items The items to sort
   * @param left The starting index of the region to sort
   * @param right The ending index of the region to sort.
   */
  private static <T extends Comparable<T>> void introSort(T[] items, int left, int right,
      int maxDepth) {
    if (maxDepth == 0) {
      MergeSortsImproved.mergeSort2(items, left, right);
    } else {

      int pivotindex = QuickSort.findPivot(items, left, right);

      // curr will be the final position of the pivot item.
      int curr = QuickSort.partition(items, left, right, pivotindex);

      if ((curr - left) > 1) {
        introSort(items, left, curr - 1, maxDepth - 1); // Sort left partition
      }
      if ((right - curr) > 1) {
        introSort(items, curr + 1, right, maxDepth - 1); // Sort right partition
      }
    }
  }

}
