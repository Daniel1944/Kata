/**
Implement a function that receives two IPv4 addresses, and returns the number of addresses between them (including the first one, excluding the last one).

All inputs will be valid IPv4 addresses in the form of strings. The last address will always be greater than the first one.
Examples

ips_between("10.0.0.0", "10.0.0.50")  ==   50 
ips_between("10.0.0.0", "10.0.1.0")   ==  256 
ips_between("20.0.0.10", "20.0.1.0")  ==  246
 */
public class CountIPAddresses {

   public static long ipsBetween(String start, String end) {
        String[] startArr = start.split("\\.");
        String[] endArr = end.split("\\.");
        int rs = 0;

        if (!startArr[0].equals(endArr[0])) {
            rs += (Integer.parseInt(endArr[0]) - Integer.parseInt(startArr[0])) * 256 * 256 * 256;
        }

        if (!startArr[1].equals(endArr[1])) {
            rs += (Integer.parseInt(endArr[1]) - Integer.parseInt(startArr[1])) * 256 * 256;
        }

        if (!startArr[2].equals(endArr[2])) {
            rs += (Integer.parseInt(endArr[2]) - Integer.parseInt(startArr[2])) * 256;
        }

        rs += Integer.parseInt(endArr[3]) - Integer.parseInt(startArr[3]);

        return rs;
    }
}