/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee;
import static employee.EmpManagement.sc;
import java.util.Scanner;
/**
 *
 * @author magdalenabergqvist
 */
public class EmpManagement {
    
   static Scanner sc = new Scanner(System.in);
   
    static public void addEmp(){
        System.out.println("Enter first name: ");
            String fname = sc.nextLine();
        System.out.println("Enter last name: ");
            String lname= sc.nextLine();
        System.out.println("Enter salary: ");
            //parsa till double   
        double salary = sc.nextDouble();
        sc.nextInt();
        System.out.println("Enter gender: Female, Male: ");
           String gender = sc.nextLine(); 
        System.out.println("Enter date of birth YYMMDD");
            String birthdate = sc.nextLine();
        System.out.println("Department: \n 1. Management \n 2.Development \n .Project lead ");
            int choiceDepartment = sc.nextInt();
            sc.nextLine();

            switch (choiceDepartment) {

                case 1: 
                  String dep = "Management";
                break;
                case 2: 
                    dep = "Development";
                break;
                case 3: 
                    dep = "Project lead";
                break;
                //Loop?
                default:
                    System.out.println("Wrong choice");
            }
         //måste jag göra detta till en egen metod?       
         
            
        //Employee employee = new Employee(fname, lname ,salary, gender, birthdate,dep);
            
         //book = new Book(name, author);
        // books.add(book);
        System.out.println("Book cretated"); 
        //System.out.println(books.get(0));
        //System.out.println(name + " " + author);
    }
        public double profChoice(){
            
       double bonfactor = 0;
        String prof = "";
        System.out.println("Choose profession: \n 1. Manager \n 2. Programmer \n 3 Project lead ");
         int choiceProfession = sc.nextInt();
                sc.nextLine();
            switch (choiceProfession) {
                    
                    case 1:  prof = "Manager";
                            bonfactor = 0.4;
                    case 2: prof = "Programmer";
                            bonfactor = 0.2;
                    break;
                    case 3: prof = "Project leader";
                            bonfactor = 0.2;
                    break;
                    //Loop?
                    default:
                        //System.out.println("Wrong choice");
                }
       return bonfactor;
        }        
   
}
