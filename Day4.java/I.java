import java.util.HashSet;
class I{
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("Rahul");
        set.add("Akash");
        set.add("vivek");
        System.out.println(set);

        set.remove("Akash");
        System.out.println(set);
    }
}
