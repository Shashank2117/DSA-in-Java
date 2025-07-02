
import java.util.Scanner;

public class index {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,77,3,4,2};

// max element in array
        int max = arr[0];
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println("Max element is : " + max);


// min element in array
        int min = arr[0];
        for(int i = 0; i < arr.length; i++){
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("Min element is : " + min);


// sum of array
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            sum = sum + arr[i];
        }
        System.out.println("Sum of arr is : " + sum);


// taking user input and printing array, max, min, sum.
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter length of array");
        int size = sc.nextInt();
        
        int arr2[] = new int[size];
        System.out.println("Enter element of array ");

        for(int i=0; i<size; i++){
            arr2[i] =sc.nextInt();
        }

        int max2 = arr2[0];
        for(int j=0; j<arr2.length; j++){
            // System.out.println("element " +  arr[j]);
            if (max2 < arr2[j]) {
                max2 = arr2[j];
            }
        }
        System.out.println("max element is : " + max2);

        int min2 = arr2[0];
        for(int k=0; k<arr2.length; k++){
            if (min2 > arr2[k]) {
                min2 = arr2[k];
            }
        }
        System.out.println("min element is : " + min2);







    } 
}
