//maximum subarray problem 53
class C{
    public static int maxSubArray(int[] nums){
        int max = Integer.MIN_VALUE;
        int size=3;
        for(int i=0;i<=nums.length-size;i++){
            int currsum = 0;
            for(int j=i;j<i+size;j++){  // additional as compare to A.java
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