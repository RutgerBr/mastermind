package school.oose.dea;

public class MastermindGame
{
    private ColorCombination secretCode;
    private boolean won = false;
    public MastermindGame()
    {
        secretCode = new ColorCombination();
    }

    public void checkCombination(String guessAsString)
    {
        new ColorCombination(guessAsString);
        var hint = new ColorCombination(guessAsString).compareWith(guessAsString);

        if (this.secretCode.getSecretCode().equals(guessAsString))
        {
            won = true;
            System.out.println("YOU WON");
        }
        else
        {
            System.out.println(hint.getCorrect() + " " + hint.getSemiCorrect());
        }
    }

    public boolean getWon()
    {
        return won;
    }
}
