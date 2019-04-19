public class Police {
    private int xCoordinate;
    private int yCoordinate;
    private boolean seen;
    private char[][] map;

    public Police(int x, int y, char[][] map){
        xCoordinate = x;
        yCoordinate = y;
        seen = false;
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

    public boolean isSeen() {
        return seen;
    }

    public void setSeen(boolean seen) {
        this.seen = seen;
    }

    public void commonMove(){

    }

    public void intelligentMove(){

    }

}
