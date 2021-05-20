
/**
 * Write a description of class erty here.
 *
 * @author JasonChitwood
 * @version 1.2
 */
public class FryCook extends Employee{
    public static final double FRYCOOK_WAGE = 5.50;
    private BurgerByte workBranch;
    private boolean isGrillReady;
    public FryCook(String name, int age, BurgerByte workBranch) {
        this.name = name;
        this.age = age;
        this.workBranch = workBranch;
        isGrillReady = false;
        workBranch.addStaff(this);
    }
    public BurgerByte getWorkPlace() { 
        return workBranch; 
    }
    public boolean isGrillReady() { 
        return isGrillReady; 
    }
    public void startWork(double hours) {
        isGrillReady = true;
        atWork = true;
        logHoursWorked(hours);
        System.out.println("Grill is ready to cook with!");
    }
    public void leaveWork() {
        isGrillReady = false;
        atWork = false;
        System.out.println("Grill is closed for the day.");
    }
    public double computeWage() {
        return (hoursWorked * (FRYCOOK_WAGE + BASE_WAGE));
    }
    /*private String name;
    private int age;
    private double hoursWorked;
    private boolean atWork;*/
    // getters
    /*public String getName() { return name; }
    public int getAge() { return age; }
    public boolean isAtWork() { return atWork; }*/
    

    // MODIFIES: this
    // EFFECTS: adds hours to the hoursWorked field
    /*private void logHoursWorked(double hours) {
        hoursWorked += hours;
    }*/

    // EFFECTS: the grill should be ready to go, hours should be logged, and
    //          the atWork field should be updated to reflect this FryCook's status
    

    // EFFECTS: close the grill for the day, and update this FryCook's work status
    

    // EFFECTS: computes wages for the day
    


}