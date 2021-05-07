
/**
 * Write a description of class Battleship1DBoard here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Battleship1DBoard
{
    private Battleship1D[] battleBoard;
    private int count5 = 1;
    private int count4 = 1;
    private int count3 = 2;
    private int count2 = 1;
    public Battleship1DBoard(int a)
    {
        battleBoard = new Battleship1D[a];
    }
    public void placeShip(int type, int place, String direction)
    {
        int placementCounter = 0;
        if(type == 5 && count5 != 0){
            Battleship1D length5 = new Battleship1D(5);
            while (true){
                placementCounter++;
                /*if (direction.toUpperCase.equals("RIGHT")){
                    if (){//fit right
                        
                    } else if(){//fit left comment out here, add to other
                        
                    } else {
                    
                    }
                } else {
                    if (){//fit left
                        
                    } else if(){//fit right comment out here, add to other
                        
                    } else {
                        if (placementCounter == 50){
                            System.out.println("Could not place.")
                            break;
                        }
                    }
                }*/
            }
        } else if (type == 4 && count4 != 0){
            Battleship1D length4 = new Battleship1D(4);
        } else if (type == 3 && count3 != 0){
            Battleship1D length3 = new Battleship1D(3);
        } else if (type == 2 && count2 != 0){
            Battleship1D length2 = new Battleship1D(2);
        } else {
            System.out.println("Cannot place: Ship Error");
        }
    }
    public void randomPlaceShip(int type)//above but with random num gen
    {
        
    }
    public String shoot(int a)
    {
        if (battleBoard[a].placement() == true && battleBoard[a].health() > 1){
          return "Hit"; 
        } else if(battleBoard[a].placement() == true && battleBoard[a].health() == 1){
            return "Sunk";
        } else {
            return "Miss";
        }
    }
}
