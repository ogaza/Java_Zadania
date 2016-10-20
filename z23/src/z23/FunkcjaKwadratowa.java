/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package z23;

public class FunkcjaKwadratowa extends Wielomian {

    public FunkcjaKwadratowa() {
        super(3);
        this.wspolczynniki[2] = 1;
    }

    public FunkcjaKwadratowa(double a, double b, double c) throws Exception {
        super(3);
        setA(a);
        setB(b);
        setC(c);
    }

    private double delta() {
        return wspolczynniki[1] * wspolczynniki[1]
                - 4 * wspolczynniki[2] * wspolczynniki[0];
    }

    public void setA(double a) throws Exception {

        if (a == 0) {
            throw new Exception("a nie moze byc zerem");
        }

        this.wspolczynniki[2] = a;
    }

    public void setB(double b) {
        this.wspolczynniki[1] = b;
    }

    public void setC(double c) {
        this.wspolczynniki[0] = c;
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

    @Override
    public void wypiszMiejscaZerowe() {

        double a = this.wspolczynniki[2];
        double b = this.wspolczynniki[1];

        double d = delta();

        if (d > 0) {

            double pierwDelta = Math.sqrt(d);

            double x1 = (-b - pierwDelta) / (2 * a);

            double x2 = (-b + pierwDelta) / (2 * a);

            System.out.println(String.format("pierwiastki: %1$.3f, %2$.3f", x1, x2));
            
            return;
        }

        if (d == 0) {
            System.out.println(String.format("pierwiastek: %1$.3f", (-b / (2 * a))));
            return;
        }
        
        System.out.println("brak pierwiastkow");
    }

}
