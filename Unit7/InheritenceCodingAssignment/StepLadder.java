
/**
 * Write a description of class StepLadder here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class StepLadder extends Ladder
{
    protected boolean foldable;
    public StepLadder(int rungs, int length)
    {
        super(rungs, length);
        this.foldable = true;
    }
    public String canFold()
    {
        return "Can be folded.";
    }
    public int unfoldLength()//usable length
    {
        return this.length;
    }
    public int compareTo(StepLadder ladder)
    {
        if (this.length < ladder.getLength()){
            return -1;
        } else if (this.length > ladder.getLength()){
            return 1;
        } else if (this.rungs == ladder.getRungNum() && this.length == ladder.getLength() && this.foldable == true){
            return 0;
        } else {
            return -1;
        }
    }
    public boolean equals(StepLadder ladder)
    {
        if (this.rungs == ladder.getRungNum() && this.length == ladder.getLength() && this.foldable == true){
            return true;
        } else {
            return false;
        }
    }
    public String toString()
    {
        return "Step ladder has " + super.getRungNum() + " rungs, and is " + super.getLength() + " feet long.";
    }
}
