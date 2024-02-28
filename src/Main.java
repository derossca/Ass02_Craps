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

                if(crapsRoll == 2){
                    System.out.println("Craps, you lose!!!");
                    done = true;
                } else if (crapsRoll == 3){
                    System.out.println("Craps, you lose!!!");
                    done = true;
                } else if (crapsRoll == 7){
                    System.out.println("Natural, you win!!!");
                    done = true;
                } else if (crapsRoll == 11){
                    System.out.println("Natural, you win!!!");
                    done = true;
                } else {
                    System.out.println("Roll for point!!!");
                    die1 = rnd.nextInt(6) + 1;
                    die2 = rnd.nextInt(6) + 1;
                    crapsRoll = die1 + die2;
                }
            } while (!done);

            done = false; //resetting sentinel
            //prompt to play again with input
            System.out.println("Do you want to play again Yes or No [Y/N] ");
            playAgain = in.nextLine();
        } while (playAgain.equalsIgnoreCase("Y"));
    }
}