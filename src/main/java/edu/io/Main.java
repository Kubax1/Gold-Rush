package edu.io;
import edu.io.token.GoldToken;
import edu.io.token.PlayerToken;
import java.util.Scanner;
public class Main {
    public static void main(String[]args){
        Game game = new Game();
        Player player = new Player();
        game.join(player);
        game.start();
        boolean userMove=true;
        game.getBoard().display();
        int randomRow=(int)(Math.random() *8);
        int randomCol=(int)(Math.random() *8);
        game.getBoard().placeToken(randomCol,randomRow,new GoldToken());
        while(userMove) {
            System.out.println("Podaj ruch pionka W A S D");
            Scanner scanner = new Scanner(System.in);
            String move=scanner.nextLine().toUpperCase();
            switch(move){
                case "W":
                    player.token().move(PlayerToken.Move.UP);
                    break;
                case "A":
                    player.token().move(PlayerToken.Move.LEFT);
                    break;
                case "S":
                    player.token().move(PlayerToken.Move.DOWN);
                    break;
                case "D":
                    player.token().move(PlayerToken.Move.RIGHT);
                    break;
                default:
                    player.token().move(PlayerToken.Move.NONE);
                    break;
            }
            System.out.println("Current gold"+player.gold());
            game.getBoard().display();
        }
        }
}

