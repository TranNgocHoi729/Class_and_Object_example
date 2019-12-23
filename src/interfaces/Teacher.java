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
public class Teacher implements Salary{
    private int slotPerMonth;
    private double expYear;
    private final int defaultSalary = 300;
    

    public Teacher(int slotPerMonth, double expYear) {
        this.slotPerMonth = slotPerMonth;
        this.expYear = expYear;
    }

    @Override
    public double getSalary() {
        return defaultSalary+slotPerMonth*3+expYear*20;
    }
    
    
}
