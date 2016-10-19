/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package z21;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Olaf
 */
public class Rational {

    private int l;
    private int m;

    public int getLicznik() {
        return this.l;
    }

    public int getMinanownik() {
        return this.m;
    }

    public static int nwd(int a, int b) {

        int p1 = Math.max(Math.abs(a), Math.abs(b));

        int p2 = Math.min(Math.abs(a), Math.abs(b));

        if (p2 == 0 || p2 == 1) {
            return 1;
        }

        int wynik = 1;

        while (p2 > 0) {

            int pom = p2;

            p2 = p1 % p2;

            p1 = pom;

            wynik = p1;
        }

        return wynik;
    }

    public Rational() {
        l = 0;
        m = 1;
    }

    public Rational(int l, int m) throws Exception {

        if (m == 0) {
            throw new Exception("minownik nie moze byc zerem");
        }

        this.l = l / nwd(l, m);
        this.m = m / nwd(l, m);
    }

    public Rational add(Rational skladnik) throws Exception {
        Rational wynik = new Rational(
                this.l * skladnik.getMinanownik() + this.m * skladnik.getLicznik(),
                this.m * skladnik.getMinanownik());

        return wynik;
    }

    public Rational mul(Rational skladnik) throws Exception {
        Rational wynik = new Rational(
                this.l * skladnik.getLicznik(),
                this.m * skladnik.getMinanownik());

        return wynik;
    }

    public Rational sub(Rational skladnik) throws Exception {

        Rational pom = skladnik.mul(new Rational(-1, 1));

        return this.add(pom);
    }

    public Rational div(Rational skladnik) throws Exception {

        Rational pom = new Rational(skladnik.getMinanownik(), skladnik.getLicznik());

        return this.mul(pom);
    }

    public boolean equals(Rational skladnik) {
        return this.l * skladnik.getMinanownik() == this.m * skladnik.getLicznik();
    }

    public int compareTo(Rational skladnik) {

        try {
            Rational pom;
            pom = this.sub(skladnik);

            if (pom.getLicznik() * pom.getMinanownik() > 0) {
                return 1;
            }
            if (pom.getLicznik() * pom.getMinanownik() < 0) {
                return -1;
            }

        } catch (Exception ex) {
            Logger.getLogger(Rational.class.getName()).log(Level.SEVERE, null, ex);
        }

        return 0;
    }

    @Override
    public String toString() {
        return "(" + Integer.toString(l) + "/" + Integer.toString(m) + ")";
    }

}
