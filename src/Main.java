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
        boolean done = false;


    }
}