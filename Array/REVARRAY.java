import java.util.*;

public class REVARRAY {

    public static void reverse(int nums[]){
        int first = 0, last = nums.length-1;
        while (first < last) {
            int temp = nums[last];
            nums[last] = nums[first];
            nums[first] = temp;

            first++;
            last--;
        }
    }


    public static void main(String[] args) {
        int nums[] = {1,2,3,4,5,7,9};
        reverse(nums);
        for(int i=0; i<nums.length; i++){
            System.out.print(nums[i] + " ");
        }
        System.out.println();
    }
}