
/**
 * Write a description of class InheritanceTest here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class InheritanceTest
{
    public static void main (String[] args){
        Ladder normLadder = new Ladder(5, 6);
        Ladder normLadder2 = new Ladder(5, 6);
        Ladder stepLadder = new StepLadder(3, 4); 
        DpLadder dpLadder = new DpLadder(4, 5, true);
        System.out.println(normLadder.getLength());
        System.out.println(normLadder.canFold());
        System.out.println(normLadder.equals(stepLadder));
        System.out.println(normLadder.equals(normLadder2));
        System.out.println(stepLadder.canFold());
        System.out.println(dpLadder.isExtendable());
        System.out.println(normLadder.toString());
        System.out.println(stepLadder.toString());
        System.out.println(dpLadder.toString());
    }
}
