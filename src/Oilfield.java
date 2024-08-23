import java.util.Scanner;
import Exception.heightErrorException;
import Exception.InvalidGridException;

import Formatting.ClearConsole;
import Exception.ConsoleClsError;
public class Oilfield
{
    public static void main(String[] args) {

        int height;
        int spaces = 0;

        try {
            spaces = getInput("Enter the total number of spaces you want on the grid: ", "Spaces");


            height = getInput("Enter the height you want the grid to be: ", "Height");

            if (height > spaces) {
                throw new heightErrorException("Error height cannot be greater than total spaces.");
            }

            try {
                boolean invalid = spaces % height != 0;
                if(invalid){
                    throw new InvalidGridException("Error: Cannot create grid with given numbers");
                }
            } catch (InvalidGridException e){
                System.out.println(e + "\n");
                spaces = getInput("Enter the total number of spaces you want on the grid: ", "Spaces");


                height = getInput("Enter the height you want the grid to be: ", "Height");

                if (height > spaces) {
                    throw new heightErrorException("Error height cannot be greater than total spaces.");
                }
            }

        } catch (heightErrorException e) {
            System.out.println(e + "\n");
            height = getInput("\nEnter the height you want the grid to be: ", "Height");
        }

        try {
            ClearConsole console = new ClearConsole();
        } catch (ConsoleClsError e) {

            throw new RuntimeException(e);
        }

        CreateField field = new CreateField(spaces, height);
        field.placeRobot();



        //field.displayCoordinates();

        //field.placeRobot();




    }

    public static int getInput(String prompt, String identifier){
        Scanner input = new Scanner(System.in);
        System.out.println(prompt);
        int num = input.nextInt();

        return validate(num, identifier);
    }

    public static int validate(int number, String type){

        while(number <=0 ){
            System.out.printf("\nError, %s must be a number greater than 0.", type);
            String prompt = "\nEnter number of " + type;
            number = getInput(prompt, type);
        }
        return number;
    }
}