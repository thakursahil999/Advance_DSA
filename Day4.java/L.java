import java.util.TreeSet;

class L{
    public static void main(String[] args) {
        TreeSet<Integer> set = new TreeSet<>();

        set.add(12);
        set.add(15);
        set.add(90);
        set.add(2);
        set.add(8);
        set.add(12);
        System.out.println(set);  

        System.out.println(set.remove(90));
        System.out.println(set);
    }
}