package oct22;

public class ForLoop {
    public static void main(String[] args) {
        int sum = 0;

        for (
                int a = 90; a <= 100; a++) {
            sum = sum + a;
            if (a % 3 == 0)
                System.out.println(a);
        }
    }
}