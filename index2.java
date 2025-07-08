public class index2 {
    public static void main(String[] args) {
        int []arr = {3,5,7,9,2,8,11,43,12,14,15,16,12};

        int max = arr[0];
        int max2 = arr[0];

        for(int i=0; i<arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }else if (arr[i] > max2 && max2 < max) {
                max2 = arr[i];
            }
            
        }
        System.out.println(max);
        System.out.println(max2);
    }
}
