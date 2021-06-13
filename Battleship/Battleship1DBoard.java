
/**
 * Write a description of class Battleship1DBoard here.
 *
 * @author Jason Chitwood
 * @version 1.8
 */
import java.util.*;
public class Battleship1DBoard
{
    private Battleship1D[] battleBoard;
    private int count5 = 1;
    private int count4 = 1;
    private int count3 = 2;
    private int count2 = 1;
    private ArrayList<Integer> missGuess = new ArrayList<Integer>(1);
    private ArrayList<Integer> hitGuess = new ArrayList<Integer>(1);
    public Battleship1DBoard(int a)
    {
        battleBoard = new Battleship1D[a];
    }
    /*public void placeShip(int type, int place, String direction) //have it check if it goes on top of another ship with if slot equalls null
    {
        int placementCounter = 0;
        if(type == 5 && count5 != 0){
            Battleship1D length5 = new Battleship1D(5);
            while (true){
                placementCounter++;
                if (direction.toUpperCase().equals("RIGHT")){
                    if (place + 5 < battleBoard.length){
                        for(int i = place + 5; i > place; i--){
                            battleBoard[i] = length5;
                        }
                        break;
                    }else {
                        if (placementCounter == 20){
                            System.out.println("Could not place.");
                            break;
                        }
                    }
                } else if (direction.toUpperCase().equals("LEFT")){
                    if (place - 5 > 0){
                        for(int i = place - 5; i < place; i++){
                            battleBoard[i] = length5;
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
        } else if (type == 4 && count4 != 0){
            Battleship1D length4 = new Battleship1D(4);
            while (true){
                placementCounter++;
                if (direction.toUpperCase().equals("RIGHT")){
                    if (place + 4 < battleBoard.length){
                        for(int i = place + 4; i > place; i--){
                            battleBoard[i] = length4;
                        }
                        break;
                    }else {
                        if (placementCounter == 20){
                            System.out.println("Could not place.");
                            break;
                        }
                    }
                } else if (direction.toUpperCase().equals("LEFT")){
                    if (place - 4 > 0){
                        for(int i = place - 4; i < place; i++){
                            battleBoard[i] = length4;
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
                if (direction.toUpperCase().equals("RIGHT")){
                    if (place + 3 < battleBoard.length){
                        for(int i = place + 3; i > place; i--){
                            battleBoard[i] = length3;
                        }
                        break;
                    }else {
                        if (placementCounter == 20){
                            System.out.println("Could not place.");
                            break;
                        }
                    }
                } else if (direction.toUpperCase().equals("LEFT")){
                    if (place - 3 > 0){
                        for(int i = place - 3; i < place; i++){
                            battleBoard[i] = length3;
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
                if (direction.toUpperCase().equals("RIGHT")){
                    if (place + 2 < battleBoard.length){
                        for(int i = place + 2; i > place; i--){
                            battleBoard[i] = length2;
                        }
                        break;
                    }else {
                        if (placementCounter == 20){
                            System.out.println("Could not place.");
                            break;
                        }
                    }
                } else if (direction.toUpperCase().equals("LEFT")){
                    if (place - 2 > 0){
                        for(int i = place - 2; i < place; i++){
                            battleBoard[i] = length2;
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
    }*/
    public void randomPlaceShip(int type)
    {
        int placementCounter = 0;
        int direction = (int)(Math.random() * (1 + 1));
        int place = (int)(Math.random() * (((battleBoard.length - 1) + 1)));
        if(type == 5 && count5 != 0){
            Battleship1D length5 = new Battleship1D(5);
            while (true){
                placementCounter++;
                if (direction == 0){
                    if (place + 5 < battleBoard.length){
                        for(int i = place + 5; i > place; i--){
                            battleBoard[i] = length5;
                        }
                        break;
                    }else if(place - 5 > 0){
                        for(int i = place - 5; i < place; i++){
                            battleBoard[i] = length5;
                        }
                        break;
                    } else {
                        if (placementCounter == 20){
                            System.out.println("Could not place.");
                            break;
                        }
                    }
                } else if (direction == 1){
                    if (place - 5 > 0){
                        for(int i = place - 5; i < place; i++){
                            battleBoard[i] = length5;
                        }
                        break;
                    }else if(place + 5 < battleBoard.length){
                        for(int i = place + 5; i > place; i--){
                            battleBoard[i] = length5;
                        }
                        break;
                    } else {
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
        } else if (type == 4 && count4 != 0){
            Battleship1D length4 = new Battleship1D(4);
            while (true){
                placementCounter++;
                if (direction == 0){
                    if (place + 4 < battleBoard.length){
                        for(int i = place + 4; i > place; i--){
                            battleBoard[i] = length4;
                        }
                        break;
                    }else if(place - 4 > 0){
                        for(int i = place - 4; i < place; i++){
                            battleBoard[i] = length4;
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
                            battleBoard[i] = length4;
                        }
                        break;
                    }else if(place + 4 < battleBoard.length){
                        for(int i = place + 4; i > place; i--){
                            battleBoard[i] = length4;
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
                            battleBoard[i] = length3;
                        }
                        break;
                    }else if(place - 3 > 0){
                        for(int i = place - 3; i < place; i++){
                            battleBoard[i] = length3;
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
                            battleBoard[i] = length3;
                        }
                        break;
                    }else if(place + 3 < battleBoard.length){
                        for(int i = place + 3; i > place; i--){
                            battleBoard[i] = length3;
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
                            battleBoard[i] = length2;
                        }
                        break;
                    }else if(place - 2 > 0){
                        for(int i = place - 2; i < place; i++){
                            battleBoard[i] = length2;
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
                            battleBoard[i] = length2;
                        }
                        break;
                    }else if(place + 2 < battleBoard.length){
                        for(int i = place + 2; i > place; i--){
                            battleBoard[i] = length2;
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
    public int getHealth(int a)
    {
        return battleBoard[a].health();
    }
    /*public String shoot(Integer a)//add if already on either list cannot guess again
    {
        if (hitGuess.contains(a) || missGuess.contains(a)){
            return "Already Guessed, try again";
        }else if(battleBoard[a] == null){
            missGuess.add(a);
            return "Miss";
        }else if (battleBoard[a].placement() == true && battleBoard[a].health() > 1){
            hitGuess.add(a);
            battleBoard[a].hit();
            return "Hit"; 
        } else if(battleBoard[a].placement() == true && battleBoard[a].health() == 1){
            hitGuess.add(a);
            battleBoard[a].hit();
            return "Sunk";
        } else {
            missGuess.add(a);
            return "Miss";
        }
    }*/
    public int shoot(Integer a)//add if already on either list cannot guess again
    {
        if (hitGuess.contains(a) || missGuess.contains(a)){
            return 8;//"Already Guessed, try again";
        }else if(battleBoard[a] == null){
            missGuess.add(a);
            return 0;//"Miss";
        }else if (battleBoard[a].placement() == true && battleBoard[a].health() > 1){
            hitGuess.add(a);
            battleBoard[a].hit();
            return 1;//"Hit"; 
        } else if(battleBoard[a].placement() == true && battleBoard[a].health() == 1){
            hitGuess.add(a);
            battleBoard[a].hit();
            return 2;//"Sunk";
        } else {
            missGuess.add(a);
            return 0;//"Miss";
        }
    }
    public String randShoot()//add if already on either list cannot guess again
    {
        Integer a = (int)(Math.random() * (battleBoard.length - 1));
        if (hitGuess.contains(a) || missGuess.contains(a)){
            return "Already Guessed, try again";
        }else if(battleBoard[a] == null){
            missGuess.add(a);
            return "Miss";
        }else if (battleBoard[a].placement() == true && battleBoard[a].health() > 1){
            hitGuess.add(a);
            battleBoard[a].hit();
            return "Hit"; 
        } else if(battleBoard[a].placement() == true && battleBoard[a].health() == 1){
            hitGuess.add(a);
            battleBoard[a].hit();
            return "Sunk";
        } else {
            missGuess.add(a);
            return "Miss";
        }
    }
    public String toString()//need to figure out printing miss (figure out health not messing with print)
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
