
/**
 * Write a description of class Coin here.
 *
 * @author JasonChitwood
 * @version 1.0
 */
public class Coin { 
    private double myValue; 
    private String myName; 
    public Coin(double value, String name) { 
       myValue = value; 
       myName = name; 
    } 
 
    public double getValue() { 
       return myValue; 
    } 
 
    public String getName() { 
       return myName;
    } 
 
    // returns true if this coin is equal to aCoin, 
    // which means the name and the value are both equal 
    public boolean equals(Coin aCoin) { 
            if(myValue == aCoin.getValue() && myName.equals(aCoin.getName())){
                return true;
            } else {
                return false;
            }
    }
}

