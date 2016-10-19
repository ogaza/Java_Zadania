/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package z14;

import javax.swing.JOptionPane;

/**
 *
 * @author Olaf
 */
public class Z14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String txt = JOptionPane.showInputDialog("podaj liczbe calkowia wieksza od zera");

        String inputString = txt.trim();

        String regex = "^([0-9]*)";

        if (inputString.matches(regex)) {

            int input = Integer.parseInt(inputString);

            String wynik = naSystem(input, 2);

            JOptionPane.showMessageDialog(null, wynik);

            wynik = naSystem(input, 8);

            JOptionPane.showMessageDialog(null, wynik);

            wynik = naSystem(input, 16);

            JOptionPane.showMessageDialog(null, wynik);

        } else {
            JOptionPane.showMessageDialog(null, "podano niewlasciwa liczbe");
        }
    }

    private static String naSystem(int input, int podstawa) {

        if (podstawa != 2 && podstawa != 8 && podstawa != 16) {
            return "bledna podstawa";
        }

        if (input < podstawa) {
            return cyfraSzesnastkowa(input);
        }

        int pom = input;

        int n = 1;
        int maska = 1;

        if (podstawa == 8) {
            n = 3;
            maska = 7;
        }

        if (podstawa == 16) {
            n = 4;
            maska = 15;
        }

        String wynik = "";
        
        while (pom > 0) {

            int reszta = pom & maska;

            wynik = cyfraSzesnastkowa(reszta) + wynik;
            
            pom = pom >> n;
        }

        return wynik;
    }

    private static String cyfraSzesnastkowa(int input) {

        if (input >= 0 && input < 10) {
            return Integer.toString(input);
        }

        switch (input) {
            case 10:
                return "a";
            case 11:
                return "b";
            case 12:
                return "c";
            case 13:
                return "d";
            case 14:
                return "e";
            case 15:
                return "f";
        }

        return "blad";
    }

}
