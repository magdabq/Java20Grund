
package employee;


public class Employee {
    
    private String firstname;
    private String lastname;
    private String dateOfBirth;
    private String department;
    private double salary; 
    private String gender;// skapa enum? eller String?
   
    public Employee(String firstname, String lastname, double salary, String gender, String dateOfBirth, String department) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.dateOfBirth = dateOfBirth;
        this.department = department;
        this.salary = salary;
        this.gender = gender;
       
    }

       
    public void bonusCalc (){
       
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Employee{" + "firstname=" + firstname + ", lastname=" + lastname + ", dateOfBirth=" 
                + dateOfBirth + ", department=" + department + ", salary=" + salary + ", gender=" + gender + '}';
    }

   
}
