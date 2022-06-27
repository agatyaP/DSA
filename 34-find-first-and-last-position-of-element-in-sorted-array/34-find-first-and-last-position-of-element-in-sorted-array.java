class Solution {
    

    public int[] searchRange(int[] nums, int target) {

        int[] ans = {-1, -1};
        // check for first occurrence if target first
        ans[0] = search(nums, target, true);
        if (ans[0] != -1) {
            ans[1] = search(nums, target, false);
        }
        return ans;
    }

    // this function just returns the index value of target
    int search(int[] nums, int target, boolean findStartIndex) {
        int ans = -1;
        int start = 0;
        int end = nums.length - 1;
        while(start <= end) {
            // find the middle element
//            int mid = (start + end) / 2; // might be possible that (start + end) exceeds the range of int in java
            int mid = start + (end - start) / 2;

            if (target < nums[mid]) {
                end = mid - 1;
            } else if (target > nums[mid]) {
                start = mid + 1;
            } else {
                // potential ans found
                ans = mid;
                if (findStartIndex) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return ans;
    }
   
//     public int[] searchRange(int[] nums, int target) {
//         int[] ans = {-1,-1};
//         int start= search( nums, target, true);
//         int end=search( nums, target,false);
//         ans[0]=start;
//         ans[1]=end;
        
//          int search(int[] nums, int target, boolean findStartIndex) {
//             int ans=-1;
//             int s=0;
//         int e=nums.length-1;
//         int m =0;
//         while(s<=e){
//             // m=s + (e-s)/2;
//             m=(s+e)/2;
//             if(nums[m]==target){
//                 if(findStartIndex=true){
//                     e=m-1;
//                 }
//                 else{
//                     s=m+1;
//                 }
//             }
//             else if (nums[m]<target){
//                 s=m+1;
//             }
//             else{
//                 e=m-1;
//             }
           
//         }
//           return ans;
//         }
//   return ans;
//     }
  
    
}
