
/**
 * Write a description of class FreqChart here.
 *
 * @author Jason Chitwood
 * @version 4/28/21
 */
import java.util.*;
public class FreqChart
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int userIn;
        int[] freqList = new int[10]; 
        System.out.println("\nPlease keep entering numbers from 1-100 (Enter 0 to stop): ");
        while(true){
            userIn = input.nextInt();
            if (userIn == 0){
                break;
            } else if (userIn > 0 && userIn <11){
                freqList[0]++;
            } else if (userIn > 10 && userIn <21){
                freqList[1]++;
            } else if (userIn > 20 && userIn <31){
                freqList[2]++;
            } else if (userIn > 30 && userIn <41){
                freqList[3]++;
            } else if (userIn > 40 && userIn <51){
                freqList[4]++;
            } else if (userIn > 50 && userIn <61){
                freqList[5]++;
            } else if (userIn > 60 && userIn <71){
                freqList[6]++;
            } else if (userIn > 70 && userIn <81){
                freqList[7]++;
            } else if (userIn > 80 && userIn <91){
                freqList[8]++;
            } else if (userIn > 90 && userIn <101){
                freqList[9]++;
            } else {
                System.out.println("Not a valid Input");
            }
        }
        System.out.print("\n 1 - 10 | ");
        while (freqList[0] > 0){
            System.out.print("*");
            freqList[0] -= 1;
        }
        System.out.print("\n11 - 20 | ");
        while (freqList[1] > 0){
            System.out.print("*");
            freqList[1] -= 1;
        }
        System.out.print("\n21 - 30 | ");
        while (freqList[2] > 0){
            System.out.print("*");
            freqList[2] -= 1;
        }
        System.out.print("\n31 - 40 | ");
        while (freqList[3] > 0){
            System.out.print("*");
            freqList[3] -= 1;
        }
        System.out.print("\n41 - 50 | ");
        while (freqList[4] > 0){
            System.out.print("*");
            freqList[4] -= 1;
        }
        System.out.print("\n51 - 60 | ");
        while (freqList[5] > 0){
            System.out.print("*");
            freqList[5] -= 1;
        }
        System.out.print("\n61 - 70 | ");
        while (freqList[6] > 0){
            System.out.print("*");
            freqList[6] -= 1;
        }
        System.out.print("\n71 - 80 | ");
        while (freqList[7] > 0){
            System.out.print("*");
            freqList[7] -= 1;
        }
        System.out.print("\n81 - 90 | ");
        while (freqList[8] > 0){
            System.out.print("*");
            freqList[8] -= 1;
        }
        System.out.print("\n91 - 100| ");
        while (freqList[9] > 0){
            System.out.print("*");
            freqList[9] -= 1;
        }
    }
}
