
/**
 * Write a description of class DpLadder here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DpLadder extends StepLadder
{
    public DpLadder(int rungs, int length, boolean extendable) //another "other" constructorn ??
    {
        super(rungs, length);
        this.extendable = extendable;
    }
    public boolean isExtendable()
    {
        return this.extendable;
    }
    public int unfoldLength()
    {
        return this.length * 2;
    }
    public int getRungNum()
    {
        return this.rungs * 2;
    }
    public int compareTo(DpLadder ladder)
    {
        if (this.length < ladder.getLength()){
            return -1;
        } else if (this.length > ladder.getLength()){
            return 1;
        } else if (this.rungs == ladder.getRungNum() && this.length == ladder.getLength() && this.extendable == true){
            return 0;
        } else {
            return -1;
        }
    }
    public boolean equals(DpLadder ladder)
    {
        if (this.rungs == ladder.getRungNum() && this.length == ladder.getLength() && this.extendable == true){
            return true;
        } else {
            return false;
        }
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
