class Solution {
    public boolean isFascinating(int n) {
        HashSet<Integer>set=new HashSet<>();
        int num=n;
        while(n!=0){
            int a=n%10;
            if(!set.contains(a)){
            set.add(a);
            }
            else 
            return false;
            n=n/10;
        }
       int b=2*num;
       int c=3*num;
       while(b!=0){
            int z=b%10;
            if(!set.contains(z)){
            set.add(z);
            }
            else 
            return false;
            b=b/10;
        }
         while(c!=0){
            int y=c%10;
            if(!set.contains(y)){
            set.add(y);
            }
            else 
            return false;
            c=c/10;
        }
        if(set.contains(0))
        return false;
        for(int i=1;i<=9;i++){
            if(!set.contains(i))
            return false;
        }
        return true;
    }
}