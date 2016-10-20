/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package z22;

public class RownanieKwadratowe {

    private double a, b, c;

    public RownanieKwadratowe(double a, double b, double c) throws Exception {
        setA(a);
        this.b = b;
        this.c = c;
    }

    public void setA(double a) throws Exception {

        if (a == 0) {
            throw new Exception("a nie moze byc zerem");
        }

        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double obliczY(double x) {
        return a * x * x + b * x + c;
    }

    private double delta() {
        return b * b - 4 * a * c;
    }

    public int licybaPierwiastkow() {
        double d = delta();

        if (d > 0) {
            return 2;
        }

        if (d == 0) {
            return 1;
        }

        return 0;
    }
}
