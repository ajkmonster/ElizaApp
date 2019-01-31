import java.util.Scanner;

public class ElizaBeg {
    public static void main(String[] args) {
        String input;
        Scanner key = new Scanner(System.in);
        System.out.print("Hello, my name is ELiza! Tell me whats wrong? Please enter your response here or type Q to quit: ");
        input = key.nextLine();
        System.out.println(input);
        while (!input.equalsIgnoreCase("Q")) {
            Scanner key2 = new Scanner(System.in);
            System.out.println("Please enter your response here or type Q to quit: ");
            input = key2.nextLine();
            System.out.println(input);
            while (!input.equalsIgnoreCase("Q")) {
                do {
                    System.out.println("Please enter your response here or type Q to quit: ");
                    Scanner key3 = new Scanner(System.in);
                    input = key3.nextLine();
                    System.out.println(input);
                } while (!input.equalsIgnoreCase("Q"));
            }
        }
    }
}