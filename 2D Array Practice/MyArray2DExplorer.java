
/**
 * Write a description of class sdgf here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MyArray2DExplorer {
    public static void main(String[] args) {
        int array [][] = {  {4,1,8,5},
                            {0,2,3,4},
                            {6,6,2,2} };
        MyArray2DExplorer exp = new MyArray2DExplorer();

        System.out.println("Test evenRow: \n Row w/ odd, Expecting: false \n Actual: " + exp.evenRow(array,0));
        System.out.println("Test evenRow: \n Row w/o odd, Expecting: true \n Actual: " + exp.evenRow(array,2));

        System.out.println();

        System.out.println("Test oddColSum: \n Col w/ odd Sum, Expecting: true \n Actual: " + exp.oddColSum(array,1));
        System.out.println("Test oddColSum: \n Col w/ even, Expecting: false \n Actual: " + exp.oddColSum(array,0));

        System.out.println();


        System.out.print("Test minRow: \n Expecting: {0 2 3 4} \n Actual: {");
        int [] row = exp.minInRow(array);
        for(int i = 0; i < row.length; i++){
            System.out.print(row[i] + " ");
        }
        System.out.print("]");

    }
    public int[] minInRow(int[][] nums){
        int min = nums[0][0];
        int[] minArray = nums[0];
        for(int i = 0; i < nums.length; i++){//row
            for(int j = 0; j < nums[i].length; j++){//colum
                if (nums[i][j] < min){
                    min = nums[i][j];
                    minArray = nums[i];
                }
            }
        }
        for(int i = 0; i < nums.length; i++){//row
            for(int j = 0; j < nums[i].length; j++){//colum
                if (nums[i][j] == min){
                    return nums[i];
                }
            }
        }
        return minArray;
    }
    public boolean oddColSum(int[][] nums, int col){
        int answer = 0;
        for(int row = 0; row < nums.length; row++){
            answer += nums[row][col];
        }
        if (answer % 2 != 0){
            return true;
        } else {
            return false;
        }
    }
    public boolean evenRow(int[][] mat, int row){
        for (int i = 0; i < mat[row].length; i++){
            if (mat[row][i] % 2 != 0){
                return false;
            }
        }
        return true;
    }
    public int minRow(int[][] nums,int row){
        int min = nums[row][0];
        for (int i = 0; i < nums[row].length; i++){
            if (nums[row][i] < min){
                    min = nums[row][i];
                }
        }
        return min;
    }
    public int[] colMaxs(int[][] matrix){ 
        int[] largeArray = new int[matrix.length];
        int max;
        for(int i = 0; i < matrix.length; i++){//row
            max = 0;
            for(int j = 0; j < matrix[i].length; j++){//colum
                if (j == (matrix[i].length-1)){
                    if (matrix[i][j] > max){
                        max = matrix[i][j];
                    }
                    largeArray[i] = max;
                } else {
                    if (matrix[i][j] > max){
                        max = matrix[i][j];
                    }
                }
            }
        }
        return largeArray;
    }
    public int[] allRowSums(int[][] data){
        int[] sumArray = new int[data.length];
        int sum;
        for(int i = 0; i < data.length; i++){//row
            sum = 0;
            for(int j = 0; j < data[i].length; j++){//colum
                if (j == (data[i].length-1)){
                    sum += data[i][j];
                    sumArray[i] = sum;
                } else {
                    sum += data[i][j];
                }
            }
        }
        return sumArray;
    }
    public double[] averageCol(int[][] nums){ //how to loop w/out null exceptions on non rectangular arrays?? 
        double[] toReturn = new double[nums[0].length];
        for(int i = 0; i < nums[0].length; i++) 
        {
            double max = nums[0][i];
            for(int j = 0; j < nums.length; j++)
            {
                if(nums[j][i] > max)
                {
                    max = nums[j][i];
                }
            }
            if( i < toReturn.length)
            {
                toReturn[i] = max;
            }
        }
        return toReturn;
    }
    public int smallEven(int[][] matrix){
        int min = matrix[0][0];
        for(int i = 0; i < matrix.length; i++){//row
            for(int j = 0; j < matrix[i].length; j++){//colum
                if (matrix[i][j] < min && matrix[i][j] % 2 == 0){
                    min = matrix[i][j];
                }
            }
        }
        return min;
    }
    public int biggestRow(int[][] nums){
        int tempMax = 0;
        int max = 0;
        int maxIndex = 0;
        for(int i = 0; i < nums.length; i++){//row
            tempMax = 0;
            for(int j = 0; j < nums[i].length; j++){//colum
                if (j == (nums[i].length-1)){
                    tempMax += nums[i][j];
                    if (tempMax > max){
                        max = tempMax;
                        maxIndex = i;
                    }
                } else {
                    tempMax += nums[i][j];
                }
            }
        }
        return maxIndex;
    }
}
