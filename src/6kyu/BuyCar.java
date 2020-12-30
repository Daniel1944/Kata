/**
Let us begin with an example:

A man has a rather old car being worth $2000. He saw a secondhand car being worth $8000. He wants to keep his old car until he can buy the secondhand one.

He thinks he can save $1000 each month but the prices of his old car and of the new one decrease of 1.5 percent per month. Furthermore this percent of loss increases of 0.5 percent at the end of every two months. Our man finds it difficult to make all these calculations.

Can you help him?

How many months will it take him to save up enough money to buy the car he wants, and how much money will he have left over?

Parameters and return of function:

parameter (positive int or float, guaranteed) startPriceOld (Old car price)
parameter (positive int or float, guaranteed) startPriceNew (New car price)
parameter (positive int or float, guaranteed) savingperMonth 
parameter (positive float or int, guaranteed) percentLossByMonth

nbMonths(2000, 8000, 1000, 1.5) should return [6, 766] or (6, 766)
 */
public class BuyCar {

   public static int[] nbMonths(double startPriceOld, double startPriceNew, int savingperMonth, double percentLossByMonth) {
        int[] arr = new int[2];
        int mth = 1;
        double sum = 0;
        if (startPriceOld > startPriceNew) {
            arr[0] = 0;
            arr[1] = (int) (startPriceOld - startPriceNew);
        } else if (startPriceOld == startPriceNew) {
            arr[0] = 0;
            arr[1] = 0;
        } else {

            while (sum < startPriceNew) {
                if (mth % 2 == 0)
                    percentLossByMonth += 0.5;
                startPriceOld = (startPriceOld - (startPriceOld / 100 * percentLossByMonth));
                startPriceNew = (startPriceNew - (startPriceNew / 100 * percentLossByMonth));

                sum += savingperMonth;
                if (sum + startPriceOld > startPriceNew) {
                    arr[0] = mth;
                    double tmp = (sum + startPriceOld) - startPriceNew;
                    arr[1] = Math.toIntExact(Math.round(tmp));
                    break;
                }
              mth++;
            }
        }
        return arr;
    }
}