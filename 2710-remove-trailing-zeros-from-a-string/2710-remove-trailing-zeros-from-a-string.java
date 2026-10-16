class Solution {
    public String removeTrailingZeros(String num) {
        int n=num.length();
        int k=0;
        for(int i=n-1;i>=0;i--){
            if(num.charAt(i)=='0')
            k++;
            else
            break;
        }
    return num.substring(0,n-k);
    }
}