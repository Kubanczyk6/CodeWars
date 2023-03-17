package kata5.maximumSubarraySum;

public class Max {
    public static void main(String[] args) {
        System.out.println(sequence(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}));
    }

    private static int sequence(int[] arr) {
        int[] array = new int[arr.length];
        int iter = 0;
        int sum = 0;
        for (int i : arr) {
                sum+=i;
                sum= Math.max(sum, 0);
            array[iter] = sum;
            iter++;
        }


        int maxSum = Integer.MIN_VALUE;

        for (int i : array) {
            if (maxSum < i) {
                maxSum = i;
            }
        }
        return arr.length > 0 ? maxSum : 0;
    }
}

