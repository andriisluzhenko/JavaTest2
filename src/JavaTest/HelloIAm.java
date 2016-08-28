import java.util.Scanner;

//package JavaTest;

public class HelloIAm {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("What is your name?");
        String s = scanner.nextLine();
        System.out.println("Hello, my name is:" +s);

        System.out.print("How old are you?");
        int i = scanner.nextInt();
        System.out.println("I'm " + i + " years old");
    }
}
