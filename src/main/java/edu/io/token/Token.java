package edu.io.token;

public class Token {
    private final String label; //czy program ma przechodzic wszystkie poprzednie testy?

    public Token(String label){
        this.label=label;
    }
    public String label(){
        return label;
    }
}
