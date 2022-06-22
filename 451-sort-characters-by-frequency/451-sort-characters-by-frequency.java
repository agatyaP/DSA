class Solution {
    public String frequencySort(String s) {
//         Map<Character, Integer> map = new HashMap<>();
//         for (char c : s.toCharArray()) 
//             map.put(c, map.getOrDefault(c, 0) + 1);
						
//         List<Character> [] bucket = new List[s.length() + 1];
//         for (char key : map.keySet()) {
//             int frequency = map.get(key);
//             if (bucket[frequency] == null) bucket[frequency] = new ArrayList<>();
//             bucket[frequency].add(key);
//         }
				
//         StringBuilder sb = new StringBuilder();
//         for (int pos = bucket.length - 1; pos >= 0; pos--)
//             if (bucket[pos] != null)
//                 for (char c : bucket[pos])
//                     for (int i = 0; i < pos; i++)
//                         sb.append(c);

//         return sb.toString();
//     }
        
        HashMap<Character, Integer> map = new HashMap<>();
        for(char c : s.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        PriorityQueue <Character> maxheap = new PriorityQueue <> ((a,b) -> map.get(b) - map.get(a));
        maxheap.addAll(map.keySet());
        
        StringBuilder sb = new StringBuilder();
        while(!maxheap.isEmpty()){
            char current = maxheap.remove();
            for(int i=0; i<map.get(current); i++){
                //add the character in the string how many times it occurs, like id e appears 2 times, append ee
                sb.append(current); 
            }
        }
        return sb.toString();
    }
        
}