import java.util.Random;
import java.util.Scanner;

public class ElizaApp {
    public static void main(String[] args) {
        String input;
        Scanner key = new Scanner(System.in);
        System.out.print("Hello, my name is ELiza! Tell me whats wrong? Respond here or type Q to quit: ");
        input = key.nextLine();

        String[] arr = {"Tell me more.", "Many of my patients tell me the same thing.", "Explain that a little.", "Why is that?"};

        while (!input.equalsIgnoreCase("Q")) {
            do {
                Random r = new Random();
                int x = r.nextInt(3);
                ReplaceString(input);
                Scanner key2 = new Scanner(System.in);
                System.out.println("Respond here or type Q to quit: ");
                input = key2.nextLine();
                if (!input.equalsIgnoreCase("Q")) {
                    System.out.println(arr[x]);
                    System.out.println("Respond here or type Q to quit: ");
                    Scanner key3 = new Scanner(System.in);
                    input = key3.nextLine();
                }
            } while (!input.equalsIgnoreCase("Q"));
        }
    }
    private static void ReplaceString(String input) {
        String replace1;
        String replace2;
        String replace3;
        String replace4;
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

