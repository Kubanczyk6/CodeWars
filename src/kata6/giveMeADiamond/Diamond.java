package kata6.giveMeADiamond;

public class Diamond {
    public static void main(String[] args) {
        System.out.println(print(9));
    }

    public static String print(int n) {
        System.out.println(n);
        StringBuilder result = new StringBuilder();
        for (int i = 0, j = -1, k = n / 2 + 1; i < n; i++) {
            if (i <= n / 2) {
                j += 2;
                k--;
                result.append(" ".repeat(k)).append("*".repeat(j)).append("\n");
            } else {
                k++;
                j -= 2;
                result.append((" ".repeat(k))).append("*".repeat(j)).append("\n");
            }
        }
        return n%2==0||n<=0?null: result.toString();
    }
}
