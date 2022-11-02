package oct29;

import java.util.Scanner;

public class SwitchClass {


    public static void main(String[] args) {
        System.out.println("Switch Class");

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the month number");
        int monthNo = sc.nextInt();

        switch (monthNo) {

            case 1:
                System.out.println("31");
                break;

            case 2:
                System.out.println("30");
                break;

            case 3:
                System.out.println("28");
                break;

            default:
                System.out.println("Invalid13");
        }
    }
}