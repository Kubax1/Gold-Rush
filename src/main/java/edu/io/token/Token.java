package edu.io.token;

public abstract class Token { //add abstract czyli klasa sluzaca jako wzorzec dla innych klas i nie mozna stworzyc obiektu tej klasy bezposrednio
    private final String label; //czy program ma przechodzic wszystkie poprzednie testy?

    public Token(String label){
        this.label=label;
    }
    public String label(){
        return label;
    }
}
