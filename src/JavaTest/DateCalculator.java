import java.util.Scanner;

public class DateCalculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Код
        System.out.print("Введите число: ");
        int days = in.nextInt(); // Any positive number

        int year = (days -1) / 365 +1;
        int month = ((days -1) % 365) / 30 +1;
        int day = ((days -1) % 365) % 30 +1;
        System.out.println("year = " + year);
        System.out.println("month = " + month);
        System.out.println("day = " + day);
    }
}