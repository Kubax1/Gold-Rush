package edu.io;

import edu.io.token.Label;
import edu.io.token.Token;

public class Board {

    public static int size=8;
    private static Token[][] grid = new Token[size][size];

    public Board(){
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[i].length;j++){
                grid[i][j]=new Token(Label.EMPTY_TOKEN_LABEL);//rows are first value ,columns are second value if properly understood
            }
        }
    }
    public void clean(){
        Token t= new Token(Label.EMPTY_TOKEN_LABEL);
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[i].length;j++){
                grid[i][j]=t;//rows are first value ,columns are second value if properly understood
            }
        }
    }
    public static void placeToken(int row, int col, Token t){
        grid[row][col]=t;
    }
    public Token square(int row,int col){
        return grid[row][col];
    }

    public void display(){
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[i].length;j++){
                System.out.print(grid[i][j].label());
            }
            System.out.println();
        }
    }
    public record Coords(int col,int row){}

}
