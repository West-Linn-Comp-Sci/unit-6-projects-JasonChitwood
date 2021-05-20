
/**
 * Write a description of class fdgh here.
 *
 * @author JasonChitwood
 * @version 1.2
 */
public class Cashier extends Employee{
    public static final double CASHIER_WAGE = 6.50;
    private BurgerByte workBranch;
    private boolean isRegisterOpen;
    public Cashier(String name, int age, BurgerByte workBranch) {
        this.name = name;
        this.age = age;
        hoursWorked = 0;
        atWork = false;
        this.workBranch = workBranch;
        isRegisterOpen = false;
        workBranch.addStaff(this);
    }
    public BurgerByte getWorkPlace() { 
        return workBranch; 
    }
    public boolean isRegisterOpen() { 
        return isRegisterOpen; 
    }
    public void startWork(double hours) {
        isRegisterOpen = true;
        atWork = true;
        logHoursWorked(hours);
        System.out.println("Register open!");
    }
    public void leaveWork() {
        isRegisterOpen = false;
        atWork = false;
        System.out.println("Register closed, can't take any more orders.");

    }
    public double computeWage() {
        return (hoursWorked * (CASHIER_WAGE + BASE_WAGE));
    }

    /*public static final double BASE_WAGE = 10.00;*/

    /*private String name;
    private int age;
    private double hoursWorked;
    private boolean atWork;*/
    // getters
    /*public String getName() { return name; }
    public int getAge() { return age; }
    public double getHoursWorked() { return hoursWorked; }
    public boolean isAtWork() { return atWork; }*/
    

    // MODIFIES: this
    // EFFECTS: adds hours to the hoursWorked field
    /*private void logHoursWorked(double hours) {
        hoursWorked += hours;
    }*/

    // EFFECTS: sets isRegisterOpen to true, and updates atWork to reflect that this Cashier is
    //          now at work
    

    // EFFECTS: sets isRegisterOpen to false and updates atWork to reflect that this Cashier is
    //          no longer at work
    

    // EFFECTS: computes wages for the day
    


}