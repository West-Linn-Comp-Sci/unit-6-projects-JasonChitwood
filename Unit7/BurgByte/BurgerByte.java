
/**
 * Write a description of class dfgh here.
 *
 * @author JasonChitwood
 * @version 1.2
 */
import java.util.ArrayList;
import java.util.List;

public class BurgerByte extends Employee{
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


    // getters
    
    /*public List<Cashier> getCashiers() { return cashiers; }
    public List<FryCook> getFryCooks() { return fryCooks; }*/
    

    // EFFECTS: "opens" this restaurant, i.e. set isOpen to true
    
    // EFFECTS: sets the isOpen field to false, and sends all employees home (off work)
    

    // REQUIRES: c must not be in this cashiers or this BurgerByte's Manager's cashiers
    // MODIFIES: this
    // EFFECTS: adds the given cashier to this cashiers
    /*public void addCashier(Cashier c) {
        cashiers.add(c);
    }*/
    
    

    // REQUIRES: c must be in this cashiers and this BurgerByte's Manager's cashiers
    // MODIFIES: this
    // EFFECTS: removes the given cashier from this cashiers
    /*public void removeCashier(Cashier c) {
        cashiers.remove(c);
    }*/

    // REQUIRES: fc must not be in this frycooks or this BurgerByte's Manager's frycooks
    // MODIFIES: this
    // EFFECTS: adds the given cashier to this cashiers
    /*public void addFryCook(FryCook fc) {
        fryCooks.add(fc);
    }*/

    // REQUIRES: fc must be in this frycooks and this BurgerByte's Manager's frycooks
    // MODIFIES: this
    // EFFECTS: removes the given FryCook from this frycooks
    /*public void removeFrycook(FryCook fc) {
        fryCooks.remove(fc);
    }*/
    

    // EFFECTS: computes wages for all employees, prints them out in this format
    //          Name: ______, Salary: _______ for each employee
    
    /*private List<Cashier> cashiers;
    private List<FryCook> fryCooks;*/

}
