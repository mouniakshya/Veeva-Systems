class Solution {
    public List<String> invalidTransactions(String[] transactions) {
        ArrayList<String>list=new ArrayList<>();
        int n=transactions.length;
        String[] names=new String[n];
        int[] time=new int[n];
        int[] price=new int[n];
        int[] add=new int[n];
        String[] cities=new String[n];
        for(int i=0;i<n;i++){
            String[] items=transactions[i].split(",");
            names[i]=items[0];
            time[i]=Integer.parseInt(items[1]);
            price[i]=Integer.parseInt(items[2]);
            cities[i]=items[3];
        }
        for(int i=0;i<n;i++){
            if(price[i]>1000)
            add[i]=1;
            for(int j=i+1;j<n;j++){
                if(Math.abs(time[i] - time[j]) <= 60&&(names[i].equals(names[j]))&&(!cities[i].equals(cities[j]))){
                    add[i]=1;
                    add[j]=1;
                }
            }
        }
        for(int i=0;i<n;i++){
            if(add[i]==1)
            list.add(transactions[i]);
        }
        return list;
    }
}