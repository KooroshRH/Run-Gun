import java.util.ArrayList;
import java.util.Scanner;

public class Game {
    private ArrayList<Police> polices = new ArrayList<>();
    private char[][] map;
    private int mapWidth;
    private int mapHeight;
    private Thief thief;

    public void play(){
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Run&Gun Game");
        System.out.println("Please enter your map height: ");
        mapHeight = input.nextInt();
        System.out.println("Please enter your map width: ");
        mapWidth = input.nextInt();
        map = new char[mapHeight][mapWidth];
        makeMap();
        System.out.println("How many police you want? ");
        int policeNum = input.nextInt();
        for (int i = 0; i < policeNum; i++){
            addPolice();
        }
        addThief();
        printMap();
        System.out.print("if you are ready press any key...");
        input.nextLine();
        input.nextLine();
        boolean isThiefSeen = false;
        while (true) {
            boolean capture = false;
            cleanMap();
            isThiefSeen =
            for (Police police : polices) {
                if (police.commonMove(mapHeight, mapWidth)) {
                    capture = true;
                }
            }
            if (capture){
                printMap();
                System.out.println("Thief captured in '*' area by police!!!");
                return;
            }
            if (thief.commonMove(mapHeight, mapWidth)){
                capture = true;
            }
            try {
                Thread.sleep(2000);
            } catch (Exception e){
                e.printStackTrace();
            }
            printMap();
            if (capture){
                System.out.println("Thief captured in '*' area by police!!!");
                return;
            }
        }
    }

    public void makeMap(){
        for (int i = 0; i < mapHeight; i++){
            for (int j = 0; j < mapWidth; j++){
                map[i][j] = '-';
            }
        }
    }

    public void cleanMap(){
        for (int i = 0; i < mapHeight; i++){
            for (int j = 0; j < mapWidth; j++){
                if (map[i][j] == 'f'){
                    map[i][j] = '-';
                }
            }
        }
    }

    public void addPolice(){
        while(true){
            Police police = new Police((int)(Math.random()*mapWidth), (int)(Math.random()*mapHeight), map);
            if (map[police.getyCoordinate()][police.getxCoordinate()] == '-'){
                map[police.getyCoordinate()][police.getxCoordinate()] = 'P';
                polices.add(police);
                break;
            }
        }
    }

    public void addThief(){
        while(true){
            Thief thief = new Thief((int)(Math.random()*mapWidth), (int)(Math.random()*mapHeight), map);
            if (map[thief.getyCoordinate()][thief.getxCoordinate()] == '-'){
                map[thief.getyCoordinate()][thief.getxCoordinate()] = 'D';
                this.thief = thief;
                break;
            }
        }
    }

    public void printMap(){
        for (int i = 0; i < mapWidth*2 + 1; i++){
            System.out.print('=');
        }
        System.out.println();
        for (int i = 0; i < mapHeight; i++){
            for (int j = 0; j < mapWidth; j++){
                System.out.print('|');
                System.out.print(map[i][j]);
            }
            System.out.println('|');
        }
        for (int i = 0; i < mapWidth*2 + 1; i++){
            System.out.print('=');
        }
        System.out.println();
    }

    public boolean checkSeen(){
        for (Police police : polices){
            if (Math.abs(police.getxCoordinate() - thief.getxCoordinate()) <= 2 && Math.abs(police.getyCoordinate() - thief.getyCoordinate()) <= 2){
                return true;
            }
        }
        return false;
    }
}
