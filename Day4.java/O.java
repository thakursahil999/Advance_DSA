import java.util.HashMap;
class O {
    public static void main(String[] args) {
        HashMap<Integer,String> map = new HashMap<>();

        map.put(1,"Rahul");
        map.put(2,"Kartikey");
        map.put(3,"Rahul");
        map.put(4,"Harsh");
        map.put(5,"Mukesh");
        System.out.println(map);

        System.out.println(map.getOrDefault(1,"The Key is not Found"));//Rahul
        System.out.println(map.getOrDefault(10,"The Key is not Found"));//The Key is not Found
    }
}
