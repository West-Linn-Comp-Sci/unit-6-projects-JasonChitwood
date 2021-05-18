
/**
 * Write a description of class Ladder here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Ladder
{
    private int rungs;
    private int length;
    public Ladder(int rungs, int length)
    {
        this.rungs = rungs;
        this.length = length;
    }
    public int getRungNum()
    {
        return rungs;
    }
    public int getLength()
    {
        return length;
    }
    public boolean canFold()
    {
        return false;
    }
    public String toString()
    {
        return "Ladder has " + rungs + " rungs, and is " + length + " feet long.";
    }
}
