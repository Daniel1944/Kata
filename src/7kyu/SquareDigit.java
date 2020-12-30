/**
Welcome. In this kata, you are asked to square every digit of a number and concatenate them.

For example, if we run 9119 through the function, 811181 will come out, because 92 is 81 and 12 is 1.

Note: The function accepts an integer and returns an integer
 */
public class SquareDigit {

  public int squareDigits(int n) {
        StringBuilder sb = new StringBuilder();
        String number = String.valueOf(n);
        int arr[] = new int [number.length()];
        for(int i = 0; i < number.length(); i++) {
            int j = Character.digit(number.charAt(i), 10);
            int rs = (int) Math.pow(j, 2);
            sb.append(rs);
        }
        String myString = sb.toString();
        int finalRs = Integer.parseInt(myString);
        return finalRs;
  }

}