public class MAXSUBSUM {
    
    //used kadanes algorithm
    public static int maxSubArraySum(int nums[]){
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
        int ans = maxSubArraySum(nums);

        System.out.println("Maximum subarray sum : " + ans);
    }
}