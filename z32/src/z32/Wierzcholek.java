/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package z32;

public abstract class Wierzcholek {

    Wierzcholek lewy, prawy;

    public abstract int wartosc() throws DzieleniePrzezZero, NiepoprawneWyrazenie;
}
