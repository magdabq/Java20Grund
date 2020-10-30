/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee;

import java.util.ArrayList;
import java.util.Scanner;


public class ProjectEMain {  
    
    static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        
        ArrayList<TemplateEmployee> emp = new ArrayList<>();
        ArrayList<Employee> listEmp = new ArrayList<>();
       //Används i projektet 
        ArrayList<Employee> empRegister = new ArrayList<>();
        
        Employee e1 = new Employee("Magda", "Berg", "790212", "Development", 40000, "Female");
        Employee e2 = new Employee(" Anna", " Qvist", "720320", " Managemet", 50000, " Female");
        Programmer p1 = new Programmer("Pelle", "Ek", "800520", "Development" , 33000, "Male", 0.1);
        Programmer p2 = new Programmer("Karin", "Alm", "800614", "Development" , 33000, "Female", 0.1);
        
        
        
        listEmp.add(e1);
        listEmp.add(e2);
        listEmp.add(p1);
        listEmp.add(p2);
        
       Manager m1 = new Manager("Magda", 23, 20000);
       Manager m2 = new Manager("Mimmi", 48, 20000);
       
       Projectlead l1 = new Projectlead("Markus", 57, 20000);
       Projectlead l2 = new Projectlead("Carro", 50, 20000);
       
       // System.out.println(m1.calcBonus()+" \n"+ m2.calcBonus());  
        
        emp.add(m1);
        emp.add(m2);
        emp.add(l1);
        emp.add(l2);
        
        //ta in parametrar som input;
        
        
        
        
        //System.out.println(m1.age);
        //System.out.println(m1.bonusfactorManager);
        
        for (TemplateEmployee employee : emp) {
           System.out.println("Bonusen för " + employee.toString()+ " är: " + employee.calcBonus());
           
        }
            
        for (Employee e : listEmp) {
            System.out.println(e.getFirstname());
            
        }        
    }
    
}
