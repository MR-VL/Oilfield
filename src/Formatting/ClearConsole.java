package Formatting;

import Exception.ConsoleClsError;
public class ClearConsole {
    public ClearConsole() throws ConsoleClsError {
        try
        {
            final String os = System.getProperty("os.name");

            if (os.contains("Windows"))
            {
                Runtime.getRuntime().exec("cls");
            }
            else
            {
                Runtime.getRuntime().exec("clear");
            }
        }
        catch (final Exception e)
        {
           throw new ConsoleClsError("CRITICAL ERROR while attempting to clear console.");
        }
    }

}