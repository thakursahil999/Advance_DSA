class C{
    public static void main(String[] args){
        int[] arr = {1,-1,2,-3,5,-8,9};

        int k= 3;
        int count = 0;
        for(int i=0;i<k;i++){
            if(arr[i]<0){
                count++;
            }
        }
        for(int i = k;i<arr.length;i++){
                if(arr[i-k]<0){
                    count--;
                }
                if(arr[i]<0){
                    count++;D
                }
                System.out.println(count);
            }
    }
}