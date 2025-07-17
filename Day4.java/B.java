import java.util.ArrayList;
import java.util.Collections;

class B{
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(13);
        arr.add(54);
        arr.add(9);
        arr.add(63);

        System.out.println(arr);
        for(int next : arr){
            if(next%2==0){
                System.out.println(next +" Even");
            }
            else
                System.out.println(next + " Odd");
        }

    }
}