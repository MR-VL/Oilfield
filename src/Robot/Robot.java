package Robot;

public class Robot {
    private int[] coordinates = new int[2];


    public Robot(){}
    public Robot(int[] coordinates){
        this.coordinates = coordinates;
    }

    public int[] getCoordinates(){
        return coordinates;
    }

    public void setCoordinates(int[] coordinates){
        this.coordinates = coordinates;
    }



}
