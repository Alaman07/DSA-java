// write function to print n numbers

public class RecEx {
    public static void print(int n)
    {
        //this is called base condition, this is where our function stops making recursive calls
        if(n > 5){
            return;
        }

        //this is the recursive call
        System.out.println(n);
        print(n+1);
        
    }
    public static void main(String[] args) {
        print(1);
    }
}
