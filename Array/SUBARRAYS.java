public class SUBARRAYS{
    public static void printSubArrays(int nums[]){
        int ts = 0;
        for(int i=0; i<nums.length; i++)
        {
            for(int j=i+1; j<nums.length; j++)
            {
                for(int k=i; k<=j; k++)
                {
                    System.out.print(nums[k] + " ");
                }
                ts++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.print("Total subarrays: " + ts);
    }
    public static void main(String[] args){
        int nums[] = {2,4,5,6};
        printSubArrays(nums);
    }
}