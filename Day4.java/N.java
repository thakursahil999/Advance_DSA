import java.util.HashMap;
class N {
    public static void main(String[] args) {
        HashMap<Integer,String> map = new HashMap<>();

        map.put(1,"Rahul");
        map.put(2,"Kartikey");
        map.put(3,"Rahul");
        map.put(4,"Harsh");
        map.put(5,"Mukesh");
        System.out.println(map);

        System.out.println(map.get(4));  // harsh
    }
}
