package kata8.howOldWill;

public class AgeDiff {
    public static String CalculateAge(int birth, int yearTo) {
        String years = Math.abs(yearTo-birth)==1?"year":"years";
        return yearTo-birth>0? "You are "+(yearTo-birth)+" "+years+ " old.":yearTo==birth?"You were born this very year!":"You will be born in "+(birth-yearTo)+" "+years+".";
    }
}
