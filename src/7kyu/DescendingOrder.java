/**
Your task is to make a function that can take any non-negative integer as an argument and return it with its digits in descending order. Essentially, rearrange the digits to create the highest possible number.
Examples:

Input: 42145 Output: 54421

Input: 145263 Output: 654321

Input: 123456789 Output: 987654321
 */
import java.util.*;
public class DescendingOrder {
   public static int sortDesc(final int num) {
        int[] digits = Integer.toString(num).chars().map(c -> c - '0').toArray();
        Arrays.sort(digits);
        int res = 0;
        for (int i = digits.length - 1; i >= 0; i--) {
            res = res * 10 + digits[i];
        }
        return res;
    }
}