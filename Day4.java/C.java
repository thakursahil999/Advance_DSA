import java.util.ArrayList;
import java.util.Collections;

class C{
    public static void main(String[] args) {
        int even=0;
        int odd=0;
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(13);
        arr.add(54);
        arr.add(9);
        arr.add(63);

        System.out.println(arr);
        for(int next : arr){
            if(next%2==0){
                even++;
            }
            else
                odd++;
        }
        System.out.println("The Even Number count is : "+even);
        System.out.println("The Odd Number Count is :"+odd);

    }
}