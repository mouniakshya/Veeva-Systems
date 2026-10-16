class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int x=0;
        int n=operations.length;
        for(int i=0;i<n;i++){
            if(operations[i].contains("+"))
            x++;
            else
            x--;
        }
        return x;
    }
}