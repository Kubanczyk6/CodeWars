package kata5.rgbToHexConversion;

public class RgbToHex {
    public static void main(String[] args) {
        System.out.println(rgb(1, 2, 3));
    }

    private static String rgb(int r, int g, int b) {
        String a = "A";
        String b1 = "B";
        String c = "C";
        String d = "D";
        String e = "E";
        String f = "F";

        return concat(r) + concat(g) + concat(b);


    }

    private static String concat(int r) {
        String result1 = "";
        r = r > 255 ? 255 : Math.max(r, 0);
        switch (r / 16) {
            case 10:
                result1 += "A";
                break;
            case 11:
                result1 += 'B';
                break;
            case 12:
                result1 += "C";
                break;
            case 13:
                result1 += "D";
                break;
            case 14:
                result1 += "E";
                break;
            case 15:
                result1 += "F";
                break;
            default:
                result1 += (r / 16);
        }
        switch (r % 16) {
            case 10:
                result1 += "A";
                break;
            case 11:
                result1 += 'B';
                break;
            case 12:
                result1 += "C";
                break;
            case 13:
                result1 += "D";
                break;
            case 14:
                result1 += "E";
                break;
            case 15:
                result1 += "F";
                break;
            default:
                result1 += (r % 16);
        }
        return result1;
    }
}
