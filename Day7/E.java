import java.util.HashSet;

class E{
    public static void main(String[] args) {
        String str = "au";

        int maxLen=0;
        HashSet set = new HashSet();
        // int j=0;
        for(int i =0 ;i<str.length();i++){
            if(set.contains(str.charAt(i))){
                maxLen = Math.max(maxLen,set.size());
                set.clear();
                i--;
            }
            else{
                set.add(str.charAt(i));
            }
            
        }
        maxLen = Math.max(maxLen,set.size());
        System.out.println(maxLen);
    }
}