import java.util.ArrayList;
import java.util.Scanner;

public class Game {
    private ArrayList<Police> polices;
    private Map map;
    private Thief thief;

    public void play(){
        Scanner input = new Scanner(System.in);
        int height, width;
        System.out.println("Welcome to Run&Gun Game");
        System.out.println("Please enter your map height: ");
        height = input.nextInt();
        System.out.println("Please enter your map width: ");
        width = input.nextInt();
        Map map = new Map(width, height);
        System.out.println("How many police you want? ");
        int policeNum = input.nextInt();
        for (int i = 0; i < policeNum; i++){

        }
    }

    public void addPolice(Police police){
        while(true){

        }
    }

    public boolean isFill(int x, int y){

    }
}
