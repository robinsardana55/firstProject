package oct22;

public class IfElseIf {
    public static void main(String[] args) {
        int y;
        posnegneu(y = -1);
    }

    public static void posnegneu(int y) {
        if (y == 0)
            System.out.println("Neutral");
        if (y > 0)
            System.out.println("Positive");
        else {
            System.out.println("Negative");
        }

    }
}
