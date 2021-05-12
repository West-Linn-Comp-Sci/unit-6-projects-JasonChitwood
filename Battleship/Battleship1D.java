
/**
 * Write a description of class Battleship1D here.
 *
 * @author Jason Chitwood
 * @version 1.5
 */
public class Battleship1D
{
    private int size;
    private int health;
    private int maxHealth;
    private int hitCount;
    public Battleship1D(int a)
    {
        size = a;
        health = a;
        maxHealth = a;
        hitCount = a;
    }
    public void hit()
    {
        health --;
        hitCount --;
    }
    public boolean placement()
    {
        return true;
    }
    public int health()
    {
        return health;
    }
    public int maxHealth()
    {
        return maxHealth;
    }
    public int hitCount()
    {
        return hitCount;
    }
}
