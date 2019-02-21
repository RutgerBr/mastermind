package school.oose.dea;

import java.util.Scanner;

public class MastermindConsole
{
    public static void main( String[] args )
    {

        System.out.println("Welcome to mastermind. Try to find the secret code.");
        System.out.println("Guess please:");
        MastermindGame game = new MastermindGame();
        while (!game.getWon())
        {
            Scanner scan = new Scanner(System.in);
            String input = scan.nextLine();
            game.checkCombination(input);
        }
    }
}
