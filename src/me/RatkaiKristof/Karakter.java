package me.RatkaiKristof;

import java.util.Random;

public class Karakter implements Comparable<Karakter>{
    private static final Random rnd = new Random();
    protected String nev;
    protected int eletero;
    protected int mezo;

    public Karakter(String nev){
        this(nev, (int)rnd.nextInt(3));
    }
    public Karakter(String nev, int mezo){
        Random rnd = new Random();
        this.nev = nev;
        this.eletero = rnd.nextInt(6)+4;
        this.mezo = mezo;
    }

    public String getNev() {
        return nev;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public int getEletero() {
        return eletero;
    }

    public void setEletero(int eletero) {
        this.eletero = eletero;
    }

    public int getMezo() {
        return mezo;
    }

    public void setMezo(int mezo) {
        this.mezo = mezo;
    }

    @Override
    public int compareTo(Karakter karakter) {
        return this.getMezo() - karakter.getMezo();
    }
}
