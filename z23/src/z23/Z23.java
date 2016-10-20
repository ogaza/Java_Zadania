/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package z23;

/**
 *
 * @author Olaf
 */
public class Z23 {

    public static void main(String[] args) throws Exception {

        Wielomian w[] = new Wielomian[3];

        w[0] = new FunkcjaLiniowa(1, 2);
        w[1] = new FunkcjaKwadratowa(1, 2, 1);
        w[2] = new FunkcjaKwadratowa(1, 2, -8);

        for (Wielomian x : w) {
            x.wypiszMiejscaZerowe();
        }
    }

}
