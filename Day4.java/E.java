import java.util.ArrayList;

class E{
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(13);
        arr.add(54);
        arr.add(9);
        arr.add(63);

        System.out.println(arr);

        arr.set(1,8888);
        System.out.println(arr);

    }
}
