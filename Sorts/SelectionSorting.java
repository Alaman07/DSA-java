public class SelectionSorting{
        public static void printArray(int nums[]){
        for(int i=0; i<nums.length; i++)
        {
            System.out.print(" " + nums[i]);
        }
    }

    public static void selectionSort(int nums[]){
        for(int i=0; i<nums.length;i++)
        {
            int smallestPosition = i;
            for(int j=i+1; j<nums.length;j++)
            {
                if(nums[smallestPosition] > nums[j])
                {
                    smallestPosition = j;
                }
            }
            
            int temp = nums[smallestPosition];
            nums[smallestPosition] = nums[i];
            nums[i] = temp;
        }
    }

    public static void main(String[] args){
        int nums[] = {5,2,3,1,4};
        selectionSort(nums);
        printArray(nums);   
    }
}