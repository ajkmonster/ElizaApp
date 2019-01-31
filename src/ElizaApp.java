import java.util.Random;
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
        Scanner key = new Scanner(System.in);
        System.out.print("Hello, my name is ELiza! Tell me whats wrong? Please enter your response here or type Q to quit: ");
        input = key.nextLine();

        String[] arr={"Tell me more.", "Many of my patients tell me the same thing.", "Explain that a little.", "Why is that?"};
        String[] arr2={"Why do you say that ", "You seem to think that ",
                "So, you are concerned that "};
        while (!input.equalsIgnoreCase("Q")) {
            do {
                Random r=new Random();
                int x = r.nextInt(3);
                int y = r.nextInt(2);
                String replaceinp = input.replaceAll("I", "you");
                String replaceinp1 = replaceinp.replaceAll("me", "you");
                String replaceinp2 = replaceinp1.replaceAll("my", "your");
                String replaceinp3 = replaceinp2.replaceAll("am", "are");
                System.out.println(arr2[y] + replaceinp3);
                Scanner key2 = new Scanner(System.in);
                System.out.println("Please enter your response here or type Q to quit: ");
                input2 = key2.nextLine();
                System.out.println(arr[x]);
                System.out.println("Please enter your response here or type Q to quit: ");
                Scanner key3 = new Scanner(System.in);
                input = key3.nextLine();
            }
            while (!input.equals("Q"));
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

