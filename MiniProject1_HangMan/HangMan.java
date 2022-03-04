package MiniProject1_HangMan;
import java.util.Scanner;

public class HangMan {

    public static void main( String[] args)
    {
        String[] city_list = {"Saopaulo", "Bahia", "Riodejaneiro", "Minasgerais"};
        String rand_city;
        char[] hidden_city;
        String wrong_list = "";
        Scanner keyboard = new Scanner(System.in);
        String user_guess;
        int points = 0;
        boolean letter_found = false, solved = false;

        rand_city = city_list[(int)(Math.random() * city_list.length)];
        hidden_city = new char[rand_city.length()];
        for (int i = 0; i < rand_city.length(); i++)
        {
           hidden_city[i] = '_';
        }

        System.out.println("WELCOME TO HANGMAN GAME - CITIES");

        while (points < 11 && ! solved) {
            System.out.print("\n");
            System.out.print("\nCity: \t");
            for (int i = 0; i < rand_city.length(); i++) {
                System.out.print(hidden_city[i] + " ");
            }
            System.out.print("\n");
            System.out.print("\nGuess a letter: ");
            user_guess = keyboard.next();
            letter_found = false;


            System.out.print("\n");
            System.out.print("\nYou have " + (10 - points) + " chances to win.");
            if (wrong_list != "") {
                System.out.print("\nwrong choices: " + wrong_list);
                System.out.print("\n");
            }

            for (int i = 0; i < rand_city.length(); i++) {
                if (user_guess.charAt(0) == rand_city.charAt(i)) {
                    hidden_city[i] = rand_city.charAt(i);
                    letter_found = true;
                }
            }

            if (letter_found == false) {
                points++;
                wrong_list = wrong_list + "  " + user_guess.charAt(0);
            }

            /*** verify if the city was found */
            int hidden_count = 0;
            for (int i = 0; i < rand_city.length(); i++) {
                if (hidden_city[i] == '_')
                    hidden_count++;
            }
            if (hidden_count > 0) {
                solved = false;

            }
            else
                solved = true;
        }

        if (solved)
            System.out.println( "\n\nYES, YOU GOT IT! The city is..." + rand_city);
        else
            System.out.println( "\n\nNO, YOU LOST. The city was..." + rand_city);
    }

}


