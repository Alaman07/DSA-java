public class FactOrSum {
    public static int fact(int n)
    {
        if(n == 1){
            return 1;
        }
        return n * fact(n-1);
    }
    public static int sum(int n){
        if(n==1) {
            return 1;
        }
        return n + sum(n-1);
    }
    public static void main(String[] args) {
        System.out.println("Factorial : " + fact(5));
        System.out.println("Sum : " + sum(20));
    }
}
