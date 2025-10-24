package edu.io;
import edu.io.token.GoldToken;
import edu.io.token.PlayerToken;
import edu.io.token.Token;

public class Player {
    private PlayerToken token;
    private double gold=0.0;

    public void assignToken(PlayerToken playerToken) {
        token = playerToken;
    }
    public PlayerToken token() {
        return token;
    }

    public double gold() {
        return gold;
    }

    public double gainGold(double gold) {
        if(this.gold + gold>=0) this.gold+=gold;
        else throw new IllegalArgumentException("Can't be negative gold");
        return this.gold;
    }

    public double loseGold(double gold) {
        if(this.gold - Math.abs(gold)>=0) this.gold-=gold; //thanks to math.abs avoid situation like -- which equals to +
        else throw new IllegalArgumentException("Can't be negative gold");
        return this.gold;
    }

    public Token interactWithToken(Token token) {
        if (token instanceof GoldToken gold) { //check if specific token really is GoldToken
            this.gainGold(gold.amount()); //change token to goldToken which has amount
        }
        return token;
    }
}