//importing scanner and random
import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args)
    {
        //declaring variables
        Scanner in = new Scanner(System.in);
        Random rnd = new Random();
        int die1 = 0;
        int die2 = 0;
        int crapsRoll = 0;
        int point = 0;
        boolean done = false;
        String playAgain = "";

        //overarching do while loop for whole game
        do
        {
            do
            {
                die1 = rnd.nextInt(6) + 1;
                die2 = rnd.nextInt(6) + 1;
                crapsRoll = die1 + die2;
                System.out.println(crapsRoll);

            } while (!done);

            System.out.println("Do you want to play again Yes or No [Y/N] ");
            playAgain = in.nextLine();
        } while (playAgain.equalsIgnoreCase("Y"));
    }
}