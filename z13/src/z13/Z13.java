/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package z13;

import javax.swing.JOptionPane;

/**
 *
 * @author Olaf
 */
public class Z13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String txt = JOptionPane.showInputDialog("podaj liczbe calkowia wieksza od zera");

        String inputString = txt.trim();

        String regex = "^([1-9]+[0-9]*)";

        if (inputString.matches(regex)) {

            int input = Integer.parseInt(inputString);

            int wynik = liczNieparzyste(input);

            JOptionPane.showMessageDialog(null, Integer.toString(wynik));

        } else {
            JOptionPane.showMessageDialog(null, "podano niewlasciwa liczbe");
        }
    }

    private static int liczNieparzyste(int granica) {

        int pom = granica;

        if (granica % 2 == 0) {
            pom--;
        }

        int n = (pom + 1) / 2;

        int wynik = n * (1 + pom) / 2;

        return wynik;
    }

}
