/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author laya
 */
public class EmployeeDemo {
    public static void main(String[] args) {
        //Testing out the Employee Class
        Employee Emp1 = new Employee();
        Employee Emp2 = new Employee("Associate", "Bob", "The Builder", 5);
        Employee Emp3 = new Employee("Bachelors", "Billy", "Banker", 0);
        
        Emp1.setDegree("Bachelors");
        Emp2.setFirstName("Joe");
        Emp1.setLastName("Ley");
        Emp2.setExperience(6);
        System.out.println(Emp1.getDegree());
        System.out.println(Emp2.getFirstName());
        System.out.println(Emp1.getLastName());
        System.out.println(Emp2.getExperience());
        System.out.println(Emp2.toString());
        System.out.println(Emp1.equals(Emp2));
        System.out.println(Emp1.equals(Emp3));
        System.out.println(Emp1.compareTo(Emp2));
        System.out.println(Emp2.compareTo(Emp1));
        System.out.println(Emp1.compareTo(Emp3));
    }
}
