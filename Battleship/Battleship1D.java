
/**
 * Write a description of class Battleship1D here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Battleship1D
{
    private int size;
    private int health;
    public Battleship1D(int a)
    {
        size = a;
        health = a;
    }
    public void hit()
    {
        health --;
    }
    public boolean placement()
    {
        return true;
    }
    public int health()
    {
        return health;
    }
}
