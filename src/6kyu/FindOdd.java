/**
Given an array of integers, find the one that appears an odd number of times.

There will always be only one integer that appears an odd number of times.
 */
public class FindOdd {
  public static int findIt(int[] a) {
    int result = 0;
    for (int i : a) {
        result ^= i;
    }
    return result;
  }
}