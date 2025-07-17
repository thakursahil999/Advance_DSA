import java.util.HashMap;
class P {
    public static void main(String[] args) {
        HashMap<Character,Integer> map = new HashMap<>();
        String sub = "programmingggg";

        char[] chr = sub.toCharArray();
        System.out.println(chr);

        for(int i=0;i<chr.length;i++){
            map.put(chr[i],0);
        }
        System.out.println(map);
        

        for(int i=0;i<sub.length();i++){
            map.put(chr[i],map.get(chr[i])+1);
        }

        for(Character key : map.keySet()){
            System.out.println(key + " frequency "+map.get(key));
        }
    }
}