/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package z23;

public class FunkcjaLiniowa extends Wielomian {

    public FunkcjaLiniowa() {
        super(2);
        this.wspolczynniki[1] = 1;
    }

    public FunkcjaLiniowa(double a, double b) throws Exception {
        super(2);
        setA(a);
        setB(b);
    }

    public void setA(double a) throws Exception {

        if (a == 0) {
            throw new Exception("a nie moze byc zerem");
        }

        this.wspolczynniki[1] = a;
    }

    public void setB(double b) {
        this.wspolczynniki[0] = b;
    }

    @Override
    public void wypiszMiejscaZerowe() {

        double a = this.wspolczynniki[1];
        double b = this.wspolczynniki[0];

        System.out.println(String.format("pierwiastek: %1$.3f", (-b / a)));

    }
}
