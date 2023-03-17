package kata8.swapValues;

import java.util.Arrays;

public class Swapper {

    public Object[] arguments;

    public Swapper(final Object[] args){
        arguments=args;
    }

    public void swapValues() {
        Object temp = arguments[0];
        arguments[0] = arguments[1];
        arguments[1] = temp;
    }

    public static void main(String[] args) {
        Swapper swapper = new Swapper(new Object[]{1,2});
        swapper.swapValues();
        System.out.println(swapper.arguments[0]);
        System.out.println(swapper.arguments[1]);
    }

    @Override
    public String toString() {
        return "Swapper{" +
                "arguments=" + Arrays.toString(arguments) +
                '}';
    }
}
