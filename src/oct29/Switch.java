package oct29;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        System.out.println("Switch Class");

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the month number");
        int monthNo = sc.nextInt();

        if (monthNo == 1 || monthNo == 3 || monthNo == 5) {
            System.out.println("31 Days");
        }

        else if (monthNo == 4 || monthNo == 6) {
            System.out.println("30 Days");
        }

        else {
            System.out.println("28days");
        }

    }
}
