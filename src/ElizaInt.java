import java.util.Random;
import java.util.Scanner;

public class ElizaInt {
    public static void main(String[] args) {
        String input;
        Scanner key = new Scanner(System.in);
        System.out.print("Hello, my name is ELiza! Tell me whats wrong? Please enter your response here or type Q to quit: ");
        input = key.nextLine();
        ReplaceString(input);
        while (!input.equalsIgnoreCase("Q")) {
            Scanner key2 = new Scanner(System.in);
            System.out.println("Please enter your response here or type Q to quit: ");
            input = key2.nextLine();
            ReplaceString(input);
            while (!input.equalsIgnoreCase("Q")) {
                do {
                    System.out.println("Please enter your response here or type Q to quit: ");
                    Scanner key3 = new Scanner(System.in);
                    input = key3.nextLine();
                    ReplaceString(input);
                } while (!input.equalsIgnoreCase("Q"));
            }
        }
    }
        private static void ReplaceString(String input){
            String replace1,replace2,replace3,replace4;
            replace1 = input.replaceAll("I", "you");
            replace2 = replace1.replaceAll("me", "you");
            replace3 = replace2.replaceAll("my", "your");
            replace4 = replace3.replaceAll("am", "are");
            String[] arr2 = {"Why do you say that ", "You seem to think that ", "So, you are concerned that "};
            Random r = new Random();
            int y = r.nextInt(2);
            System.out.println(arr2[y] + replace4);
        }
    }