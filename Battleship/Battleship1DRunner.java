
/**
 * Write a description of class Battleship1DRunner here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Battleship1DRunner
{
    public static void main (String[] args)
    {
        Battleship1DBoard board = new Battleship1DBoard(7);
        //board.placeShip(5, 1, "right");
        board.randomPlaceShip(2);
        System.out.println(board.shoot(2));
        System.out.println(board.shoot(0));
        System.out.println(board.shoot(1));
        System.out.println(board.shoot(3));
        System.out.println(board.shoot(4));
        System.out.println(board.shoot(5));
        System.out.println(board.shoot(5));
        System.out.println(board);
    }
}
