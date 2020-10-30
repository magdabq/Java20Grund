
package employee;


public class Projectlead implements TemplateEmployee {
    
    String name;
    int age; 
    //double bonusfactor;
    double salary; 

    public Projectlead (String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Projectlead " + name ;
    }
    
    
    
    @Override
    public double calcBonus (){    
       double result = salary*bonusfactorProjectlead;      
        return result;    
    }   
    
}
