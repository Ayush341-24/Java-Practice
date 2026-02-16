public class Day3{
    public static void main(String[] args) {
        int arr1[] = {1,2,3,4,5};
        for(int i=arr1.length -1; i>=0; i--){
            System.out.println(arr1[i]);
        }
        // 2D Array 
        int arr2[][] = {
            {1,2,3} , {4} , {5,6,7}
        };

        for(int i=0; i<arr2.length; i++){
            for(int j=0;j<arr2[i].length;j++){
                System.out.print(arr2[i][j] + " ");
            }
            System.out.println();
        }

        // Multidimensional Array
        int arr3[][][] = {
            {{1,2},{3}},{{11,12,13},{14,15,16}},{{21,22,23},{24,25}},{{31,32,33}}
        };
        for(int i=0; i<arr3.length; i++){
            for(int j=0; j<arr3[i].length;j++){
                for(int k=0; k<arr3[i][j].length;k++){
                    System.out.print(arr3[i][j][k] + " ");
                }
                System.out.println();
            }
        }
    }
}