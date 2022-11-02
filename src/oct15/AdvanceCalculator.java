package oct15;

public class AdvanceCalculator {
    public static void main(String[] args) {
        System.out.println("This is a calculator");
        System.out.println(addition(10,5.1));
        System.out.println(subtraction(15.31,60.5));
        System.out.println(multiplication(5,5));
        System.out.println(division(0,1));
        System.out.println(modulus(10,3));
    }

    public static double addition(int x, double y) {
        System.out.println("The addition is = " + (x+y));
        return x+y;
        };


    public static double subtraction(double x, double y) {
        System.out.println("The Subtraction is = " + (x-y));
        return x-y;};

    public static double multiplication(double x, double y) {
        System.out.println("The Multiplication is = " + (x*y));
        return x*y;};

    public static double division(double x, double y) {
        System.out.println(" The Division is = " + (x/y));
        return x/y;};

    public static double modulus(double x, double y) {
        System.out.println(" The Modulus is = " + (x%y));
        return x%y;};
}
