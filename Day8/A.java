import java.util.HashMap;
class A{
    public static int lengthOfLongestSubstring(String s){
        int max = 0;
        int i = 0;
        HashMap<Character,Integer> map = new HashMap<>();
        for(int j=0;j<s.length();j++){
            char ch=s.charAt(j);
            if(map.containsKey(ch)){
                i=Math.max(i,map.get(ch)+1);
            }
            map.put(ch,j);
            max = Math.max(max,j-i+1);
           
        }
        return max;
    }

    public static void main(String[] args){
        String s = " ";
        int data = lengthOfLongestSubstring(s);
        System.out.println(data);
    }
}