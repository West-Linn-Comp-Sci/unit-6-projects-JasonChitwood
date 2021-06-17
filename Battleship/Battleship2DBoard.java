/**
 * Write a description of class BattleshipGame here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Battleship2DBoard //add end game lockout if all boats gone
{
    private Battleship[][] battleBoard;
    public Battleship2DBoard()
    {
        battleBoard = new Battleship[7][7];
    }
    public void randomPlaceAllShip(){
        randomPlaceShip(5);
        randomPlaceShip(4);
        randomPlaceShip(4);
        randomPlaceShip(3);
        randomPlaceShip(3);
    }
    public void randomPlaceShip(int type) //fix overlap
    {
        int placementCounter = 0;
        int direction = (int)(Math.random() * (2));
        int placeRow = (int)(Math.random() * (((7 - 1) + 1)));
        int placeCol = (int)(Math.random() * (((7 - 1) + 1)));
        if(type == 5){
            Battleship length5 = new Battleship(5);
            boolean success = true;
            while (true){
                placementCounter++;
                if (direction == 0){
                    if (placeRow + 5 < 7){
                        for(int i = placeRow + 5; i > placeRow; i--){
                            if(battleBoard[i][placeRow] != null){
                                success = false;
                            }
                        }
                        for(int i = placeRow + 5; i > placeRow; i--){
                            if(success){
                                battleBoard[i][placeRow] = length5;
                            } else {
                                break;
                            }
                        } 
                        if(success){
                            break;
                        }
                    }else if(placeRow - 5 > 0){
                        for(int i = placeRow - 5; i < placeRow; i++){
                            if(battleBoard[i][placeCol] != null){
                                success = false;
                            }
                        }
                        for(int i = placeRow - 5; i < placeRow; i++){
                            if(success){
                                battleBoard[i][placeCol] = length5;
                            }
                        }
                        if(success){
                            break;
                        }
                    }else if(placeRow - 3 > 0){
                        for(int i = placeRow - 3; i < placeRow + 2; i++){
                            if(battleBoard[i][placeCol] != null){
                                success = false;
                            }
                        }
                        for(int i = placeRow - 3; i < placeRow + 2; i++){
                            if(success){
                                battleBoard[i][placeCol] = length5;
                            }
                        }
                        if(success){
                            break;
                        }
                    }else if (placeRow + 3 < 7){
                        for(int i = placeRow + 3; i > placeRow - 2; i--){
                            if(battleBoard[i][placeRow] != null){
                                success = false;
                            }
                        }
                        for(int i = placeRow + 3; i > placeRow - 2; i--){
                            if(success){
                                battleBoard[i][placeRow] = length5;
                            }
                        }
                        if(success){
                            break;
                        }
                    } else {
                        if (placementCounter == 100){
                            System.out.println("Could not place.");
                            break;
                        }
                    }
                } else if (direction == 1){
                    if (placeCol - 5 > 0){
                        for(int i = placeCol - 5; i < placeCol; i++){
                            if(battleBoard[placeRow][i] != null){
                                success = false;
                            }
                        }
                        for(int i = placeCol - 5; i < placeCol; i++){
                            if(success){
                                battleBoard[placeRow][i] = length5;
                            }
                        }
                        if(success){
                            break;
                        }
                    }else if(placeCol + 5 < 7){
                        for(int i = placeCol + 5; i > placeCol; i--){
                            if(battleBoard[placeRow][i] != null){
                                success = false;
                            }
                        }
                        for(int i = placeCol + 5; i > placeCol; i--){
                            if(success){
                                battleBoard[placeRow][i] = length5;
                            }
                        }
                        if(success){
                            break;
                        }
                    }else if (placeCol - 3 > 0){
                        for(int i = placeCol - 3; i < placeCol +2; i++){
                            if(battleBoard[placeRow][i] != null){
                                success = false;
                            }
                        }
                        for(int i = placeCol - 3; i < placeCol +2; i++){
                            if(success){
                                battleBoard[placeRow][i] = length5;
                            }
                        }
                        if(success){
                            break;
                        }
                    }else if(placeCol + 3 < 7){
                        for(int i = placeCol + 3; i > placeCol -2; i--){
                            if(battleBoard[placeRow][i] != null){
                                success = false;
                            }
                        }
                        for(int i = placeCol + 3; i > placeCol -2; i--){
                            if(success){
                                battleBoard[placeRow][i] = length5;
                            }
                        }
                        if(success){
                            break;
                        }
                    } else {
                        if (placementCounter == 100){
                            System.out.println("Could not place.");
                            break;
                        }
                    }
                } else {
                    placeRow = (int)(Math.random() * (((7 - 1) + 1)));
                    placeCol = (int)(Math.random() * (((7 - 1) + 1)));
                    System.out.println("Not a direction to place in.");
                    break;
                }
                placeRow = (int)(Math.random() * (((7 - 1) + 1)));
                placeCol = (int)(Math.random() * (((7 - 1) + 1)));
                direction = (int)(Math.random() * (2));
                success = true;
            }
        } else if (type == 4){
            Battleship length4 = new Battleship(4);
            boolean success = true;
            while (true){
                placementCounter++;
                if (direction == 0){
                    if (placeRow + 4 < 7){
                        for(int i = placeRow + 4; i > placeRow; i--){
                            if(battleBoard[i][placeRow] != null){
                                success = false;
                            }
                        }
                        for(int i = placeRow + 4; i > placeRow; i--){
                            if(success){
                                battleBoard[i][placeRow] = length4;
                            }
                        } 
                        if(success){
                            break;
                        }
                    }else if(placeRow - 4 > 0){
                        for(int i = placeRow - 4; i < placeRow; i++){
                            if(battleBoard[i][placeCol] != null){
                                success = false;
                            }
                        }
                        for(int i = placeRow - 4; i < placeRow; i++){
                            if(success){
                                battleBoard[i][placeCol] = length4;
                            }                        
                        }
                        if(success){
                            break;
                        }
                    } else {
                        placeRow = (int)(Math.random() * (((7 - 1) + 1)));
                        placeCol = (int)(Math.random() * (((7 - 1) + 1)));
                        if (placementCounter == 100){
                            System.out.println("Could not place.");
                            break;
                        }
                    }
                } else if (direction == 1){
                    if (placeCol - 4 > 0){
                        for(int i = placeCol - 4; i < placeCol; i++){
                            if(battleBoard[placeRow][i] != null){
                                success = false;
                            }
                        }
                        for(int i = placeCol - 4; i < placeCol; i++){
                            if(success){
                                battleBoard[placeRow][i] = length4;
                            }
                        }
                        if(success){
                            break;
                        }
                    }else if(placeCol + 4 < 7){
                        for(int i = placeCol + 4; i > placeCol; i--){
                            if(battleBoard[placeRow][i] != null){
                                success = false;
                            }
                        }
                        for(int i = placeCol + 4; i > placeCol; i--){
                            if(success){
                                battleBoard[placeRow][i] = length4;
                            }
                        }
                        if(success){
                            break;
                        }
                    } else {
                        if (placementCounter == 100){
                            System.out.println("Could not place.");
                            break;
                        }
                    }
                } else {
                    placeRow = (int)(Math.random() * (((7 - 1) + 1)));
                    placeCol = (int)(Math.random() * (((7 - 1) + 1)));
                    System.out.println("Not a direction to place in.");
                    break;
                }
                placeRow = (int)(Math.random() * (((7 - 1) + 1)));
                placeCol = (int)(Math.random() * (((7 - 1) + 1)));
                direction = (int)(Math.random() * (2));
                success = true;
            }
        } else if (type == 3){
            Battleship length3 = new Battleship(3);
            boolean success = true;
            while (true){
                placementCounter++;
                if (direction == 0){
                    if (placeRow + 3 < 7){
                        for(int i = placeRow + 3; i > placeRow; i--){
                            if(battleBoard[i][placeRow] != null){
                                success = false;
                            }
                        }
                        for(int i = placeRow + 3; i > placeRow; i--){
                            if(success){
                                battleBoard[i][placeRow] = length3;
                            }
                        } 
                        if(success){
                            break;
                        }
                    }else if(placeRow - 3 > 0){
                        for(int i = placeRow - 3; i < placeRow; i++){
                            if(battleBoard[i][placeCol] != null){
                                success = false;
                            }
                        }
                        for(int i = placeRow - 3; i < placeRow; i++){
                            if(success){
                                battleBoard[i][placeCol] = length3;
                            }
                        }
                        if(success){
                            break;
                        }
                    } else {
                        placeRow = (int)(Math.random() * (((7 - 1) + 1)));
                        placeCol = (int)(Math.random() * (((7 - 1) + 1)));
                        if (placementCounter == 100){
                            System.out.println("Could not place.");
                            break;
                        }
                    }
                } else if (direction == 1){
                    if (placeCol - 3 > 0){
                        for(int i = placeCol - 3; i < placeCol; i++){
                            if(battleBoard[placeRow][i] != null){
                                success = false;
                            }
                        }
                        for(int i = placeCol - 3; i < placeCol; i++){
                            if(success){
                                battleBoard[placeRow][i] = length3;
                            }
                        }
                        if(success){
                            break;
                        }
                    }else if(placeCol + 3 < 7){
                        for(int i = placeCol + 3; i > placeCol; i--){
                            if(battleBoard[placeRow][i] != null){
                                success = false;
                            }
                        }
                        for(int i = placeCol + 3; i > placeCol; i--){
                            if(success){
                                battleBoard[placeRow][i] = length3;
                            }
                        }
                        if(success){
                            break;
                        }
                    } else {
                        if (placementCounter == 100){
                            System.out.println("Could not place.");
                            break;
                        }
                    }
                } else {
                    placeRow = (int)(Math.random() * (((7 - 1) + 1)));
                    placeCol = (int)(Math.random() * (((7 - 1) + 1)));
                    System.out.println("Not a direction to place in.");
                    break;
                }
                placeRow = (int)(Math.random() * (((7 - 1) + 1)));
                placeCol = (int)(Math.random() * (((7 - 1) + 1)));
                direction = (int)(Math.random() * (2));
                success = true;
            }
        } else {
            System.out.println("Cannot place: Ship Error");
        }
    }
    public int getHealth(int r, int c)//test
    {
        return battleBoard[r][c].health();
    }
    public int shoot(int r, int c)
    {
        if(battleBoard[r][c] == null){
            return 0;//Miss
        }else if (battleBoard[r][c].placement() == true && battleBoard[r][c].health() > 1){
            battleBoard[r][c].hit();
            return 1;//Hit
        } else if(battleBoard[r][c].placement() == true && battleBoard[r][c].health() == 1){
            battleBoard[r][c].hit();
            return 2;//Sunk
        } else {
            return 0;//Miss
        }
    }
}
