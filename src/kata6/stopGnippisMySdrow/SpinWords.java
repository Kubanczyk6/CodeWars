package kata6.stopGnippisMySdrow;

public class SpinWords {
    public static void main(String[] args) {
        System.out.println(spinWords("Welcome sth"));
    }

    private static String spinWords(String sentence) {

        String[] arr = sentence.split(" ");
        StringBuilder[] array = new StringBuilder[arr.length];
        int i = 0;
        for (String s : arr) {
            for (StringBuilder stringBuilder : array) {
                if (stringBuilder == null) {
                    array[i] = new StringBuilder(s);
                    i++;
                    break;
                }
            }
        }
        String result = "";
        int j=0;
        for (StringBuilder stringBuilder : array) {
            if (stringBuilder.length() > 4) {
                stringBuilder.reverse();
            }
            j++;
            if(j== array.length){
                result += stringBuilder;
            }else{
                result += stringBuilder + " ";
            }

        }
        return result;
    }
}
