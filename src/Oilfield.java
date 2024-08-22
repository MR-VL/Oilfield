import java.util.Scanner;

public class Oilfield
{
    public static void main(String[] args) {


        int spaces = getInput("Enter the total number of spaces you want on the grid: ", "Spaces");

        int height = getInput("Enter the height you want the grid to be: ", "Height");

        if (height > spaces) throw heightError(){
            System.out.println("Error height cannot be greater than total spaces.");
        }

        System.out.println(spaces + " " + height);

        //CreateField field = new CreateField(spaces, height);
        //field.create();

    }

    public static int getInput(String prompt, String identifier){
        Scanner input = new Scanner(System.in);
        System.out.println(prompt);
        int num = input.nextInt();

        return validate(num, identifier);
    }

    public static int validate(int number, String type){

        while(number <=0){
            System.out.printf("Error, %s must be a number greater than 0.", type);
            String prompt = "Enter number of " + type;
            number = getInput(prompt, type);
        }
        return number;
    }
}