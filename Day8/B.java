class B{
    public static void main(String[] args) {
        int[] nums = {1,1,2,3,3,4,5,6,6};
        int index = 1;
        if(nums.length == 0){
            System.out.println(index = 0);
        }

       else{
         for(int i=1;i<nums.length;i++){
            if(nums[i]!=nums[i-1]){
                nums[index]=nums[i];
                index++;
            }
        }
        System.out.println(index);
       }
    }
}