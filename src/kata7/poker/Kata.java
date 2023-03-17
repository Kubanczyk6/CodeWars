package kata7.poker;

public class Kata {
    public static void main(String[] args) {
        System.out.println(checkIfFlush(new String[]{"QD", "4D", "10D", "KD", "5D"}));

    }
    public static boolean checkIfFlush(String[] cards){
       if(cards[0].endsWith("H")){
           for (String card : cards) {
               if(!card.endsWith("H")){
                   return false;
               }
           }
       }       if(cards[0].endsWith("S")){
           for (String card : cards) {
               if(!card.endsWith("S")){
                   return false;
               }
           }
       }       if(cards[0].endsWith("D")){
           for (String card : cards) {
               if(!card.endsWith("D")){
                   return false;
               }
           }
       }       if(cards[0].endsWith("C")){
           for (String card : cards) {
               if(!card.endsWith("C")){
                   return false;
               }
           }
       }
return true;
    }
}
