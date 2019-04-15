public class Thief {
    private int xCoordinate;
    private int yCoordinate;
    private Map map;

    public void Thief(int x, int y, Map map){
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

    public Map getMap() {
        return map;
    }

    public void setMap(Map map) {
        this.map = map;
    }

}
