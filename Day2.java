import java.util.Scanner;
public class Day2{
    // Fibonacci function
    static int fib(int n){
        if(n == 0 || n == 1){
            return n;
        }
        return fib(n-1) + fib(n-2);
    }

    // Factorial function
    static int fac(int n){
        if(n == 1 || n == 0)return 1;
        return n * fac(n-1);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // Largest in an Array
        int[] arr = {10,23,2,34,55};
        int _max = arr[0];
        for(int val : arr){
            if(val > _max){
                _max = val;
            }
        }
        System.out.println("Largest value is " + _max);

        // Fibonacci Series
        System.out.println("Enter a number: ");
        int n =  sc.nextInt();
        System.out.println("Fibonacci of " + n + " is " + fib(n));

        // Factorial function 
        System.out.println("Factorial of " + n + " is " + fac(n));

        sc.close();
    }
}