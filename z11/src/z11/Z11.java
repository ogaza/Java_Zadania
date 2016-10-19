/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package z11;

import javax.swing.JOptionPane;

/**
 *
 * @author Olaf
 */
public class Z11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String txt = JOptionPane.showInputDialog("podaj tekst");
        JOptionPane.showMessageDialog(null, txt.toUpperCase());
    }
    
}
