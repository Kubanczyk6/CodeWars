package kata7.maximumProduct;

public class MaxProduct {
    public static void main(String[] args) {
        System.out.println(adjacentElementsProduct(new int[] {-23, 4, -5, 99, -27, 329, -2, 7, -921}));
    }
    public static int adjacentElementsProduct(int[] array) {
        int max = array[0] * array[1];
        for (int i = 1; i < array.length - 1; i++) {
            int pairs = array[i] * array[i + 1];
            max = Math.max(max, pairs);
        }
        return max;
    }
}
