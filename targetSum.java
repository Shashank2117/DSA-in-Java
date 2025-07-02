public class targetSum {

    void sum(){
        int []arr = {1,4,5,2};
        int target = 7;

        for(int i=0; i<arr.length; i++){
            for(int j=0; j<=i; j++){
                // int sum = arr[i] + arr[j];
                if(arr[i] + arr[j] == target){
                    // System.out.println(arr[i] + arr[j]);
                    
                }
            }
        }
    }



    void Max(){
        int arr[] = {1,1,-1,-2,3,4};

    }


    public static void main(String[] args) {
        targetSum tg = new targetSum();
        tg.sum();
        tg.Max();
    }
}
