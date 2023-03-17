package kata7.scalingSquaredStrings;

public class Scale {
    private static String scale(String strng, int k, int v){
        String r="";
        for (int i = 0; i < strng.length(); i++) {
            if(strng.charAt(i)=='/'&&strng.charAt(i+1)=='n'){

            }
            r=r+String.valueOf(strng.charAt(i)).repeat(k);
        }
return "";
    }
}
