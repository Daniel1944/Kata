/**
Your task is to convert strings to how they would be written by Jaden Smith. The strings are actual quotes from Jaden Smith, but they are not capitalized in the same way he originally typed them.

Example:

Not Jaden-Cased: "How can mirrors be real if our eyes aren't real"
Jaden-Cased:     "How Can Mirrors Be Real If Our Eyes Aren't Real"
 */

public class JadenCase {

public String toJadenCase(String phrase) {
        // TODO put your code below this comment
        char[] phraseArr;
        if (phrase == null  || phrase.length() == 0)
            return null;
        else {
            phraseArr = phrase.toCharArray();
            for (int i = 0; i < phraseArr.length; i++) {
                if (i == 0) {
                    phraseArr[0] = Character.toUpperCase(phraseArr[0]);
                } else if (phraseArr[i] == ' ') {
                    phraseArr[i + 1] = Character.toUpperCase(phraseArr[i + 1]);
                }
            }

        }
        String returnString = new String(phraseArr);
        return returnString;
    }

}