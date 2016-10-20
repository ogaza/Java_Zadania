/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package z31;

/**
 *
 * @author Olaf
 */
public class Z31 {

    public static void main(String[] args) {
        Kolejka k = new Kolejka();
        try {
            k.doKolejki(new Integer(1));
            k.doKolejki(new String("2"));
            k.doKolejki(new Double(3));
            
            k.doKolejki(new Double(4));
            k.doKolejki(new Double(5));
            
            k.zKolejki();
            
            k.doKolejki(new Double(6));
            
            for (int i = 1; i <= 7; ++i) {
                System.out.println((k.zKolejki()).toString());
            }
            
        } catch (Przepelnienie e) {
            System.out.println("Przepełniona kolejka!");
        } catch (Niedomiar e) {
            System.out.println("Pusta kolejka!");
        }
    }
}
