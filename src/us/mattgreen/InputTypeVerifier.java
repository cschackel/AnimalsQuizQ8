package us.mattgreen;

import java.text.ParseException;

public class InputTypeVerifier {

    public static int verifyInt(String inputString) throws ParseException
    {
        int outputInt = Integer.parseInt(inputString);
        return outputInt;
    }

    public static int verifyPositiveInt(String inputString) throws ParseException, Exception
    {
        int outputInt = Integer.parseInt(inputString);
        if(outputInt<0)
        {
            throw new Exception("Negitive #");
        }
        return outputInt;
    }

    public static String verifyString(String inputString) throws IllegalArgumentException //Just Being Through!
    {
        String outputString = inputString;
        return outputString;
    }

    public static boolean verifyBoolean(String inputString) throws NumberFormatException
    {
        boolean outputBoolean;
        if(inputString.trim().toLowerCase().equals("true")||inputString.trim().toLowerCase().equals("false"))
        {
            outputBoolean= inputString.toLowerCase().trim().equals("true");
        }
        else if(inputString.trim().toLowerCase().equals("y")||inputString.trim().toLowerCase().equals("n"))
        {
            outputBoolean=inputString.trim().toLowerCase().equals("y");
        }
        else if(Integer.parseInt(inputString.toLowerCase().trim())==1||Integer.parseInt(inputString.toLowerCase().trim())==0)
        {
            outputBoolean = Integer.parseInt(inputString.toLowerCase().trim())==1;
        }
        else
        {
            throw new NumberFormatException("Not 1, 0, true, or false");
        }
        return outputBoolean;
    }
}
