package kata7.toLeetSpeak;

import java.util.List;

public class Kata {
    public static void main(String[] args) {
        System.out.println(toLeetSpeak("LEET"));
    }

    static String toLeetSpeak(final String speak) {
        return speak.replace("A", "@")
                .replace("B", "8")
                .replace("C", "(")
                .replace("E", "3")
                .replace("G", "6")
                .replace("H", "#")
                .replace("I", "!")
                .replace("L", "1")
                .replace("O", "0")
                .replace("S", "$")
                .replace("T", "7")
                .replace("Z", "2");
    }
}
