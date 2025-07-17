class A{
    public static void main(String[] args){
        int[] x = {1,2,3,4,5,6,7};
        int k=3;
        int even=0;
        for (int i =0;i<k;i++){
            if(x[i]%2 == 0){
                even++;
            }
        }
        System.out.println(even);

        for(int i=k;i<x.length;i++){
            if(x[i]%2==0){
                even++;
            }
            else if(x[i-k]%2 == 0){
                even--;
            }
            System.out.println(even);
        }
    }
}