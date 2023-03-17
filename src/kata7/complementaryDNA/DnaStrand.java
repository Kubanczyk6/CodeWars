package kata7.complementaryDNA;

public class DnaStrand {
    public static void main(String[] args) {
        System.out.println(makeComplement("AAAA"));

    }

    private static String makeComplement(String dna){
char[] arr = dna.toCharArray();
        for (int i = 0; i < dna.length(); i++) {
            if(dna.charAt(i)=='T'){
                arr[i]='A';
            } else if(dna.charAt(i)=='A'){
                arr[i]='T';
            } else if(dna.charAt(i)=='C'){
                arr[i]= 'G';
            } else if(dna.charAt(i)=='G'){
                arr[i] = 'C';
            }
        }

        String newString = "";
        for (char c : arr) {
            newString+=String.valueOf(c);
        }
        return newString;
    }
}
