/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package z32;

import java.util.logging.Level;
import java.util.logging.Logger;


public class Z32 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        try {
            Wyrazenie w;
            
            w = new Wyrazenie("(3*((1+1)/1))");
            
            System.out.println(w.oblicz());

        } catch (DzieleniePrzezZero ex) {
            Logger.getLogger(Z32.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NiepoprawneWyrazenie ex) {
            Logger.getLogger(Z32.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
