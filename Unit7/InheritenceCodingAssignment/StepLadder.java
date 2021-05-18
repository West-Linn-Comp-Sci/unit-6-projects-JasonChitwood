
/**
 * Write a description of class StepLadder here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class StepLadder extends Ladder
{
    public StepLadder(int rungs, int length)
    {
        super(rungs, length);
    }
    public boolean canFold()
    {
        return true;
    }
    public int unfoldLength()
    {
        return super.getLength() * 2;
    }
    public String toString()
    {
        return "Step ladder has " + super.getRungNum() + " rungs, and is " + super.getLength() + " feet long.";
    }
}
