public class Police {
    private int xCoordinate;
    private int yCoordinate;
    private char[][] map;

    public Police(int x, int y, char[][] map){
        xCoordinate = x;
        yCoordinate = y;
        this.map = map;
    }

    public int getxCoordinate() {
        return xCoordinate;
    }

    public int getyCoordinate() {
        return yCoordinate;
    }

    public boolean commonMove(int mapHeight, int mapWidth){
        while (true){
            int tmpXcoordinate = xCoordinate;
            int tmpYcoordinate = yCoordinate;
            if (tmpXcoordinate == mapWidth-1){
                tmpXcoordinate -= 1;
            } else if (tmpXcoordinate == 0){
                tmpXcoordinate += 1;
            } else {
                tmpXcoordinate += (int)Math.pow(-1, (int)(2*Math.random()));
            }
            if (tmpYcoordinate == mapHeight-1){
                tmpYcoordinate -= 1;
            } else if (tmpYcoordinate == 0){
                tmpYcoordinate += 1;
            } else {
                tmpYcoordinate += (int)Math.pow(-1, (int)(2*Math.random()));
            }
            if (map[tmpYcoordinate][tmpXcoordinate] == 'D'){
                map[yCoordinate][xCoordinate] = '-';
                map[tmpYcoordinate][tmpXcoordinate] = '*';
                return true;
            } else if (map[tmpYcoordinate][tmpXcoordinate] == '-' || map[tmpYcoordinate][tmpXcoordinate] == 'f'){
                map[yCoordinate][xCoordinate] = 'f';
                yCoordinate = tmpYcoordinate;
                xCoordinate = tmpXcoordinate;
                map[yCoordinate][xCoordinate] = 'P';
                break;
            }
        }
        return false;
    }

    public boolean intelligentMove(int mapHeight, int mapWidth, Thief thief){
        while (true){
            int tmpXcoordinate = xCoordinate;
            int tmpYcoordinate = yCoordinate;
            if (tmpXcoordinate <= thief.getxCoordinate()){
                tmpXcoordinate += 1;
            } else {
                tmpXcoordinate -= 1;
            }
            if (tmpYcoordinate <= thief.getyCoordinate()){
                tmpYcoordinate += 1;
            } else {
                tmpYcoordinate -= 1;
            }
            if (map[tmpYcoordinate][tmpXcoordinate] == 'D'){
                map[yCoordinate][xCoordinate] = '-';
                map[tmpYcoordinate][tmpXcoordinate] = '*';
                return true;
            } else if (map[tmpYcoordinate][tmpXcoordinate] == '-' || map[tmpYcoordinate][tmpXcoordinate] == 'f' || map[tmpYcoordinate][tmpXcoordinate] == 'P'){
                map[yCoordinate][xCoordinate] = 'f';
                yCoordinate = tmpYcoordinate;
                xCoordinate = tmpXcoordinate;
                map[yCoordinate][xCoordinate] = 'P';
                break;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "(" + xCoordinate + "," + yCoordinate + ")";
    }
}
