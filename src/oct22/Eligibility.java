package oct22;

public class Eligibility {
    public static void main(String[] args) {

    }

    public static void checkEligibilty(boolean isSleeping) {
        if (!isSleeping) {
            System.out.println("Active");
        } else {
            System.out.println("Lazy");
        }
    }
}