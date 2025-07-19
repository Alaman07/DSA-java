
// kadanes algorithm is an approach to find maximum sum of a 
// contigous subarray within one dimensional array of numbers,
// in simple words, it states that it is pointless to add the negative
// number in the subarray sum so instead discard that negative number
// (make it 0)

// How Kadane's Algorithm Works

// 1.Initialize Two Variables: One for the current sum (currentSum)
//  and another for the maximum sum found so far (maxSum). 

// 2.Iterate Through the Array: For each element, calculate the currentSum 
// by adding the element to the previous currentSum. 
// If the currentSum becomes negative, reset it to zero.
 
// 3.Update maxSum: If the currentSum is greater than maxSum, update maxSum.
 
// 4.Result: The value in maxSum is the maximum sum of a contiguous subarray.

public class KadanesAlgo {

    public static int kadanes(int nums[]){
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;
        
        for(int i=0;i<nums.length;i++)
        {
            currSum += nums[i];
            if(currSum < 0)
            {
               currSum = 0; 
            }
            maxSum = Math.max(currSum, maxSum);
        }
        return maxSum;
    }
    
    public static void main(String[] args){
        int nums[] = {2,-3,4,-2,5,8};
        int ans = kadanes(nums);

        System.out.println("Maximum subarray sum : " + ans);
    }
}