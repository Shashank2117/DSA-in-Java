public class container {

    static int maxArea(int[]nums) {
        int max = Integer.MIN_VALUE;
        for(int i=0; i<nums.length; i++){
            int currSum = 0;
            for(int j=i+1; j<nums.length; j++){
                currSum += nums[j];
                max = Math.max(currSum, max);
            }
        }
        return max;
    }


    public static void main(String[] args) {
        int nums[] = {-2,1-3,-4,-1,2,1,-5,4};
        // maxArea(nums);
        System.out.println(maxArea(nums));
    }


}
