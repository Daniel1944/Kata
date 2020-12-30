public class DnaStrand {
   public static String makeComplement(String dna) {
        char[] dnaArr = dna.toCharArray();
        for (int i = 0; i < dnaArr.length; i++) {
            char c = dnaArr[i];
            switch (c){
                case 'A':
                    dnaArr[i] = 'T';
                    break;
                case 'T':
                    dnaArr[i] = 'A';
                    break;
                case 'C':
                    dnaArr[i] = 'G';
                    break;
                case 'G':
                    dnaArr[i] = 'C';
                    break;
            }
        }
        dna = new String(dnaArr);
        return dna;
    }
}