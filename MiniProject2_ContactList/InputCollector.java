package MiniProject2_ContactList;
import java.util.Scanner;

public class InputCollector {

    private InputCollector() {
    }

    public static boolean isMenu = true;

    public static String getUserInput(String prompt)
    {
        Scanner userinput = new Scanner(System.in);
        Integer userprompt;

        if (isMenu) {
            BuildMenu();
            System.out.print(prompt);
            userprompt = userinput.nextInt();

            try {
                return Integer.toString(userprompt);
             } catch (Exception exception) {
                throw new IllegalArgumentException("Input validation error! Must enter a valid number between 1 and 5.");
             }
        }
        else {
            System.out.print(prompt);
            return userinput.nextLine();
        }
    }

    private static void BuildMenu()
    {
        System.out.println("\n+====== Contact App =====+");
        System.out.println("| [1] List all contacts  |");
        System.out.println("| [2] Add new contact    |");
        System.out.println("| [3] Remove contact     |");
        System.out.println("| [4] Update contact     |");
        System.out.println("| [5] Quit program       |");
        System.out.println("+=========================+");

        isMenu = false;
    }




}
