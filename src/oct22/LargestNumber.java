package oct22;

public class LargestNumber {
    public static void main(String[] args) {
        largestOfThree(12, 435, 10.1);
    }

    public static void largestOfThree(int a, int b, double c) {
        if (a > b && a > c) {
            System.out.println("A isz the largest" + a);
        } else if (b > a && b > c) {
            System.out.println("B is the largest" + b);
        } else {
            System.out.println("C is the largest" + c);
        }
    }
}
