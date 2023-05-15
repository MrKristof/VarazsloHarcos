package me.RatkaiKristof;

import java.util.Random;

public class Varazslo {
    private int eletero;

    public Varazslo() {
        Random rnd = new Random();
        this.eletero = rnd.nextInt(6) + 4; //d6+3 életerő 4-9 között
    }
    public int getEletero(){
        return eletero;
    }
    public void setEletero(int eletero){
        this.eletero = eletero;
    }
    public void tamad(Harcos harcos){
        Random rnd = new Random();
        int sebzes = rnd.nextInt(6)+1;
        harcos.setEletero(harcos.getEletero()-sebzes);
    }
}
