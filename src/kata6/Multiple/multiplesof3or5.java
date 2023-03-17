package kata6.Multiple;

public class multiplesof3or5 {
    public static void main(String[] args) {
        System.out.println(solution(10));
    }

    public static int solution(int number) {
        int sum = 0;
        for (int i = 0; i < number; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                sum += i;
            }
        }
        return sum;
    }
}
