package edu.io.token;
import edu.io.Board;

public class PlayerToken extends Token {
    private int row;
    private int col;
    public enum Move{
        NONE,
        LEFT,
        RIGHT,
        UP,
        DOWN
    }
    public PlayerToken(Board board){
        super(Label.PLAYER_TOKEN_LABEL);
    }
    public PlayerToken(Board board,int col,int row){
        super(Label.PLAYER_TOKEN_LABEL);
        this.row=row;
        this.col=col;
    }

    public void move(Move dir){
        EmptyToken et=new EmptyToken();
        Board.placeToken(col,row,et);
        switch(dir){
            case Move.NONE:
                break;
            case Move.LEFT:
                row-=1;
                break;
            case Move.RIGHT:
                row+=1;
                break;
            case Move.DOWN:
                col+=1;
                break;
            case Move.UP:
                col-=1;
                break;
        }
        try{
            if(row>=0 && col>=0){
                Board.placeToken(col,row,this);
            }else{
                throw new IllegalArgumentException("Can't move outside the board");
            }
        }catch(Exception e){
            //
        }
    }

    /*public Coords pos(){
        return Board.Coords;
    }

     */

}
