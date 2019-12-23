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
public class Mains {
    public static void main(String[] args) {
        Person p = new ITstaff("Hoi", 22, 1);
        Person p2 = new Teacher("Nga", 25, 55);
        System.out.println("IT salary : "+ p.getSalary());
        System.out.println("Teacher Salary : "+ p2.getSalary());
    }
}
