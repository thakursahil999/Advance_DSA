import java.util.ArrayList;

class D{
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(13);
        arr.add(54);
        arr.add(9);
        arr.add(63);

        System.out.println(arr);
       
        arr.add(2,999);
        System.out.println(arr);
    }
}
