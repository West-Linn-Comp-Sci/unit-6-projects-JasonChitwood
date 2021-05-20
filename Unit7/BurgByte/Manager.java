
/**
 * Write a description of class sdfh here.
 *
 * @author JasonChitwood
 * @version 1.2
 */

import java.util.ArrayList;
import java.util.List;
public class Manager extends Employee{
    public static final double MANAGER_WAGE = 9.50;    
    protected List<Employee> team;
    protected List<Cashier> cashiers;
    protected List<FryCook> fryCooks;
    protected BurgerByte managingBranch;
    public Manager(String name, int age) {
        this.name = name;
        this.age = age;
        hoursWorked = 0;
        atWork = false;
        cashiers = new ArrayList<>();
        fryCooks = new ArrayList<>();
    }
    public BurgerByte getManagingBranch() { 
        return managingBranch; 
    }
    public List<Employee> getTeam() {
        return team;
    }
    public double computeWage() {
        return (hoursWorked * (MANAGER_WAGE + BASE_WAGE));
    }
    public void setManagingBranch(BurgerByte managingBranch) {
        this.managingBranch = managingBranch;
    }
    public void hire(Employee emp){
        managingBranch.addStaff(emp);
        team.add(emp);
        System.out.println("Welcome aboard, " + emp.getName() + "!");
    }
    public void fire(Employee emp){
        managingBranch.removeStaff(emp);
        team.remove(emp);
        System.out.println("Sorry to let you go, " + emp.getName() + ".");
    }
    public void startWork(double hours) {
        managingBranch.openRestaurant();
        atWork = true;
        logHoursWorked(hours);
        System.out.println("We are open for the day!");
    }
    public void leaveWork() {
        managingBranch.closeRestaurant();
        atWork = false;
        System.out.println("We are closed for the day!");
    }
}
