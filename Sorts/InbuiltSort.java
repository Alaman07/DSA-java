// package for sorting array
import java.util.Arrays;

//package for reverse order
import java.util.Collections;

public class InbuiltSort{
    
    public static void printArray(int nums[]){
        for(int i=0; i<nums.length; i++)
        {
            System.out.print(" " + nums[i]);
        }
    }

    public static void printArray(Integer nums[]){
        for(int i=0; i<nums.length; i++)
        {
            System.out.print(" " + nums[i]);
        }
    }

    public static void main(String [] args){
        int nums[] = {5,2,1,4,3};
        Arrays.sort(nums); // time complexity O(n log n)
        printArray(nums);
               
        System.out.println("\n==================================");
        
        //sorting in descending order
        Integer revNums[] = {1,2,3,4,5}; //using wrapper class because
                                        // reverseOrder works only on object
                    
        Arrays.sort(revNums, Collections.reverseOrder());
        System.out.println("Array in descending order: ");
        printArray(revNums);
    }
}