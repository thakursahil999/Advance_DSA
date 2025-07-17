import java.util.Scanner;
import java.util.ArrayList;

class G{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value :");

        int a = sc.nextInt();

        ArrayList<Integer> arr = new ArrayList<>();

        arr.add(12);
        arr.add(15);
        arr.add(90);
        arr.add(60);

        boolean isPresent = false;
        for(int next : arr){
            if(next == a){
                isPresent=true;
                break;
            }
            else{
                isPresent=false;
            }
        }
        if(isPresent){
            System.out.println("The Value  is Present in the ArrayList record ");
        }
        else
           System.out.println("The Value is Not Present in the ArrayList record ");
    }
}