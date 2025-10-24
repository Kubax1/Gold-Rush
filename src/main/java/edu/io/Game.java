package edu.io;

import edu.io.token.PlayerToken;
import edu.io.token.Token;

public class Game {
    private Board board;
    private Player player;

    public Game(){
        this.board=new Board();
    }
    public Player join(Player player){
        this.player=player;
        PlayerToken playerToken=new PlayerToken(player,board);
        player.assignToken(playerToken);
        return player;
    }
    public void start(){
    }
    public Board getBoard(){
        return board;
    }
    public Player getPlayer(){
        return player;
    }
}
