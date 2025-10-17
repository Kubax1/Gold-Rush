package edu.io;
import edu.io.token.PlayerToken;

import java.util.Scanner;
public class Main {
    public static void main(String[]args){
        Board board = new Board();
        PlayerToken playerToken = new PlayerToken(board,0,0);
        board.placeToken(0,0,playerToken);
        boolean userMove=true;

        while(userMove) {
            System.out.println("Podaj ruch pionka");
            Scanner scanner = new Scanner(System.in);
            String move=scanner.nextLine().toUpperCase();
            playerToken.move(PlayerToken.Move.valueOf(move));
            board.display();

        }
        }
}

