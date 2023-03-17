package kata7.fizzBuzzCuckooCklock;

public class FizzBuzz {
    public static void main(String[] args) {
        System.out.println(fizzBuzzCuckooClock("21:33"));
    }

    public static String fizzBuzzCuckooClock(String time) {
        String[] array = time.split(":");
        String[] split = array[0].split("");
        int a = "0".equals(split[0])?Integer.parseInt(split[1]):Integer.parseInt(array[0])>12?Integer.parseInt(array[0])-12:Integer.parseInt(array[0]);
        String fullHour = "Cuckoo ".repeat(a).trim();
        String halfHour = "Cuckoo";
        String[] split1 = array[1].split("");
        String minutes = "0".equals(split1[0])?split1[1]:array[1];

        return "00:00".equals(time)?"Cuckoo ".repeat(12).trim():
                "00".equals(array[1])?fullHour
                :"30".equals(array[1])?halfHour
                : Integer.parseInt(minutes)%3==0&&Integer.parseInt(minutes)%5==0?"Fizz Buzz"
                :Integer.parseInt(minutes)%3==0?"Fizz"
                :Integer.parseInt(minutes)%5==0?"Buzz":"tick";
    }
}
