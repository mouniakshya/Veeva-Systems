import java.util.*;
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer>set=new HashSet<>();
        for(int i:nums1){
            set.add(i);
        }
        ArrayList<Integer>list=new ArrayList<>();
        for(int i:nums2){
         if(set.contains(i)){
            list.add(i);
            set.remove(i);
         }
        }
        int[] arr=new int[list.size()];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=list.get(i);
        }
        return arr;
    }
}