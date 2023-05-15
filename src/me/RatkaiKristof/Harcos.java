package me.RatkaiKristof;

import java.util.Random;

public class Harcos {
    private int eletero;
    public Harcos(){
        Random rnd = new Random();
        this.eletero = rnd.nextInt(6)+4;
    }
    public int getEletero() {
        return eletero;
    }
    public void setEletero(int eletero) {
        this.eletero = eletero;
    }
    public void tamad(Varazslo varazslo){
        Random rnd = new Random();
        int sebzes = rnd.nextInt(6)+1; //D6 sebzes 1-6
        varazslo.setEletero(varazslo.getEletero()- sebzes);
    }
}
