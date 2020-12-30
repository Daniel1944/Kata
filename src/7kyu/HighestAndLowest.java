/**
In this little assignment you are given a string of space separated numbers, and have to return the highest and lowest number.

Example:

highAndLow("1 2 3 4 5")  // return "5 1"
highAndLow("1 2 -3 4 5") // return "5 -3"
highAndLow("1 9 3 4 -5") // return "9 -5"

Notes:

    All numbers are valid Int32, no need to validate them.
    There will always be at least one number in the input string.
    Output string must be two numbers separated by a single space, and highest number is first.

 */
import java.util.Arrays;
import static java.util.Arrays.sort;

public class HighestAndLowest {

  public static String highAndLow(String numbers) {
        String[] arr = numbers.split(" ");
        int[] array = Arrays.stream(arr).mapToInt(Integer::parseInt).toArray();
        sort(array);
        String max = Integer.toString(array[array.length - 1]);
        String min = Integer.toString(array[0]);
    return max + " " + min;
  }
}