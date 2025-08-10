//Q. Count the number of zeros in a number
public class CountZeros {
    public static int Count(int n){
        return helper(n, 0);
    }
    //sometimes you need another functions called helper functions
    public static int helper(int n,int count){
        if(n == 0){
            return count;
        }
        int digit = n % 10;
        if(digit == 0){
            return helper(n/10, count+1);
        }
        return helper(n/10, count);
    }

    public static void main(String[] args) {
        System.out.println("Count of zeros: " + Count(100230));
    }
}
