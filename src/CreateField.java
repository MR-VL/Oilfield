import Robot.Robot;

import java.util.Random;
import java.util.Scanner;

public class CreateField {
    int totalSpaces;
    int height;

    public int getTotalSpaces() {
        return totalSpaces;
    }

    public void setTotalSpaces(int totalSpaces) {
        this.totalSpaces = totalSpaces;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }


    int width;

    Robot robot = new Robot();

    public CreateField(int spaces, int height) {
        this.totalSpaces = spaces;
        this.height = height;
        this.width = totalSpaces / height;

    }

    public void placeRobot(){
        Random random = new Random();
        robot.setLr(random.nextInt(width-1));
        robot.setUd(random.nextInt(height-1));
        create();
    }

    public void displayCoordinates(){
        System.out.println("Robot Coordinates: [" + (robot.getUd()+1) + " , " +  (robot.getLr()+1) + "]");
    }

    public void create(){
        displayCoordinates();
        for (int i = 0; i< height; i++){
            for(int j = 0; j < width; j++){
                if(i == robot.getUd() && j == robot.getLr()){
                    System.out.print("  &  ");
                }
                else {
                    System.out.print("  *  ");
                }
            }
            System.out.println("\n");
        }
    }

    public void getNextMove(){
        System.out.println("Enter a direction to move the robot in: (W, A, S, D)");
        Scanner input = new Scanner(System.in);
        char direction = input.next().charAt(0);
    }

}


/*
*   $ $ $ $
*   $ $ $ $
*   $ $ $ $
*   $ & $ $
*
* pos (3,1)
*
* x = 3 y = 1
*
* */