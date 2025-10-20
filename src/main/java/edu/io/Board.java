package edu.io;

import edu.io.token.Token;
import edu.io.token.EmptyToken;
public class Board {

    public int size=8;
    public Token[][] grid = new Token[size][size];
    public int size(){
        return size;
    }

    public Board(){
        for(int row=0;row<grid.length;row++){
            for(int col=0;col<grid[row].length;col++){
                grid[row][col]=new EmptyToken();//rows are first value ,columns are second value if properly understood
            }
        }
    }
    public void clean(){
        Token t= new EmptyToken();
        for(int row=0;row<grid.length;row++){
            for(int col=0;col<grid[row].length;col++){
                grid[row][col]=t;//rows are first value ,columns are second value if properly understood
            }
        }
    }
    public void placeToken(int col, int row, Token t){
        grid[row][col] = t;
    }
    public Token peekToken(int col,int row){
        return grid[row][col];
    }

    public void display(){
        for(int row=0;row<grid.length;row++){
            for(int col=0;col<grid[row].length;col++){
                System.out.print(grid[row][col].label());
            }
            System.out.println();
        }
    }
    public record Coords(int col,int row){}

}
