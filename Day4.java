public class Day4 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        printarr(arr);
        System.out.println();
        revarr(arr);
        System.out.println();
        evenarr(arr);
        System.out.println();
        oddarr(arr);
        System.out.println();
        evenarrcount(arr);
        // System.out.println();
        oddarrcount(arr);
        // System.out.println();
        sumarr(arr);
        // System.out.println();
        evenarrsum(arr);
        // System.out.println();
        oddarrsum(arr);
        primecount(arr);
        average(arr);
        minmax(arr);
        
    }
    // Printing function
    public static void printarr(int[] arr){
        int n = arr.length;
        for(int i=0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
    }
    // Reversing print arr
    public static void revarr(int[] arr){
        int n = arr.length;
        for(int i=n-1; i>=0; i--){
            System.out.print(arr[i] + " ");
        }
    }
    // Printing even 
     public static void evenarr(int[] arr){
        int n = arr.length;
        for(int i=0; i<n; i++){
            if(arr[i] % 2 == 0){
            System.out.print(arr[i] + " ");
            }
        }
    }
    // Printing odd
     public static void oddarr(int[] arr){
        int n = arr.length;
        for(int i=0; i<n; i++){
            if(arr[i] % 2 != 0){
            System.out.print(arr[i] + " ");
            }
        }
    }
    // Number of even 
    public static void evenarrcount(int[] arr){
        int n = arr.length;
        int count = 0;
        for(int i=0; i<n; i++){
            if(arr[i] % 2 == 0){
            count++;
            }
        }
        System.out.println(count);
    }
    // Odd count in arr
    public static void oddarrcount(int[] arr){
        int n = arr.length;
        int count = 0;
        for(int i=0; i<n; i++){
            if(arr[i] % 2 != 0){
            count++;
            }
        }
        System.out.println(count);
    }
    // Sum of arr
    public static void sumarr(int[] arr){
        int n = arr.length;
        int _sum = 0;
        for(int i=0; i<n; i++){
            _sum += arr[i];
        }
        System.out.println("sum of arr is " + _sum);
    }
    //sum of even 
     public static void evenarrsum(int[] arr){
        int n = arr.length;
        int _count = 0;
        for(int i=0; i<n; i++){
            if(arr[i] % 2 == 0){
            _count += arr[i];
            }
        }
        System.out.println(_count);
    }
    // Odd method
     public static void oddarrsum(int[] arr){
        int n = arr.length;
        int _count = 0;
        for(int i=0; i<n; i++){
            if(arr[i] % 2 != 0){
            _count += arr[i];
            }
        }
        System.out.println(_count);
    }
    // Prime Numbers in arr
    public static boolean prime(int n){
        if(n <= 1){return false;}
        for(int i=2; i*i<=n; i++){
            if(n % i == 0){return false;}
        }
        return true;
    }
     public static void primecount(int[] arr){
        int n = arr.length;
        int _count = 0;
        for(int i=0; i<n; i++){
        if(prime(arr[i])){
            _count++;
        }
        }
        System.out.println(_count);
    }
    //Average of arr
    public static void average(int[] arr){
        int n = arr.length;
        int _sum = 0;
        for(int i=0; i<n; i++){
            _sum += arr[i];
        }
        System.out.println("Average of arr is " + (_sum / n));
    }
    // Max and min in arr
    public static void minmax(int[] arr){
        int _max = arr[0] ;
        int _min = arr[0] ;
        for(int i=0; i<arr.length; i++){
            if(_max < arr[i]){_max = arr[i];}
            if(_min > arr[i]){_min = arr[i];}
        }
        System.out.println(_max);
        System.out.println(_min);
    }
}
