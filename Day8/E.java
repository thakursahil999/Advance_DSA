class E{
    public static int search(int[] nums,int target){
        int start = 0;
        int end = nums.length-1;
        while(start<=end){
            int mid = start+end/2;
            if(mid==target){
                return mid;
            }else{
                if(nums[start]>mid){
                    end = mid;
                    mid = (start+end)/2;
                    while(start<=end){
                        if(mid == target){
                            return mid;
                        }else if(nums[mid]<target){
                            start=mid+1;
                        }else{
                            end = start-1;
                        }
                    }
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] a ={4,5,6,7,0,1,2};
        int target = 6;
        System.out.println(search(a, target));
    }
}