class Solution {
    public int search(int[] nums, int target) {
        int s=0;
        int e=nums.length-1;
        int m =0;
        while(s<=e){
            // m=s + (e-s)/2;
            m=(s+e)/2;
            if(nums[m]==target){
                return m;
            }
            else if (nums[m]<target){
                s=m+1;
            }
            else{
                e=m-1;
            }
        }

        return -1;
    }
}