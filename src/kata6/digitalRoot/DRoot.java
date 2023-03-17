package kata6.digitalRoot;

public class DRoot {
    public static void main(String[] args) {
        System.out.println(digital_root(493193));
    }

    private static int digital_root(int n){
        String []a = String.valueOf(n).split("");
        int result = 0;
        for (String s : a) {
            result+=Integer.parseInt(s);
        }
        return result<10?result:digital_root(result);
    }
}
