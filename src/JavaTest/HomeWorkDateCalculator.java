package JavaTest;

import java.util.Scanner;

/**
 * Created by SA.LIVE on 27.08.2016.
 */
public class HomeWorkDateCalculator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please, input amount of days: ");
        int inputedDays = input.nextInt();
        int years = (inputedDays / 365) % 30;
        int month = (inputedDays / 30) % 30;
        if (month >= 12) {
            month = month % 12;
        }
        int days = (inputedDays %365) % 30;

        System.out.println("years = " + years);
        System.out.println("month = " + month);
        System.out.println("days = " + days);
    }
}