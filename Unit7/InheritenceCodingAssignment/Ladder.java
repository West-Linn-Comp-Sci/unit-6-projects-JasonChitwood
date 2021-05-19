
/**
 * Write a description of class Ladder here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Ladder //compare if ladders are simmilar, add equals 
{
    protected int rungs;
    protected int length;
    protected boolean extendable;
    public Ladder(int rungs, int length)
    {
        this.rungs = rungs;
        this.length = length;
        this.extendable = false;
    }
    public int getRungNum()
    {
        return this.rungs;
    }
    public int getLength()
    {
        return this.length;
    }
    public boolean isExtendable()
    {
        return this.extendable;
    }
    public String canFold()
    {
        return "Cannot be folded";
    }
    public int compareTo(Ladder ladder)
    {
        if (this.length < ladder.getLength()){
            return -1;
        } else if (this.length > ladder.getLength()){
            return 1;
        } else if (this.rungs == ladder.getRungNum() && this.length == ladder.getLength()){
            return 0;
        } else {
            return -1;
        }
    }
    public boolean equals(Ladder ladder)
    {
        if (this.rungs == ladder.getRungNum() && this.length == ladder.getLength()){
            return true;
        } else {
            return false;
        }
    }
    public String toString()
    {
        return "Ladder has " + rungs + " rungs, and is " + length + " feet long.";
    }
}
