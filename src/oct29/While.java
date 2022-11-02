package oct29;

import java.util.Scanner;

public class While {
    public static void main(String[] args) {
        // int i = 1;
        // while (i <= 5) {
        //   System.out.println(i + " Hey You!");
        //   i++;

        System.out.println("Let's Play The Guessing Game!");

        Scanner sc = new Scanner(System.in);
        int thoughtNo = (int) (Math.random() * 10);

        while (true) {
            int guessedNo = sc.nextInt();
            if (thoughtNo == guessedNo) {
                System.out.println("You guessed right");
                break;
            } else {
                System.out.println("You lost");
            }
        }
    }
}

