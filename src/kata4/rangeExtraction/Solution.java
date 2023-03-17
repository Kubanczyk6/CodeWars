package kata4.rangeExtraction;

public class Solution {

    public static void main(String[] args) {
        System.out.println(rangeExtraction(new int[]{-6, -5, -3, -2, -1, 0, 1, 3, 4, 5, 7, 8, 9, 10, 11, 14, 15, 17, 19, 20}));
    }

    public static String rangeExtraction(int[] arr) {


        StringBuilder result = new StringBuilder();

        for (int i = 0; i < arr.length; i++) {
            if (i > 0 && i < arr.length - 1) {
                if (i > 1 && arr[i] - arr[i - 2] == 2 && arr[i + 1] - arr[i] != 1) {
                    result.append("-").append(arr[i]).append(",");
                    continue;
                } else if (arr[i + 1] - arr[i] == 1) {
                    if (arr[i] - arr[i - 1] != 1) {
                        result.append(arr[i]);
                        if (i < arr.length - 2 && arr[i] - arr[i - 1] != 1 && arr[i + 1] - arr[i] == 1 && arr[i + 2] - arr[i] != 2 || i == arr.length - 2 && arr[i] - arr[i - 1] != 1) {
                            result.append(",");
                        }
                        continue;
                    } else {
                        continue;
                    }
                }
                if (arr[i] - arr[i - 1] != 1 && arr[i + 1] - arr[i] == 1 && arr[i + 2] - arr[i] != 2) {
                    result.append(",");
                }
            }
            if (i > 1 && arr[i] - arr[i - 2] == 2 && i == arr.length - 1) {
                result.append("-").append(arr[i]);
                continue;
            }
            if (i < arr.length - 1 && arr[i + 1] - arr[i] != 1) {
                result.append(arr[i]).append(",");
                continue;
            }
            result.append(arr[i]);
            if (i < arr.length - 2 && arr[i + 1] - arr[i] == 1 && arr[i + 2] - arr[i] != 2) {
                result.append(",");
            }
        }
        return result.toString();
    }
}
