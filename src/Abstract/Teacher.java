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
public class Teacher extends Person{
    private int numberOfSlotPerMonth;
    private double reward;
    public Teacher(String name, int age , int numberSlot) {
        super(name, age);
        this.numberOfSlotPerMonth = numberSlot;
        if(numberSlot >= 50){
            this.reward = 100;
        }else{
            reward = 0;
        }
    }
    @Override
    public double getSalary() {
        return numberOfSlotPerMonth*15+reward;
    }
    
}
