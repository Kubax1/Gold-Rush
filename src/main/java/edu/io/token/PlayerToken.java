package edu.io.token;
import edu.io.Board;
import edu.io.Board.Coords;
import edu.io.Player;

public class PlayerToken extends Token {
    private Board board;
    private int row;
    private int col;
    private Player player;
    public enum Move{
        NONE,
        LEFT,
        RIGHT,
        UP,
        DOWN
    }
    public PlayerToken(Board board){
        super(Label.PLAYER_TOKEN_LABEL);
        this.board=board;
        this.row=0;
        this.col=0;
        board.placeToken(col, row, this);
    }
    public PlayerToken(Player player,Board board){
        super(Label.PLAYER_TOKEN_LABEL);
        this.board=board;
        board.getAvailableSquare();
        board.placeToken(col, row, this);
        this.player=player;
    }

    public void move(Move dir){
        int previousRow=row;
        int previousCol=col;
        switch(dir){
            case Move.NONE:
                break;
            case Move.LEFT:
                col-=1;
                break;
            case Move.RIGHT:
                col+=1;
                break;
            case Move.DOWN:
                row+=1;
                break;
            case Move.UP:
                row-=1;
                break;
        }
        if(col<0 || row<0 || col>board.size()-1 || row>board.size()-1) {//-1 because indexes from 0
            row=previousRow;
            col=previousCol;
            throw new IllegalArgumentException("Can't move outside the board");
        }

        player.interactWithToken(board.peekToken(col,row)); //manage gold

        board.placeToken(col,row,this);
        EmptyToken et=new EmptyToken();
        board.placeToken(previousCol,previousRow,et);
    }
    public Coords pos(){
        return new Coords(col,row);
    }
}
