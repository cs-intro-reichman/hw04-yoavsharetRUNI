public class ArrayOps {
    public static void main(String[] args) {
        int[] test = {0, 1, 3, 4, 5, 2, 7 ,8, 9, 10, 11};
        System.err.println(findMissingInt(test));
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
        // Write your code here:
        return 0;
    }

    public static boolean containsTheSameElements(int [] array1,int [] array2) {
        // Write your code here:
        return false;
    }

    public static boolean isSorted(int [] array) {
        // Write your code here:
        return false;
    }

}
