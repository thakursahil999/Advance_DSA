import java.util.HashMap;
class C{
    public static int[] twoSum(int[] nums,int target){
     HashMap<Integer,Integer> map = new HashMap<>();
     for(int i=0;i<nums.length;i++){
        int diff=target-nums[i];
        if(map.containsKey(diff)){
            return new int[]{map.get(diff),i};
        }
        map.put(nums[i],i);
    }
    return new int[]{};
}
    public static void main(String[] args) {
        int[]result =C.twoSum(new int[]{2,7,0,9,3}, 9);
        for(int i : result){
            System.out.print(i+ " ");
        }
    }
}