class Solution {
    public String decodeMessage(String key, String message) {
        char a='a';
        HashMap<Character,Character>map=new HashMap<>();
        for(int i=0;i<key.length();i++){
            char ch=key.charAt(i);

            if(ch!=' '&& !map.containsKey(ch)){
                map.put(ch,a);
                a++;
            }
        }
        String s="";
        for(int i=0;i<message.length();i++){
            char ch=message.charAt(i);
            if(ch==' ')
            s=s+" ";
            else
            s=s+map.get(ch);
            
        }
        return s;
    }
}