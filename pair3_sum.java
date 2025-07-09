

public class pair3_sum {
    public static void main(String[] args) {
        int []nums = {-2,1,-3,4,-1,2,1,-5,4};
        // maxSubArray(nums);
        System.out.println("Max subarray sum is = " + maxSubArray(nums));
    }




    public static int maxSubArray(int []nums){
        // int max = Integer.MIN_VALUE;
        // int k = 4;
        // int n = nums.length;

        // for(int i=0; i<=n-k; i++){
        //     int currSum = 0;

        //     for(int j=1; j<i+k; j++){
        //         currSum += nums[j];
        //         max = Math.max(currSum, max);
        //     }
        // }
        // return max;






        // curdien algorithm
        int currSum = 0;
        int maxSum = nums[0];

        for(int num : nums){
            currSum = Math.max(num, currSum + num);
            maxSum = Math.max(maxSum, currSum);
        }
        return maxSum;
    }



}
