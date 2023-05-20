package me.RatkaiKristof;

import java.util.Random;

public class Harcos {
    private int eletero;
    private char nev;

    public Harcos(){
        Random rnd = new Random();
        this.eletero = rnd.nextInt(6)+4;
        nev = 'H';
    }
    public int getEletero() {
        return eletero;
    }
    public void setEletero(int eletero) {
        this.eletero = eletero;
    }

    public char getNev() {
        return nev;
    }

    public void setNev(char nev) {
        this.nev = nev;
    }

}
