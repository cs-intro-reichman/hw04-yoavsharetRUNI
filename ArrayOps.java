public class ArrayOps {
    public static void main(String[] args) {
        int[] test1 = {0, 1, 5, 4};
        int [] test2 = {4, 1, 4, 3, 0, 5, 4};
        System.err.println(containsTheSameElements(test1, test2));
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
        int[] largest_array = (countUnique(array1) > countUnique(array2)) ? array1 : array2;
        int[] smallest_array = (countUnique(array1) < countUnique(array2)) ? array1 : array2;
        
        for(int i=0; i<largest_array.length; i++){
            if(count(smallest_array, largest_array[i]) == 0){
                return false;
            }
        }   
        return true;
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

    /**
     * 
     * @param array
     * @param value
     * @param index
     * @return retruns true if the value appears in the array 
     * before the given index; false otherwise
     */
    public static boolean contains(int[] array, int value, int index){
        for(int i = 0; i<index; i++){
            if(array[i] == value){
                return true;
            }
        }
        return false;
    }

    /**
     * 
     * @param array
     * @return count of unique values in the given array
     */
    public static int countUnique(int[] array){
        int count = 0;
        for (int i = 0; i<array.length; i++){
            count = contains(array, array[i], i) ? count : count + 1;
        }
        return count;
    }

    /**
     * 
     * @param array
     * @return new array, with unique values
     */
    public static int[] unique(int[] array){
        int[] res = new int[countUnique(array)];
        int res_index = 0;
        for(int i=0; i<array.length; i++){
            if(!contains(array, array[i], i)){
                res[res_index++] = array[i];
            }
        }
        return res;
    }
}
