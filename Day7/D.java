class D{
    public static void main(String[] args) {
        String str = "aabcbb";
        
        for(int i=0;i<str.length();i++){
            int length = 0;
            for (int j=i+1;j<str.length();j++){
                if(str.charAt(i) != str.charAt(j)){
                    length++;
                }else{
                    break;
                }
            }
            System.out.println(length);
        }
        
    }
}