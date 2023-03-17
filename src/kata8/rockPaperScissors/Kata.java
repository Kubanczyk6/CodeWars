package kata8.rockPaperScissors;

public class Kata {
    public static String rps(String p1, String p2) {
        if (p1.equals(p2)) {
            return "Draw!";
        }

        if ("scissors".equals(p1)) {
            switch (p2) {
                case "rock":
                    return "Player 2 won!";
                case "paper":
                    return "Player 1 won!";
            }
        }
        if ("rock".equals(p1)) {
            switch (p2) {
                case "paper":
                    return "Player 2 won!";
                case "scissors":
                    return "Player 1 win!";
            }
        }
        if ("paper".equals(p1)) {
            switch (p2) {
                case "scissors":
                    return "Player 2 won!";
                case "rock":
                    return "Player 1 win!";
            }
        }
        return"";
    }
}
