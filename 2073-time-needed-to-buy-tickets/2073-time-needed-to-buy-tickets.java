class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        /*
        (0-k)-no.of tickets=min(how many tickets they have,how many tickets k has)
        (k+1-n)-no.of tickets=min(how many tickets they have,how many tickets k has-1 coz after k buys all, we dont have to iterate over k+1)
        */
        int res=0;
        for(int i=0;i<=k;i++){
            res+= Math.min(tickets[i],tickets[k]);
        }
        for(int i=k+1;i<tickets.length;i++){
            res+= Math.min(tickets[i],tickets[k]-1);
        }
        return res;
    }
}