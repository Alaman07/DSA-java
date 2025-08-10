public class RevANum {
    //sometimes you need some additional variabbles in the arguements
    static int sum = 0;
    public static int rev(int n) {
        if( n == 0) {
            return 0;
        }
        int digit = n % 10;
        sum = sum * 10 + digit;
        rev(n/10);
        return sum;
    }
    public static void main(String[] args) {
        System.out.println(rev(1234));
    }
}
