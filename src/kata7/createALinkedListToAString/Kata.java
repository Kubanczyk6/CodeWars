package kata7.createALinkedListToAString;

public class Kata {
    public static void main(String[] args) {
        System.out.println(stringify(new Node(1, new Node(2, new Node(3)))));
    }

    public static String stringify(Node list) {
        StringBuilder result = new StringBuilder();
        while (list != null) {
            int data = list.getData();
            list = list.getNext();

            result.append(data).append(" -> ");
        }
        return result + "null";
    }
}
