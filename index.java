import java.util.Arrays;
public class index {

    static int ABC(int[]nums1, int[]nums2){
        
        // median of the array
        int size = nums1.length + nums2.length;

        int []nums3 = new int[size];

        for(int i=0; i<nums1.length; i++){
            nums3[i] = nums1[i];
        }

        for(int j=0; j<nums2.length; j++){
            nums3[nums1.length+j] = nums2[j];
        }

        Arrays.sort(nums3);
        // finding median from this array
        int n = nums3.length;
        if(n % 2 == 0){
            return (nums3[n/2-1] + nums3[n/2]) / 2.0;
        }else{
            return nums3[n/2];
        }


    }
    public static void main(String[] args) {

        int []nums1 = {3,2};
        int []nums2 = {1,4};

        ABC(nums1, nums2);
        




    }
    
}
