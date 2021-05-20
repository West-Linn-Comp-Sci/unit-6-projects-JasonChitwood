
/**
 * Write a description of class dfgh here.
 *
 * @author JasonChitwood
 * @version 1.2
 */
import java.util.ArrayList;
import java.util.List;

public class BurgerByte{
    protected String location;
    protected Manager manager;    
    protected List<Employee> staff;
    protected boolean isOpen;
    public BurgerByte(String locn, Manager m) {
        location = locn;
        manager = m;
        staff = new ArrayList<>();
    }
    public String getLocation() { 
        return location; 
    }
    public Manager getManager() { 
        return manager; 
    }
    public List<Employee> getStaff(){
        return staff;
    }
    public boolean isOpen() { 
        return isOpen; 
    }
    public void openRestaurant() {
        isOpen = true;
    }
    public void closeRestaurant() {
        isOpen = false;
        for (Employee c : staff) {
            c.leaveWork();
        }
        manager.leaveWork();
    }
    public void addStaff(Employee emp){
        staff.add(emp);
    }
    public void removeStaff(Employee emp){
        staff.remove(emp);
    }
    public void computeStaffWages() {
        for (Employee c : staff) {
            System.out.println("Name: " + c.getName() +", Salary: " + c.computeWage());
        }
        System.out.println("Name: " + manager.getName() +", Salary: " + manager.computeWage());
    }
}
