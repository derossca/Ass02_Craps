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
        int point = 0; //may not need *****
        boolean done = false;
        String playAgain = "";

        //overarching do while loop to loop playing game
        do
        {
            //generate random die rolls and add them together, display
            die1 = rnd.nextInt(6) + 1;
            die2 = rnd.nextInt(6) + 1;
            crapsRoll = die1 + die2;
            System.out.println(crapsRoll);

            //if else structure for the results and output
            if(crapsRoll == 2){
                System.out.println("Craps, you lose!!!");
                done = true;
            } else if (crapsRoll == 3) {
            System.out.println("Craps, you lose!!!");
                done = true;
            } else if (crapsRoll == 12){
            System.out.println("Craps, you lose!!!");
                done = true;
            } else if (crapsRoll == 7){
                System.out.println("Natural, you win!!!");
                done = true;
            } else if (crapsRoll == 11){
                System.out.println("Natural, you win!!!");
                done = true;
            } else{
                System.out.println("Roll for point");
                //need another do while to roll for point
                do{
                    die1 = rnd.nextInt(6) + 1;
                    die2 = rnd.nextInt(6) + 1;
                    point = die1 + die2;
                    System.out.println(point);
                    // if else structure for results of point roll
                    if (point == 7){
                        System.out.println("You rolled a 7, you lose!!!");
                        done = true;
                    } else if (crapsRoll == point){
                        System.out.println("Made point, you win!!!");
                        done = true;
                    } else {
                        System.out.println("Trying for point");
                        done = false;
                    }
                } while (!done);
            }

            while(true) {
                //prompt to play again
                System.out.println("Do you want to play again, Yes or No [Y/N]");
                playAgain = in.nextLine();
                if (playAgain.equalsIgnoreCase("Y") || (playAgain.equalsIgnoreCase("N"))) {
                    break;
                } else {
                    System.out.println("Incorrect input: " + playAgain);
                }
            }
        } while(playAgain.equalsIgnoreCase("Y"));
    }
}