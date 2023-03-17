package kata8.basicSubclasses;

import java.util.Arrays;

public class God {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(God.create()));
    }

        public static Human[] create(){

            return new Human[]{};
        }

       static class Human extends God{

        }

        static class Man extends Human{

        }

        static class Woman extends Human{

        }
    }

