public class Police {
    private int xCoordinate;
    private int yCoordinate;
    private Map map;
    private boolean seen;

    public void Police(int x, int y, Map map){
        xCoordinate = x;
        yCoordinate = y;
        this.map = map;
        seen = false;
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

    public Map getMap() {
        return map;
    }

    public void setMap(Map map) {
        this.map = map;
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
