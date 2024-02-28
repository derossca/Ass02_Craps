//importing scanner and random
import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args)
    {
        //declaring variables
        Scanner in = new Scanner(System.in);
        Random rnd = new Random(); //created random object called rnd
        int die1 = rnd.nextInt(6) + 1;
        int die2 = rnd.nextInt(6) + 1;
        int crapsRoll = die1 + die2;
        int point = crapsRoll;
        boolean done = false;
        String continueYN = "";
        String trash = "";

        //do while loop that loops the whole game
        do
        {
            //display roll of die together
            System.out.println(crapsRoll);
            switch (crapsRoll){
                case 2,3,12:
                    System.out.println("Craps you lose!!!");
                    break;
                case 7,11:
                    System.out.println(("Natural, you win!!!"));
                    break;
                case 4,5,6,8,9,10:
                    System.out.println("Do you want to roll for point");

                    break;

            }

            System.out.println("Do you want to continue [Y/N] ");
            continueYN = in.nextLine();
        } while(continueYN.equalsIgnoreCase("Y"));
    }
}