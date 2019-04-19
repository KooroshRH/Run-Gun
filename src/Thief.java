public class Thief {
    private int xCoordinate;
    private int yCoordinate;
    private char[][] map;

    public Thief(int x, int y, char[][] map){
        xCoordinate = x;
        yCoordinate = y;
        this.map = map;
    }

    public int getxCoordinate() {
        return xCoordinate;
    }

    public void setxCoordinate(int xCoordinate) {
        this.xCoordinate = xCoordinate;
    }

    public int getyCoordinate() {
        return yCoordinate;
    }

    public void setyCoordinate(int yCoordinate) {
        this.yCoordinate = yCoordinate;
    }

    public void commonMove(){

    }

    public void intelligentMove(){

    }
}
