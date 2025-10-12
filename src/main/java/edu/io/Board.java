package edu.io;

public class Board {

    public int size=8;
    private Token[][] grid = new Token[size][size];
    private final String NULL_SIGN="\u30FB";
    private final String GOLD_SIGN="\uD83D\uDCB0";
    private final String PLAYER_SIGN="\uC6C3";

    public Board(){
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[i].length;j++){
                grid[i][j]=new Token(NULL_SIGN);//rows are first value ,columns are second value if properly understood
            }
        }
    }
    public void clean(){
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[i].length;j++){
                grid[i][j]=new Token(NULL_SIGN);//rows are first value ,columns are second value if properly understood
            }
        }
    }
    public void placeToken(int row,int col,Token t){
        grid[row][col]=t;
    }
    public Token square(int row,int col){
        return grid[row][col];
    }

    public void display(){
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[i].length;j++){
                System.out.print(grid[i][j].getLabel());
            }
            System.out.println();
        }
    }


}
