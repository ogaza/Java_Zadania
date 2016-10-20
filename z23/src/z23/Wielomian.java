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
public abstract class Wielomian {
    
    protected double[] wspolczynniki;
    
    protected Wielomian(int stopien){
        this.wspolczynniki = new double[stopien];
    }
    
    public abstract void wypiszMiejscaZerowe();
}
