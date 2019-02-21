package school.oose.dea;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ColorCombination
{
    private String[] secretCode;
    private String guess;

    public ColorCombination(String colorCombi)
    {
        this.guess = colorCombi;

        List<String> strList  = Arrays.asList(Peg.color);
        Collections.shuffle(strList );
        secretCode = strList.toArray(new String[strList .size()]);
    }

    public ColorCombination()
    {
        List<String> strList  = Arrays.asList(Peg.color);
        Collections.shuffle(strList );
        secretCode = strList.toArray(new String[strList.size()]);
    }

    public Hint compareWith(String guessAsString)
    {
        var correct = determineRightColorRightPosition();
        var semiCorrect = determineRightColorWrongPosition();

        var hint = new Hint(correct, semiCorrect);

        return hint;
    }


    private int determineRightColorWrongPosition()
    {
        var howManyRightColorWrongPosition = 0;
        String currentPosGuess;
        var secretCodeList = Arrays.asList( secretCode );
        for (int i = 0; i <= 3; i++)
        {
            currentPosGuess = this.guess.substring(i, i + 1);
            if (secretCodeList.contains(currentPosGuess) && !secretCode[i].equals(currentPosGuess))
                howManyRightColorWrongPosition++;

        }
        return howManyRightColorWrongPosition;
    }

    private int determineRightColorRightPosition()
    {
        var howManyRightColorRightPosition = 0;
        String currentPosGuess;
        for (int i = 0; i <= 3; i++)
        {
            currentPosGuess = this.guess.substring(i, i + 1);
            if (secretCode[i].equals(currentPosGuess))
                howManyRightColorRightPosition++;

        }
        return howManyRightColorRightPosition;
    }

    public String getSecretCode()
    {
        var secretCode = "";
        for (int i = 0; i <= 3; i++)
        {
            secretCode += this.secretCode[i];
        }
        return secretCode;
    }
}
