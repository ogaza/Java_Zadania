/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package z32;

public class Stala extends Wierzcholek {

    private int wart;

    public Stala(int x) throws NiepoprawneWyrazenie {
        
        String regex = "^([0-9])";

            if (!Integer.toString(x).matches(regex)) {
                throw new NiepoprawneWyrazenie();
            }
        
        wart = x;
    }

    @Override
    public int wartosc() {
        return wart;
    }

}
