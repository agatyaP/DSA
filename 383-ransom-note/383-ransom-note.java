class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] count = new int[26];
        for(char c : magazine.toCharArray()){
            count[(int) c - (int) 'a'] += 1;
        }
        for(char c : ransomNote.toCharArray()){
            count[(int) c - (int) 'a'] -= 1; 
        }
        for(int i : count){
            if(i < 0)
                return false;
        }
        return true;
    }
    
    // better understanding
    //     public boolean canConstruct(String ransomNote, String magazine) {
    //     int[] arr = new int[26];
    //     for (int i = 0; i < magazine.length(); i++) {
    //         arr[magazine.charAt(i) - 'a']++;
    //     }
    //     for (int i = 0; i < ransomNote.length(); i++) {
    //         if(--arr[ransomNote.charAt(i)-'a'] < 0) {
    //             return false;
    //         }
    //     }
    //     return true;
    // }
}