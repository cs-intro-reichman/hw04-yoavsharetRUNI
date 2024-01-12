public class ArrayOps {
    public static void main(String[] args) {
        int[] test = {0, 1, 3, 4, 5, 2, 7 ,8, 9, 12, 11};
        System.err.println(secondMaxValue(test));
    }
    
    public static int findMissingInt (int [] array) {
        int arrayLength = array.length;
        int full_sum = 0;
        // calc the sum of all integers in the range [0, array.length]
        for(int i =0; i<=arrayLength; i++){
            full_sum +=i;
        }
        // full_sum - sum(input_array) = the missing digit
        for(int i=0; i<arrayLength; i++){
            full_sum -= array[i];
        }
        // full sum now contains the missing digit;
        return full_sum;
    }

    public static int secondMaxValue(int [] array) {
        // find max value
        int max = max(array);
        int[] removed_max = remove(array, max);
        // now, current max will be the second max value
        return max(removed_max);
    }

    public static boolean containsTheSameElements(int [] array1,int [] array2) {
        // Write your code here:
        return false;
    }

    public static boolean isSorted(int [] array) {
        // Write your code here:
        return false;
    }


    /**** Help functions ****/

    /**
     * 
     * @param array
     * @param n
     * @return number of times the integer n appears in array
     */
    public static int count(int[]array, int n){
        int count = 0;
        for(int i=0; i<array.length; i++){
            if(array[i] == n){
                count++;
            }
        }
        return count;
    }

    /**
     * 
     * @param array
     * @param n
     * @return A new int[] array, without n
     */
    public static int[] remove(int[]array, int n){
        int[] res = new int[array.length - count(array, n)];
        int res_index = 0;
        for(int i = 0; i < array.length; i++){
            if(array[i] != n){
                res[res_index++] = array[i];
            }
        }
        return res;
    }
     /**
      * 
      * @param array
      * @return max integer in the given array
      */
    public static int max(int[] array){
        int max_val = array[0];
        for(int i=1; i<array.length; i++){
            if(array[i]>max_val){
                max_val = array[i];
            }
        }
        return max_val;
    }

}
