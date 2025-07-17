import java.util.Arrays;
class E{
    static public double findMedianSortedArrays(int[] num1,int[] num2){
        int[] merge = new int[num1.length+num2.length];
        int idx=0;
        for(int x:num1){
            merge[idx]=x;
            idx++;
        }
        for(int x:num2){
            merge[idx]=x;
            idx++;
        }

        for(int x:merge){
            System.out.print(x+" ");
        }
        System.out.println();
        Arrays.sort(merge);
        for(int x:merge){
            System.out.print(x+" ");
        }

        System.out.println();
        int n=merge.length;
        if(n%2==0){
            return (merge[n/2-1]+merge[n/2])/2.0;
        }else{
            return merge[n/2];
        }
    }
    public static void main(String[] args) {
        int[] num1 ={2,54,8};
        int[] num2 ={9,6,7};

        double m=E.findMedianSortedArrays(num1,num2);
        System.out.println(m);
    }
}