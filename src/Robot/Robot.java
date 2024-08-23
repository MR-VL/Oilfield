package Robot;

public class Robot {


    private int lr;
    private int ud;


    public Robot(){}
    public Robot(int ud, int lr){
        this.lr = lr;
        this.ud = ud;
    }

    public int getUd(){
        return ud;
    }

    public void setUd(int ud){
        this.ud =ud;
    }

    public int getLr() {
        return lr;
    }

    public void setLr(int lr) {
        this.lr = lr;
    }

    public void moveRobot(int newLR, int newUD){

    }


}
