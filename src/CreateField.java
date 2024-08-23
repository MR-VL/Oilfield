import Robot.Robot;

import java.util.Arrays;
import java.util.Random;

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

    public int getTopRight() {
        return topRight;
    }

    public void setTopRight(int topRight) {
        this.topRight = topRight;
    }

    public int getTopLeft() {
        return topLeft;
    }

    public void setTopLeft(int topLeft) {
        this.topLeft = topLeft;
    }

    public int getBottomLeft() {
        return bottomLeft;
    }

    public void setBottomLeft(int bottomLeft) {
        this.bottomLeft = bottomLeft;
    }

    int width;
    int topRight;
    int topLeft;
    int bottomLeft;

    public CreateField(int spaces, int height) {
        this.totalSpaces = spaces;
        this.height = height;
        this.width = totalSpaces / height;
        this.topRight = width;
        this.topLeft = 0;
        this.bottomLeft = 0;
    }

    public void placeRobot(){
        Random random = new Random();
        int[] coordinate = new int[2];
        coordinate[0] = random.nextInt(height-1);
        coordinate[1] = random.nextInt(width-1);
        Robot robot = new Robot(coordinate);
        displayCoordinates(robot.getCoordinates());
    }

    public void displayCoordinates(int[] coordinates){
        System.out.println("Robot Coordinates: " + Arrays.toString(coordinates));
    }

    public void create(){
        placeRobot();

        for (int i = 0; i< height; i++){
            for(int j = 0; j < width; j++){
                System.out.print("  *  ");
            }
            System.out.println("\n");
        }
    }


}
