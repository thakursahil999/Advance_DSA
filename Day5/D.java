import java.util.Arrays;
class D{
    public static void main(String[] args) {
        int[] num1 = {1,9,3,0,5,6};
        int[] num2 = {7,8,10};
        int[] num3 =new int[num1.length+num2.length];

        for(int i = 0;i<num1.length;i++){
            num3[i]=num1[i];
        }
        for(int j=0;j<num2.length;j++) {   
            num3[num1.length+j] = num2[j];
        }
        Arrays.sort(num3);

        for(int next:num3){
            System.out.print(next + " ");
        }
        
        System.out.println();
        float median ;

        if(0+(num3.length-1) % 2 !=0){
            median = (0+num3.length-1)/2;         
        }
        else{
            int a= num3.length/2;
            median = (num3[a]+num3[a-1])/2;
        }
        System.out.println(median);
    }
}