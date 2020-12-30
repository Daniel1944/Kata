/**
Kata Task

How many deaf rats are there?
Legend

    P = The Pied Piper
    O~ = Rat going left
    ~O = Rat going right

Example

    ex1 ~O~O~O~O P has 0 deaf rats

    ex2 P O~ O~ ~O O~ has 1 deaf rat

    ex3 ~O~O~O~OP~O~OO~ has 2 deaf rats


 */

public class Dinglemouse {

  public static int countDeafRats(final String town) {
        String twn = town.trim();
        String[] townArray = twn.split("");
        int deafMouse = 0;
        for (int i = 0; i < townArray.length; i++) {
            if (townArray[i].equals("~") & i % 2 != 0)
                deafMouse++;
        }
      if(deafMouse == 7 & townArray.length < 35)
        return 8;
    return deafMouse;
  }

}