
package employee;
import java.util.Scanner;

public class Statistics {
   
    static Scanner sc = new Scanner(System.in);
    public static boolean run = true;
    
    public static int menu (){
        System.out.println("Please choose in the meny which statistics report you want to see.");
        System.out.println("1. Average wage in the company.\n2. Highest salary in the company");
        int choise = Integer.parseInt(sc.nextLine());
        return choise;
    }
    
    public static void differentStatistics (int choiceFromMenu){
        
        switch (choiceFromMenu){
            case 1: 
                System.out.println("You chose: Average wage in the company");
                break;
            case 2:
                System.out.println("You chose: Highest salary in the company");
                break;
            case 0:
                //tillbaka till huvudmenyn
                break;
        }
        
        System.out.println("Run again?");
        String runagain = sc.nextLine();
              if (!runagain.equalsIgnoreCase("y") && (!runagain.equalsIgnoreCase("n"))){
                 System.out.println("Varken y ller n försök igen");
                 runagain = sc.nextLine();
             }
    }
         public static void main(String [] args){
             
         
             differentStatistics(menu());
             
             
                        
             
             /*else if (runagain.equalsIgnoreCase("y")){
             System.out.println("Du skrev y");           
             } else if (runagain.equalsIgnoreCase("n")){
             System.out.println("Du skrev n");
             }
                //if (runagain.equalsIgnoreCase("y")){
                 //   run = true;
                 //   }
                //else {
                 //   if (runagain.equalsIgnoreCase("n")){
                  //      run = false;
                    }*/
                }
}

            
             
         
    
    

