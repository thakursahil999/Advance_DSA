class B{
    static int[] twoSum(int target,int[] nums){
            int temp =0 ;
            
            for(int i=0;i<nums.length;i++){
                temp = target-nums[i]; 
                for(int j=0;j<nums.length;j++){
                    if(i!=j && nums[j]==temp){
                        System.out.println(i + " " + j);
                        return new int[]{i , j};
                    }
                }
            }
            return new int[]{};
    }
    public static void main(String[] args) {
        B.twoSum(9, new int[]{2,7,9,0,5});
    }
}