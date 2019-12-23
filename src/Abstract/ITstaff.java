/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Abstract;

/**
 *
 * @author ADMIN
 */
public class ITstaff extends Person{
    private int exp_year;

    public ITstaff(int exp_year, String name, int age) {
        super(name, age);
        this.exp_year = exp_year;
    }

    public ITstaff(String name , int age ,int exp_year) {
        super(name,age);
        this.exp_year = exp_year;
    }
 
    @Override
    public double getSalary() {
        return exp_year * 1000;
    }
    
}
