//binary search recursive
public class BS {
    public static int search(int arr[], int target, int st, int en){
        if( st > en){
            return -1;
        }
        int m = st + (en - st) / 2;
        if(arr[m] == target){
            return m;
        } 
        if(target < arr[m]){
           return search(arr, target, st, m - 1 );
        }
        return search(arr, target, m + 1, en);
    }
    public static void main(String[] args) {
        
        int[] arr = {22,32,34,55};
        System.out.println(search(arr,22, 0, arr.length));
    }
}
