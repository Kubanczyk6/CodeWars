package kata6.romanNumeralsEncoder;

public class Conversion {
    public static void main(String[] args) {
        System.out.println(solution(2999));
    }
    public static String solution(int n) {
        return "M".repeat(n/1000)+ (n%1000>=900?"CM": (n%1000>=500?"D"+"C".repeat((n%1000-500)/100):(n%1000>=400?"CD":(n%1000>=100?"C".repeat(n%1000/100):""))))
                + (n%1000%100>=90?"XC":(n%1000%100>=50?"L"+"X".repeat((n%1000%100-50)/10):(n%1000%100>=40?"XL":(n%1000%100>=10?"X".repeat(n%1000%100/10):""))))
                +(n%1000%100%10==9?"IX":(n%1000%100%10>=5?"V"+"I".repeat(n%1000%100%10-5):(n%1000%100%10==4?"IV":"I".repeat(n%1000%100%10))));
    }
}
