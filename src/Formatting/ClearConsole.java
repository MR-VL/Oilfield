package Formatting;

import Exception.ConsoleClsError;
public class ClearConsole {
    public ClearConsole() throws ConsoleClsError {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

}