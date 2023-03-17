import java.util.Arrays;
import java.util.OptionalInt;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        printChristmasTree('*', 3);
        String[] arr = {"KanAD", "awafd", "HGGFG"};
        int[] array = {1, 8, 5, 4, 6, 3, 9, 5};
        System.out.println(Arrays.toString(toUpperCaseFirstChar(arr)));
        pairs(array, 10);

        int red = 1;
        int green = 2;
        int blue = 3;
        int black = 4;
        int yellow = 5;
        int brown = 6;

        int colour = 100 % 6;
        System.out.println(colour);
        System.out.println(replaceVowels("Napisz program, który zamieni samogłoski w podanym zdaniu na podaną przez Ciebie liczbę zmiennoprzecinkową."));

        System.out.println(isLeapYear(2004));
        System.out.println(factorial(4));


        System.out.println(excer(16));
        fibonacci(20);

        for (int i = 1; i < 10; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(i);
            }
            System.out.println();

            for (int j = 0; j < 4; j++) {
                for (int k = 0; k < 4; k++) {
                    System.out.print("#");
                }
                System.out.println();
            }
        }
        System.out.println(Arrays.toString(odwr(new int[]{5,8,5,3,4, 2})));
        System.out.println(Arrays.toString(duplicate(new int[]{5,4,6,7,9,4,5,7,5,3,4,2,3,4,5,6})));
        System.out.println(Arrays.toString(ne(new int[]{7,9,4,3,32,7,6,4,-8}, 111, 4)));


    }


    private static void printChristmasTree(char a, int numberOfSignsAtTheBottom) {
        double height = Math.ceil((double) numberOfSignsAtTheBottom / 2);
        int numberOfSignsAtTheTop = numberOfSignsAtTheBottom % 2 == 0 ? 2 : 1;

        for (int i = 0; i < height; i++) {
            System.out.println(" ".repeat((numberOfSignsAtTheBottom - 1) / 2) + String.valueOf(a).repeat(numberOfSignsAtTheTop));
            numberOfSignsAtTheTop += 2;
            numberOfSignsAtTheBottom -= 2;
        }
    }

    private static int secondValue(int[] array) {
        int max = Arrays.stream(array).max().getAsInt();
        return Arrays.stream(array).distinct().filter(i -> i < max).max().getAsInt();
    }

    private static String[] toUpperCaseFirstChar(String[] array) {
        int index = 0;
        for (String s : array) {
            array[index] = s.toLowerCase().replaceFirst(
                    String.valueOf(s.charAt(0)).toLowerCase(),
                    String.valueOf(Character.toUpperCase(s.charAt(0))));
            index++;
        }
        return array;
    }

    private static void pairs(int[] array, int sum) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] + array[j] == sum) {
                    System.out.println(array[i] + " " + array[j]);
                }
            }
        }
    }

    private static String replaceVowels(String sentence) {
        double a = 2.5;
        String string = String.valueOf(a);

        return sentence.replaceAll("[AaĄąEeĘęIiOoÓóUuYy]", string);
    }

    private static boolean isLeapYear(int year) {
        boolean divideby400 = year % 400 == 0;
        boolean divideby100 = year % 100 == 0;
        boolean divideby4 = year % 4 == 0;

        return divideby400 || divideby4 && !divideby100;
    }

    private static int factorial(int n) {
        int first = 1;
        for (int i = 1; i <= n; i++) {
            first *= i;
        }
        return first;
    }

    private static void printPrimeNumbers(int n) {
        for (int i = 2; i <= n; i++) {
            boolean a = true;
            for (int j = 2; j <= i; j++) {
                if (i % j == 0 && i != j) {
                    a = false;
                    break;
                }
            }
            if (a) {

                System.out.println(i);
            }
        }
    }

    private static String excer(int n) {
        int first = 37;
        int second = 14;
        String result = "";
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                first += 2;
                result += first + ",";
            } else {
                second -= 3;
                result += second + ",";
            }
        }
        result = result.substring(0,result.length()-1);
        return result;
    }

    private static void fibonacci(int n){
        int first = 0;
        int second = 1;

        System.out.print(first+" "+ second);
        for (int i = 2; i < n; i++) {
            int temp=second;
            second+=first;
            first=temp;
            System.out.print(" "+second);
        }
    }

    private static int[] odwr(int[] array1){
        for (int i = 0; i < array1.length/2; i++) {
            int temp=array1[i];
            array1[i]=array1[array1.length-i-1];
            array1[array1.length-i-1]=temp;
        }
        return array1;
    }

    private static int [] duplicate(int[] array){
        Arrays.sort(array);
int counter = 0;
        for (int i = 0; i < array.length; i++) {
            if(i>0&&i!=array.length-1&& array[i]!=array[i+1]&&array[i-1]==array[i]){
                counter++;
            }
        }
        int [] duplicate = new int[counter];

        for (int i = 0, j=0; i < array.length ; i++) {
            if(i>0&&i!=array.length-1&& array[i]!=array[i+1]&&array[i-1]==array[i]){
                duplicate[j]=array[i];
                j++;
            }
        }
        return duplicate;
    }

    private static int[] ne(int[] array, int n, int desiredIndex){
        int[] newArray=new int[array.length+1];
        for (int i = 0; i < newArray.length; i++) {
            if(i<desiredIndex){
                newArray[i]=array[i];
            }else if(i==desiredIndex){
                newArray[i]=n;
            } else{
                newArray[i]=array[i-1];
            }
        }
        return newArray;
    }

}


