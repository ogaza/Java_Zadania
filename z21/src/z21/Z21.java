/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package z21;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Olaf
 */
public class Z21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        try {
            Rational r1 = new Rational(3, 4);
            Rational r2 = r1.add(new Rational(2, 6));
            JOptionPane.showMessageDialog(null, r2.toString());
//            
//            r1 = new Rational(3, 4);
//            r2 = r1.mul(new Rational(4, 3));
//            JOptionPane.showMessageDialog(null, r2.toString());
//            
//            r1 = new Rational(3, 4);
//            r2 = r1.sub(new Rational(1, 4));
//            JOptionPane.showMessageDialog(null, r2.toString());
//            
//            r1 = new Rational(3, 4);
//            r2 = r1.div(new Rational(4, 3));
//            JOptionPane.showMessageDialog(null, r2.toString());
//            
//            r1 = new Rational(3, 4);
//            JOptionPane.showMessageDialog(null, r1.compareTo(new Rational(1, 2)));
            
//            r1 = new Rational(3, 4);
//            JOptionPane.showMessageDialog(null, r1.compareTo(new Rational(-6, -8)));
            
            r1 = new Rational(3, 4);
            JOptionPane.showMessageDialog(null, r1.equals(new Rational(12, 16)));

        } catch (Exception ex) {
            Logger.getLogger(Z21.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
