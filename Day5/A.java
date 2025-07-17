// Two Sum

class A{
    public static void main(String[] args) {
        int[] nums = {2,7,9,0,5};
        int temp =0 ;
        int target=9;
        for(int i=0;i<nums.length;i++){
            temp = target-nums[i]; 
            for(int j=0;j<nums.length;j++){
                if(i!=j && nums[j]==temp){
                    System.out.println(i + " " + j);
                    return ;
                }
            }
        }
    }
}