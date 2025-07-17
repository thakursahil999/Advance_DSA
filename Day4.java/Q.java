// [1,2,3,4]
// [2,3,4,1]
// rotate the array by one
class Q{
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        for(int next:arr){
            System.out.print(next+ " ");
        }

        int first = arr[0];
        for(int i=1;i<arr.length;i++){
            arr[i-1]=arr[i];
        }
        arr[arr.length-1]=first;
        System.out.println("--------------");
        for(int next:arr){
            System.out.print(next + " ");
        }
    }
}