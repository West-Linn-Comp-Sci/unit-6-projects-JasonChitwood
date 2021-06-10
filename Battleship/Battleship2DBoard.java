import java.util.ArrayList;//possibly unnecesary

/**
 * Write a description of class BattleshipGame here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Battleship2DBoard //add end game lockout if all boats gone
{
    private Battleship1D[][] battleBoard;
    private int count5 = 1;
    private int count4 = 2;
    private int count3 = 3;
    private int count2 = 4;
    private int boatCount = 10;//used for end of game
    private ArrayList<Integer[]> missGuess = new ArrayList<Integer[]>(1);//unnecesary with button lockouts
    private ArrayList<Integer[]> hitGuess = new ArrayList<Integer[]>(1);//above
    public Battleship2DBoard()
    {
        battleBoard = new Battleship1D[10][10];
    }
    public void randomPlaceAllShip(){//create ships here and imput them in order to fix references??
        randomPlaceShip(5);
        randomPlaceShip(4);
        randomPlaceShip(4);
        randomPlaceShip(3);
        randomPlaceShip(3);
        randomPlaceShip(3);
        randomPlaceShip(2);
        randomPlaceShip(2);
        randomPlaceShip(2);
        randomPlaceShip(2);
    }
    public void randomPlaceShip(int type) //double logic for and fix col row //add loop to place all ships as second method??
    {
        int placementCounter = 0;
        int direction = (int)(Math.random() * (1 + 3));
        int placeRow = (int)(Math.random() * (((10 - 1) + 1)));
        int placeCol = (int)(Math.random() * (((10 - 1) + 1)));
        if(type == 5 && count5 != 0){
            Battleship1D length5 = new Battleship1D(5);
            while (true){
                placementCounter++;
                if (direction == 0){
                    if (placeRow + 5 < battleBoard.length){
                        for(int i = placeRow + 5; i > placeRow; i--){
                            battleBoard[i][0] = length5;
                        }
                        break;
                    }else if(placeRow - 5 > 0){
                        for(int i = placeRow - 5; i < placeRow; i++){
                            battleBoard[i][0] = length5;
                        }
                        break;//add second set of logic for up and down
                    } else {
                        if (placementCounter == 20){
                            System.out.println("Could not place.");
                            break;
                        }
                    }
                } else if (direction == 1){
                    if (place - 5 > 0){
                        for(int i = place - 5; i < place; i++){
                            battleBoard[i][0] = length5;
                        }
                        break;
                    }else if(place + 5 < battleBoard.length){
                        for(int i = place + 5; i > place; i--){
                            battleBoard[i][0] = length5;
                        }
                        break;
                    } else {
                        if (placementCounter == 20){
                            System.out.println("Could not place.");
                            break;
                        }
                    }
                } else {//add second logic for up and down
                    System.out.println("Not a direction to place in.");
                    break;
                }
            }
        } else if (type == 4 && count4 != 0){
            Battleship1D length4 = new Battleship1D(4);
            while (true){
                placementCounter++;
                if (direction == 0){
                    if (place + 4 < battleBoard.length){
                        for(int i = place + 4; i > place; i--){
                            battleBoard[i][0] = length4;
                        }
                        break;
                    }else if(place - 4 > 0){
                        for(int i = place - 4; i < place; i++){
                            battleBoard[i][0] = length4;
                        }
                        break;
                    }else {
                        if (placementCounter == 20){
                            System.out.println("Could not place.");
                            break;
                        }
                    }
                } else if (direction == 1){
                    if (place - 4 > 0){
                        for(int i = place - 4; i < place; i++){
                            battleBoard[i][0] = length4;
                        }
                        break;
                    }else if(place + 4 < battleBoard.length){
                        for(int i = place + 4; i > place; i--){
                            battleBoard[i][0] = length4;
                        }
                        break;
                    }else {
                        if (placementCounter == 20){
                            System.out.println("Could not place.");
                            break;
                        }
                    }
                } else {
                    System.out.println("Not a direction to place in.");
                    break;
                }
            }
        } else if (type == 3 && count3 != 0){
            Battleship1D length3 = new Battleship1D(3);
            while (true){
                placementCounter++;
                if (direction == 0){
                    if (place + 3 < battleBoard.length){
                        for(int i = place + 3; i > place; i--){
                            battleBoard[i][0] = length3;
                        }
                        break;
                    }else if(place - 3 > 0){
                        for(int i = place - 3; i < place; i++){
                            battleBoard[i][0] = length3;
                        }
                        break;
                    }else {
                        if (placementCounter == 20){
                            System.out.println("Could not place.");
                            break;
                        }
                    }
                } else if (direction == 1){
                    if (place - 3 > 0){
                        for(int i = place - 3; i < place; i++){
                            battleBoard[i][0] = length3;
                        }
                        break;
                    }else if(place + 3 < battleBoard.length){
                        for(int i = place + 3; i > place; i--){
                            battleBoard[i][0] = length3;
                        }
                        break;
                    }else {
                        if (placementCounter == 20){
                            System.out.println("Could not place.");
                            break;
                        }
                    }
                } else {
                    System.out.println("Not a direction to place in.");
                    break;
                }
            }
        } else if (type == 2 && count2 != 0){
            Battleship1D length2 = new Battleship1D(2);
            while (true){
                placementCounter++;
                if (direction == 0){
                    if (place + 2 < battleBoard.length){
                        for(int i = place + 2; i > place; i--){
                            battleBoard[i][0] = length2;
                        }
                        break;
                    }else if(place - 2 > 0){
                        for(int i = place - 2; i < place; i++){
                            battleBoard[i][0] = length2;
                        }
                        break;
                    }else {
                        if (placementCounter == 20){
                            System.out.println("Could not place.");
                            break;
                        }
                    }
                } else if (direction == 1){
                    if (place - 2 > 0){
                        for(int i = place - 2; i < place; i++){
                            battleBoard[i][0] = length2;
                        }
                        break;
                    }else if(place + 2 < battleBoard.length){
                        for(int i = place + 2; i > place; i--){
                            battleBoard[i][0] = length2;
                        }
                        break;
                    }else {
                        if (placementCounter == 20){
                            System.out.println("Could not place.");
                            break;
                        }
                    }
                } else {
                    System.out.println("Not a direction to place in.");
                    break;
                }
            }
        } else {
            System.out.println("Cannot place: Ship Error");
        }
    }
    public int getHealth(int r, int c)//test
    {
        return battleBoard[r][c].health();
    }
    public String shoot(Integer a)//dont need guess lists if you get rid of buttons for guess //change to buttonPress void statement
    {
        if (hitGuess.contains(a) || missGuess.contains(a)){
            return "Already Guessed, try again";
        }else if(battleBoard[a] == null){//does not effect health, changes to circle
            //missGuess.add(a);
            return "Miss";
        }else if (battleBoard[a].placement() == true && battleBoard[a].health() > 1){ //same check, hits are x
            //hitGuess.add(a);
            battleBoard[a].hit();
            return "Hit"; 
        } else if(battleBoard[a].placement() == true && battleBoard[a].health() == 1){ //same check, sink is + on last hit piece
            //hitGuess.add(a);
            battleBoard[a].hit();
            return "Sunk";
        } else {
            //missGuess.add(a);
            return "Miss";
        }
    }
    public String toString()//change to graphic(no)
    {
        String boardPrint = "";
        for (Integer i = 0; i < battleBoard.length; i++){
            if (battleBoard[i] == null && missGuess.contains(i)){
                boardPrint += "U";
            } else if(battleBoard[i] == null) {//any missGuess
                boardPrint += "0";
            } else if(hitGuess.contains(i) && battleBoard[i].health() > 0){ //any hitGuessbattleBoard[i].placement() == true && battleBoard[i].maxHealth() == battleBoard[i].health
                boardPrint += "X";
            } else if(hitGuess.contains(i) && battleBoard[i].health() == 0){//battleBoard[i].placement() == true && (battleBoard[i].health()
                boardPrint += "#";
            } else {
                boardPrint += "0";
            }
        }
        return boardPrint;
    }
}
