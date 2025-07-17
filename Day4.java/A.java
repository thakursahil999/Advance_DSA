import java.util.ArrayList;
import java.util.Collections;

class A{
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(13);
        arr.add(54);
        arr.add(9);
        arr.add(63);

        System.out.println(arr);
        Collections.sort(arr);

        System.out.println(arr);

    }
}

// [13, 54, 9, 63]
// [9, 13, 54, 63]