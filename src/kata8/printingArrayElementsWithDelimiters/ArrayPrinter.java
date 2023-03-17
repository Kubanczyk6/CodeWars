package kata8.printingArrayElementsWithDelimiters;

public class ArrayPrinter {
    public static String printArray(Object array[]) {
        StringBuilder result = new StringBuilder();
        for (Object o : array) {
            result.append(o).append(",");
        }
        return result.substring(0,result.length()-1);
    }
}
