package kata7.sortTheGiftCode;

import java.util.Arrays;
import java.util.stream.Collectors;

public class GiftSorter {
    public String sortGiftCode(String code){
        return Arrays.stream(code.split("")).sorted().collect(Collectors.joining());
    }
}
