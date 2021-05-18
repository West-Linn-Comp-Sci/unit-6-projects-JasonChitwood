
/**
 * Write a description of class DpLadder here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DpLadder extends StepLadder
{
    private boolean extendable;
    public DpLadder(int rungs, int length, boolean extendable) //two times length and rungs??
    {
        super(rungs, length);
        this.extendable = extendable;
    }
    public boolean isExtendable()
    {
        return extendable;
    }
    public String toString()
    {
        String out = "Dual purpose ladder has " + super.getRungNum() + " rungs, is " + super.getLength() + " feet long, and ";
        if (extendable){
            out += "is extendable.";
        } else {
            out += "is not extendable.";
        }
        return out;
    }
}
