import java.util.Scanner;

public class ElizaApp {
    public static void main(String[] args) {
       /*     String Str = new String("I really like this Java course");
            System.out.println("Return Value :" );

            for (String retval: Str.split(" ")) {
                System.out.println(retval);
            }*/
        //above is the split function
        String input;
        String input2;
        String input3;
        Scanner key = new Scanner(System.in);
        System.out.print("Hello, my name is ELiza! Tell me whats wrong? Please enter your response here or type Q to quit: ");
        input = key.nextLine();
        while (!input.equalsIgnoreCase("Q")) {
            String replaceinp = input.replaceAll("I", "you");
            String replaceinp1 = replaceinp.replaceAll("me", "you");
            String replaceinp2 = replaceinp1.replaceAll("my", "your");
            String replaceinp3 = replaceinp2.replaceAll("am", "are");
            System.out.println("Why do you say that " + replaceinp3);
            Scanner key2 = new Scanner(System.in);
            System.out.println("Please enter your response here or type Q to quit: ");
            input2 = key2.nextLine();
            while (!input2.equals("Q")) {
                do {

                    System.out.println("Tell me more.");
                    System.out.println("Please enter your response here or type Q to quit: ");
                    Scanner key3 = new Scanner(System.in);
                    input3 = key3.nextLine();
                    String replaceinp4 = input3.replaceAll("I", "you");
                    String replaceinp5 = replaceinp4.replaceAll("me", "you");
                    String replaceinp6 = replaceinp5.replaceAll("my", "your");
                    String replaceinp7 = replaceinp6.replaceAll("am", "are");
                    System.out.println("So, you seem to think that "+replaceinp7);
                } while (!input3.equals("Q"));
            }
        }
    }
}
//Please tell me more
//Many of my patients tell me the same thing
//It is getting late, maybe we had better quit
            //replace i with you
            //replace me with you
            //replace my with your
            //replace am with are
//You seem to think that
//So, you are concerned that
