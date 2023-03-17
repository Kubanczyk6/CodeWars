package kata6.theSuperMarketQueque;

import java.util.LinkedList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        System.out.println(solveSuperMarketQueue(new int[]{4,7,4,7,1,3,4,2,4,5,6,7,5,4,7,1,5,3,4,7,1}, 5));
    }

    public static int solveSuperMarketQueue(int[] customers, int n) {

        List<Integer> queue = new LinkedList<>();
        for (int i = 0; i < customers.length; i++) {
            queue.add(customers[i]);
        }
        int time = 0;

        while (queue.size() > 0) {
            int temp=Integer.MAX_VALUE;
            for (int i = 0; i < n && i < queue.size(); i++) {
                if (temp > queue.get(i)) {
                    temp = queue.get(i);
                }
            }
            time += temp;
            queue.remove((Integer) temp);

            for (int j = 0; j < n - 1 && j < queue.size(); j++) {

                queue.set(j, queue.get(j) - temp);
            }

        }
        return time;
    }

}



