import java.io.File;
import java.text.NumberFormat;
import java.util.Locale;

public class fahrenheitToKelwin {
    public static void main(String[] args) {
        System.out.println(convert(100));
        System.out.println(contains("ava is the Jva best"));

        File file = new File("F:\\Gry\\steamapps\\common\\Bloons TD Battles 2/btdb2_game.exe");

        System.out.println(NumberFormat.getInstance(Locale.US).format(file.getFreeSpace()));

    }

    public static double convert(int fahr) {
        return (fahr - 32) / 1.8 + 273.15;
    }

    public static boolean contains(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (s.startsWith("Java", i)) {
                return true;
            }
        }
        return false;
    }
}
