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

    public void create(){
        for (int i = 0; i< height; i++){
            for(int j = 0; j < width; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }


}
