package me.RatkaiKristof;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class JatekMezo {
    private List<Character> mezo;
    private static final int mezoMeret = 3;

    public JatekMezo(){
        mezo = new ArrayList<>(mezoMeret);
        for (int i = 0; i < mezoMeret; i++) {
            mezo.add('_');
        }
    }
    public void lepes(Harcos harcos, Varazslo varazslo){
        Random rnd = new Random();
        int harcosMezo = rnd.nextInt(mezoMeret);
        int varazsloMezo = rnd.nextInt(mezoMeret);

        while (harcosMezo == varazsloMezo){
            harcosMezo = rnd.nextInt(mezoMeret);
            varazsloMezo = rnd.nextInt(mezoMeret);
        }
        mezo.set(harcosMezo, 'H');
        mezo.set(varazsloMezo, 'V');
    }

    public void mezo(){
        for (char c : mezo){
            System.out.print(c);
        }
    }
}
