import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class ElizaApp {
    public static void main(String[] args) {
        String input;
        Scanner key = new Scanner(System.in);
        System.out.print("Hello, my name is ELiza! Tell me whats wrong? Respond here or type Q to quit: ");
        input = key.nextLine();
        ArrayList<String> starter = new ArrayList<>();
        starter.add("Tell me more.");
        starter.add("Many of my patients tell me the same thing.");
        starter.add("Explain that a little.");
        starter.add("Why is that?");
        while (!input.equalsIgnoreCase("Q")) {
            do {
                Random r = new Random();
                int x = r.nextInt(3);
                ReplaceString(input);
                Scanner key2 = new Scanner(System.in);
                System.out.println("Respond here or type Q to quit: ");
                input = key2.nextLine();
                if (!input.equalsIgnoreCase("Q")) {
                    System.out.println(starter.get(x));
                    System.out.println("Respond here or type Q to quit: ");
                    Scanner key3 = new Scanner(System.in);
                    input = key3.nextLine();
                }
            } while (!input.equalsIgnoreCase("Q"));
        }
    }
    private static void ReplaceString(String input) {
        input = input.replaceAll("I", "you").replaceAll("me", "you").
                replaceAll("my", "your").replaceAll("am", "are");
        ArrayList<String> replacer = new ArrayList<> ();
        replacer.add("Why do you say that ");
        replacer.add("You seem to think that ");
        replacer.add("So, you are concerned that ");
        Random r = new Random();
        int y = r.nextInt(2);
        System.out.println(replacer.get(y) + input);
    }
}

