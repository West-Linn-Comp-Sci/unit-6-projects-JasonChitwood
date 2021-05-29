
/**
 * Write a description of class ArrayFun here.
 *
 * @author JasonChitwood
 * @version 1.3
 */
import java.util.*;
public class ArrayFun
{
    private int[] nums;
    private int[] mixedNums;
    public ArrayFun(int[] arr)
    {
        nums = arr.clone();
        arrayMixup(arr);
    }
    public int[] getNums()
    {
        return nums;
    }
    public int[] getMixedNums()
    {
        return mixedNums;
    }
    private void arrayMixup(int[] in)
    {
        int[] tempArray = in.clone();
        mixedNums = in.clone();
        mixedNums[0] = tempArray[tempArray.length - 1];
        mixedNums[tempArray.length - 1] = tempArray[0];
        for (int i = 1; i < tempArray.length - 1; i++){
            if(tempArray[i] % tempArray[i-1] == 0){
                mixedNums[i] = tempArray[i] / tempArray[i-1] * tempArray[i+1];
            } else if (tempArray[i] > mixedNums[i + 1]){
                mixedNums[i] = tempArray[i] / tempArray[i+1];
            } else {
                mixedNums[i] = tempArray[i];
            }
        }
    }
    public int greatestDiff()
    {
        int numsNum1 = 0;
        int numsNum2 = 0;
        int mixedNumNums1 = 0;
        int mixedNumNums2 = 0;
        int temp = nums[0];
        int max;
        int min;
        ArrayList<Integer> tempList = new ArrayList<>();
        for (int i = 0; i < nums.length; i++){ 
             if(nums[i]>temp){
                temp = nums[i]; 
             }
        }
        numsNum1 = temp;
        tempList.add(temp);
        temp = mixedNums[0];
        for (int i = 0; i < mixedNums.length; i++){
             if(mixedNums[i]>temp){
                 temp = mixedNums[i];
             }
        }
        mixedNumNums1 = temp;
        tempList.add(temp);
        for (int i = 0; i < nums.length; i++){ 
             if(nums[i]<temp){
                temp = nums[i]; 
             }
        }
        numsNum1 = temp;
        tempList.add(temp);
        temp = mixedNums[0];
        for (int i = 0; i < mixedNums.length; i++){
             if(mixedNums[i]<temp){
                 temp = mixedNums[i];
             }
        }
        mixedNumNums1 = temp;
        tempList.add(temp);
        temp = mixedNums[0];
        max = Collections.max(tempList);
        min = Collections.min(tempList);
        return (max - min);
    }
}
