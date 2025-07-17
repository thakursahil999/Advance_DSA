import java.util.HashSet;
class J{
    public static void main(String[] args) {
        HashSet<Exp> set = new HashSet<>();
        set.add(new Exp("Anirudh",12));
        set.add(new Exp("Pankaj", 45));
        set.add(new Exp("Kaliya", 20));
        set.add(new Exp("Nobita", 23));
        System.out.println(set);

        Exp a = new Exp("Kaliya", 20);
        System.out.println(set.remove(a));
    }
}
// [Pankaj 45, Anirudh 12, Nobita 23, Kaliya 20]
// false