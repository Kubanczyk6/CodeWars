package kata7.niceArray;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Kata {
    public static void main(String[] args) {
        System.out.println(isNice(new Integer[]{1, 2, 3, 4, 5}));
    }

    public static boolean isNice(Integer[] arr) {
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        List<Integer> collect = Arrays.stream(arr).distinct().toList();

        for (int i = 1; i < collect.size(); i++) {
            if(i==collect.size()-1&&collect.get(i)-collect.get(i-1)!=1){
                return false;
            }
            if(i==1&&collect.get(i)-collect.get(0)!=1){
                return false;
            }
            if(collect.get(i)-collect.get(i-1)!=1&&collect.get(i+1)-collect.get(i)!=1){
                return false;
            }
        }
        return collect.size()>1;
    }
}
