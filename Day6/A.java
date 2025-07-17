//maximum subarray problem 53
class A{
    public static int maxSubArray(int[] nums){
        int max = Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            int currsum = 0;
            for(int j=i;j<nums.length;j++){
                currsum = currsum+nums[j];
                max = Math.max(currsum,max);
            }
        }
        return max;
    }
    public static void main(String[] args){

        int max = A.maxSubArray(new int[]{1,-2,3,4,-6,1,2,7});
        System.out.println(max);
    }

}