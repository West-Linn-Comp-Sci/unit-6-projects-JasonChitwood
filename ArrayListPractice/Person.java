
/**
 * Write a description of class Person here.
 *
 * @author JasonChitwood
 * @version 1.0
 */
public class Person
{
    private int myAge;
    private String myName;
    public Person(int a, String b)
    {
        myAge = a;
        myName = b;
    }
    public int returnAge()
    {
        return myAge;
    }
    public String returnName(){
        return myName;
    }
}
