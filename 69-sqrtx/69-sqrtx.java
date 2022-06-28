class Solution {
public int mySqrt(int x) {
	if (x == 0) return 0;
	int start = 1, end = x/2;
	while (start < end) { 
		int mid = start + (end - start) / 2;
		if (mid <= x / mid && (mid + 1) > x / (mid + 1))// Found the result
			return mid; 
		else if (mid > x / mid)// Keep checking the left part
			end = mid;
		else
			start = mid + 1;// Keep checking the right part
	}
	return start;
}
//     public int mySqrt(int x) {
//           int start=0;
//         if(x < 2){return x;}
//         int end=x/2;
      
        
        
// //         //applying bs
//         while (start<end){
//             int mid = start + (end - start) / 2;
//             if(mid <= x / mid && (mid + 1) > x / (mid + 1)){
//                 return mid;
//             }
            
//             else if (mid*mid<x){
//                 start=mid+1;
//             }
//             else {
//                 end=mid;
//             }
           

            
//         }
        
//    return end;
//     }
}

