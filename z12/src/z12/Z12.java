/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package z12;

import java.math.BigInteger;
import javax.swing.JOptionPane;

/**
 *
 * @author Olaf
 */
public class Z12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String txt = JOptionPane.showInputDialog("podaj liczbe calkowia wieksza od zera");

        String inputString = txt.trim();

        String regex = "^([1-9]+[0-9]*)";

        if (inputString.matches(regex)) {

            BigInteger input = new BigInteger(inputString);

            BigInteger wynik = silnia(input);

            JOptionPane.showMessageDialog(null, wynik.toString());

        } else {
            JOptionPane.showMessageDialog(null, "1");
        }
    }

    private static BigInteger silnia(BigInteger n) {

        BigInteger wynik = new BigInteger("1");

        if (n.compareTo(new BigInteger("1")) <= 0) {
            return wynik;
        }

        BigInteger pom = new BigInteger("2");

        while (pom.compareTo(n) <= 0) {
            wynik = wynik.multiply(pom);
            pom = pom.add(new BigInteger("1"));
        }
        return wynik;
    }

}
