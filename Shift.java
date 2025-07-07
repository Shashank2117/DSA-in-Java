public class Shift {
    
    public static void main(String[] args) {
        
        // i/p => [1,2,3,4]
        // o/p => [2,3,4,1]

        System.out.println("[1,2,3,4,5]");
        int []arr = {1,2,3,4,5};

        int first = arr[0];
        for(int i=1; i<arr.length; i++){

            arr[i-1] = arr[i];
        }

        arr[arr.length-1] = first;

        // printing
        System.out.println("shifting to left ");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
