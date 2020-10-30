
package employee;


public class Manager implements TemplateEmployee {

    public Manager(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        //this.bonusfactor = bonusfactor;
        this.salary = salary;
    }
    
    
    
    String name;
    int age; 
    //double bonusfactor;
    double salary; 
    
    @Override
    public double calcBonus (){    
        double result = salary*bonusfactorManager;      
        return result;    
    }    

   /* @Override
    public String toString() {
        return   "name=" + name ;
    }*/

    @Override
    public String toString() {
        return "Manager " + name;
    }
    
    
}
