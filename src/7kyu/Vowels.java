/**
Return the number (count) of vowels in the given string.

We will consider a, e, i, o, u as vowels for this Kata (but not y).

The input string will only consist of lower case letters and/or spaces.
 */
public class Vowels {

  public static final char[] VOWELS = {'a', 'e', 'i', 'o', 'u'};
    
    public static char[] getVowels() {
        return VOWELS;
    }

    public static boolean isVowel(char c) {
        boolean isVowel = false;
        for (int i = 0; i < getVowels().length; i++) {
            if (getVowels()[i] == c) {
                isVowel = true;
                break;
            }
        }
        return isVowel;
    }

    public static int getCount(String str) {
        int vowelsCount = 0;

        for (int index = 0; index < str.length(); index++) {
            char c = str.charAt(index);
            if (isVowel(c))
                vowelsCount++;
        }
        return vowelsCount;
    }

}