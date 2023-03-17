package kata7.nicknameGenerator;

import java.util.List;

public class Generator {
    public static void main(String[] args) {
        System.out.println(nickname("Sam"));
    }

    public static final List<Character> vowelList = List.of('a', 'e', 'o', 'i', 'u');

    public static String nickname(String name) {
        if (name.length() < 4) {
            return "Error: Name too short";
        }
        return vowelList.contains(name.charAt(2)) ? name.substring(0, 4) : name.substring(0, 3);
    }
}
