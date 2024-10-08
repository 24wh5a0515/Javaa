class Person 
{
    private String firstName;
    private String lastName;
    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public String getFirstName() 
    {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
}
class Employee extends Person 
{
    private int employeeId;
    private String jobTitle;
    public Employee(String firstName, String lastName, int employeeId, String jobTitle) 
    {
        super(firstName, lastName);
        this.employeeId = employeeId;
        this.jobTitle = jobTitle;
    }
    public int getEmployeeId() 
    {
        return employeeId;
    }
    public String getLastName() 
    {
        return super.getLastName() + ", " + jobTitle;
    }
} 
public class Main
{
    public static void main(String args[]) 
    {
        Employee employee1 = new Employee("Kortney", "Rosalee", 4451, "HR Manager");
        System.out.println(employee1.getFirstName() + " " + employee1.getLastName() + " (" + employee1.getEmployeeId() + ")");
        Employee employee2 = new Employee("Junior", "Philipa", 4452, "Software Manager");
        System.out.println(employee2.getFirstName() + " " + employee2.getLastName() + " (" + employee2.getEmployeeId() + ")");
    }
} 
