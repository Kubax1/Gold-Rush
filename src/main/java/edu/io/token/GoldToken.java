package edu.io.token;

public class GoldToken extends Token {
    private double amount=1.0;
    public GoldToken() {
        super(Label.GOLD_TOKEN_LABEL);
    }
    public GoldToken(double amount){
        super(Label.GOLD_TOKEN_LABEL);
        if(amount>=0) this.amount=amount;
        else throw new IllegalArgumentException("Can't be negative gold");
    }
    public double amount(){
        return amount;
    }
}
