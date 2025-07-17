import java.util.ArrayList;

class F{
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(13);
        arr.add(54);
        arr.add(9);
        arr.add(63);

        System.out.println(arr);

        arr.set(4,8888);  // gives index out of bounds exception because it replace the already available index value it cannot directly add the value to the new index like add()
        System.out.println(arr);

    }
}
