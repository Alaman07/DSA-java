// Note: Counting sort is effective when the range between the smallest
//  and largest numbers in your data is not too large. 
// Valid for counting sort (small range):

// Array: {3, 1, 2, 4, 3, 2, 1}
// The smallest value is 1, the largest is 4. The range is 4 - 1 = 3 (very small). 
// Counting sort is efficient here.

public class CountingSorting{
    public static void printArray(int nums[]){
        for(int i=0; i<nums.length; i++)
        {
            System.out.print(" " + nums[i]);
        }
    }

    public static void countingSort(int nums[])
    {
        int largest = Integer.MIN_VALUE;
        for(int i=0; i<nums.length;i++)
        {
            largest = Math.max(largest, nums[i]);
        }
        
        int count[] = new int[largest+1];
        for(int i=0; i<nums.length;i++)
        {
            count[nums[i]]++;
        }

        int j=0;
        for(int i=0; i<count.length; i++)
        {
            while(count[i] > 0)
            {
                nums[j] = i;
                j++;
                count[i]--;
            }
        }

    }

    public static void main(String[] args)
    {
        int nums[] = {5,4,2,3,1};
        countingSort(nums);
        printArray(nums);
    }
}