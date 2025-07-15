import java.util.*;
class CREATION{
    public static void main(String [] args){
        int arr[] = new int[5];
        int nums[] = {1,2,3};
        String fruits[] = {"apple","mango"};
        Scanner sc = new Scanner(System.in);
        System.out.println("enter array elements: ");
        for(int i=0; i<5; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println();

        for(int i=0; i<5; i++){
            System.out.println(arr[i] + " index : " + i);
        }
        
    }
}