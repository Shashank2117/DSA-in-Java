public class MergeArray {
    public static void main(String[] args) {

        int arr[] = {1,2,3,4,5};
        int arr2[] = {6,3,8,2,1};

        // Merge 2 arrays
        int size = arr.length + arr2.length;
        int arrSum[] = new int[size];
        for(int i=0; i<arr.length; i++){
            arrSum[i] = arr[i];
        }
        for(int j=0; j<arr2.length; j++){
            arrSum[arr.length+j] = arr2[j];
        }
        System.out.println("Merge array is : ");
        for(int k=0; k<arrSum.length; k++){
            System.out.print(arrSum[k] + " ");
        }




        // max element from merge array
        int max = arrSum[0];
        for(int i=0; i<arrSum.length; i++){
            if(max < arrSum[i]){
                max = arrSum[i];
            }
        }
        System.out.println();
        System.out.println("Max element is : " + max);




        // common element
        int arrCommon[] = new int[arr.length];
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr2.length; j++){
                if(arr[i] == arr2[j]){
                    arrCommon[i] = arr[i];
                }
            }
        } 
        System.out.println("Common Array Elements :");
        for(int k=0; k<arrCommon.length; k++){
            System.out.print(arrCommon[k] + " ");
        }




        // unique elements
        // int u1[] = {1,2,3,4};
        // int u2[] = {1,2,4,5};
        // for(int i=0; i<u1.length; i++){
        //     boolean data=false;
        //     for(int j=0; j<u2.length; j++){
        //         if(u1[i] == u2[j]){
        //             data=true;
                    
        //         }
        //     }
        //     if(data){
        //         System.out.println(u1[i]);
        //     }
        // }
    }
}
