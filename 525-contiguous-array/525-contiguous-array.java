class Solution {
    public int findMaxLength(int[] nums) {
        HashMap <Integer, Integer> counts = new HashMap <> ();
        counts.put(0,-1);
        int count = 0;
        int maxlen=0;
        
        for(int i = 0; i<nums.length; i++){
            if(nums[i] == 0){
                count --;
            }
            else {
                count ++;
            }
            
            if( counts.containsKey(count) ){
                maxlen = Math.max(maxlen, i - counts.get(count));
            }
            else{
                counts.put(count,i);
            }
            
        }
        
        
        
        return maxlen;
    }
}