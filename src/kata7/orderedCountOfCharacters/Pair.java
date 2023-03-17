package kata7.orderedCountOfCharacters;

public class Pair<T,U> {

    T character;
    U integer;

 public static<T,U> Pair<T,U> of(T character,U integer){
     return new Pair<>(character,integer);
 }

    private Pair(T character, U integer) {
        this.character = character;
        this.integer = integer;
    }

    @Override
    public String toString() {
        return "Pair{" +
                "character=" + character +
                ", integer=" + integer +
                '}';
    }
}
