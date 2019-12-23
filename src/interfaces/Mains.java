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
public class Mains {
    public static void main(String[] args) {
        Staff S = new Staff(2.5, 60);
        Teacher A = new Teacher(90,3);
        System.out.println("Staff : "+ S.getSalary());
        System.out.println("Teacher : "+ A.getSalary());
    }
}
