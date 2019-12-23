/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

/**
 *
 * @author ADMIN
 */
public class Staff implements Salary{
    private final int defaultSalary = 500;
    private double expYear;
    private int overTime;

    public Staff(double expYear, int overTime) {
        this.expYear = expYear;
        this.overTime = overTime;
    }
    
    @Override
    public double getSalary() {
        return defaultSalary + expYear*50 + overTime*3;
    }
    
}
