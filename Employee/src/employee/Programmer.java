
package employee;

public class Programmer extends Employee {

double bonusfactor;

    public Programmer( String firstname, String lastname, String dateOfBirth, String department, double salary, String gender,double bonusfactor) {
        super(firstname, lastname, dateOfBirth, department, salary, gender);
        this.bonusfactor = bonusfactor;
    }

}
    
 
