import java.util.Scanner;
public class Day1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // Table of 8
        for(int i=1;i<=10;i++){
            System.out.println(8 + "*" + i + " = " + 8*i);
        }
        // Prime or not
        System.out.println("Enter a number");
        int num = sc.nextInt();
        int flag = 1;
        for(int i=2; i*i <= num; i++){
            if(num % i ==0 ){
                flag = 0;
                break;
            }
        }
        if(flag == 1){
            System.out.println("Prime Number");
        }
        else{
            System.out.println("Not a prime number");
        }
        // count the digits
        int temp = num;
        int count = 0;
        int count_even = 0;
        int count_odd = 0;
        int sum_even = 0 , sum_odd = 0 , sum = 0;
        while(temp > 0){
            count++;
            int rem = temp % 10;
            sum += rem;
            if(rem % 2 == 0){
                count_even++;
                sum_even += rem;
            }
            else{
                count_odd++;
                sum_odd += rem;
            }
            temp = temp / 10;
        }
        System.out.println("Number of digits is " + count);
        System.out.println("Even digits: " + count_even);
        System.out.println("Odd digits: " + count_odd);
        // Reverse of digits

        int a = 12345;
        int b = a;
        int ans = 0;
        while(b > 0){
            int _rem = b % 10;
            ans = 10 * ans + _rem;
            b = b / 10;
        }
        System.out.println("Reverse of number is " + ans);
        if(a == ans){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not a Palindrome");
        }
    }
}
