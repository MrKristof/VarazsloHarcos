package me.RatkaiKristof;

import java.util.Random;

public class Varazslo {
    private int eletero;
    private char nev;
    public Varazslo() {
        Random rnd = new Random();
        this.eletero = rnd.nextInt(6) + 4; //d6+3 életerő 4-9 között
        nev = 'V';
    }
    public int getEletero(){
        return eletero;
    }
    public void setEletero(int eletero){
        this.eletero = eletero;
    }

    public char getNev() {
        return nev;
    }

    public void setNev(char nev) {
        this.nev = nev;
    }

}
