package kata4.theObservedPin;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ObservedPin {
    public static void main(String[] args) {
       getPINs("369");
    }

    public static final Map<String,List<String>> digitsMap = Map.of(
            "0", List.of("0","8"),
            "1",List.of("1","2","4"),
            "2",List.of("1","2","3","5"),
            "3",List.of("2","3","6"),
            "4", List.of("1","4","5","7"),
            "5",List.of("2","4","5","6","8"),
            "6",List.of("5","6","9"),
            "7",List.of("4","7","8"),
            "8", List.of("0","7","8","9"),
            "9", List.of("6","8","9"));

    public static List<String> getPINs(String observed) {


        return null;
    } // getPINs
}
