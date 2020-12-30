/**
Given a string of words, you need to find the highest scoring word.

Each letter of a word scores points according to its position in the alphabet: a = 1, b = 2, c = 3 etc.

You need to return the highest scoring word as a string.

If two words score the same, return the word that appears earliest in the original string.

All letters will be lowercase and all inputs will be valid.
 */
import java.util.*;

public class Kata {
  
     public static String high(String s) {
        char[] sentence = s.toCharArray();
        ArrayList<Integer> list = new ArrayList<>();
        char[] alphabet = {' ', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        int sum = 0;
        for (int i = 0; i < sentence.length; i++) {
            for (int j = 0; j < alphabet.length; j++) {
                if (alphabet[j] == sentence[i] & i == sentence.length - 1) {
                    sum = j + sum;
                    list.add(sum);
                } else if (alphabet[j] == sentence[i]) {
                    sum = j + sum;
                } else if (sentence[i] == alphabet[0]) {
                    list.add(sum);
                    sum = 0;
                }
            }
        }
        list.removeAll(Collections.singletonList(0));
        String[] words = s.split("\\W+");
        int max = 0;
        int position = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > max) {
                max = list.get(i);
                position = i;
            }
        }
        return words[position];
    }
  }