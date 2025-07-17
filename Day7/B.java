//prefix sum
class B{
    public static void main(String[] args){
        int[] arr={2,4,6,5,7};
        int[] arr1=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            if(i == 0){
                arr1[i]=arr[i];
            }else{
                 arr1[i]= arr[i]+arr[i-1];
            }
            
        }
        
        for(int next : arr1){
            System.out.println(next);
        }
    }
}