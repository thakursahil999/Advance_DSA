import java.util.TreeSet;

class K{
    public static void main(String[] args) {
        TreeSet<Integer> set = new TreeSet<>();

        set.add(12);
        set.add(15);
        set.add(90);
        set.add(2);
        set.add(8);
        set.add(12); // duplicate record not allow
        System.out.println(set);  //[2, 8, 12, 15, 90]  // records is in sorted error
    }
}