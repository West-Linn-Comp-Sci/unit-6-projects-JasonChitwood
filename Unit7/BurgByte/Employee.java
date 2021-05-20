
/**
 * Write a description of class Employee here.
 *
 * @author JasonChitwood
 * @version 1.2
 */
public abstract class Employee
{
    public static final double BASE_WAGE = 10.00;
    protected String name;
    protected int age;
    protected double hoursWorked;
    protected boolean atWork;
    public String getName() { 
        return name; 
    }
    public int getAge() { 
        return age; 
    }
    public boolean isAtWork() { 
        return atWork; 
    }
    public double getHoursWorked() { 
        return hoursWorked; 
    }
    public void logHoursWorked(double hours) {
        hoursWorked += hours;
    }
    public void startWork(double hours) {
        
    }
    public void leaveWork() {
        
    }
    public double computeWage() {
        return (hoursWorked * (BASE_WAGE));
    }
}
