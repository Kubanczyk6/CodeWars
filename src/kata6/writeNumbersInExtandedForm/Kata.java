package kata6.writeNumbersInExtandedForm;

import java.util.LinkedList;
import java.util.List;

public class Kata {
    public static void main(String[] args) {
        System.out.println(expandedForm(70304));
    }
    public static String expandedForm(int num)
    {
     String num1 = String.valueOf(num);
        List<String> list=new LinkedList<>();

        for (int i = 0; i < num1.length(); i++) {
            int sum=(int)(Integer.parseInt(String.valueOf(num1.charAt(i)))*Math.pow(10, num1.length()-i-1));
            String result = String.valueOf(sum);
            list.add(result);
        }
       list.removeIf("0"::equals);

        return String.join(" + ", list);
    }
}
