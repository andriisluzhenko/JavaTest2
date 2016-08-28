import java.util.Scanner;

public class yearsMonthDays {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int kolvo;
        int days = 0;
        int month = 1;
        int years = 1;

        System.out.print("Введи кол-во дней: ");
        kolvo = input.nextInt();

        if(kolvo >= 365) {
            years += kolvo / 365;
            kolvo = kolvo % 365;
        }

        if(kolvo >= 30) {
            month += kolvo / 30;
            kolvo = kolvo % 30;
        }

        days = kolvo;

        // OutPut
        System.out.println("Годов: " + years);
        System.out.println("Месяцев: " + month);
        System.out.println("Дней: " + days);
    }
}