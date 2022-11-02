package oct27;

public class NestedFor {
    public static void main(String[] args) {
        System.out.println("Nested For Loop");
        for (int i = 0; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print( j+ "   ");
            }
            System.out.println();
        }
    }

}
