package kata7.descendingOrder;


public class DescendingOrder {

    public static void main(String[] args) {
        System.out.println(sortDesc(4324239));
    }
    private static int sortDesc(int num) {
        String a = String.valueOf(num);
        char[] arr = a.toCharArray();

        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length - i; j++) {
                char temp = arr[j - 1];
                if (Integer.parseInt(String.valueOf(arr[j])) > Integer.parseInt(String.valueOf(arr[j - 1]))) {
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        String result = "";
        for (char c : arr) {
            result += c;
        }
        return Integer.parseInt(result);
    }
}
