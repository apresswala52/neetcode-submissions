class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;

        char[] char_s = s.toCharArray();
        char[] char_t = t.toCharArray();

        Map<Character, Integer> countMap = new HashMap<>();
        for(char c: char_s) {
            if(!countMap.containsKey(c))
                countMap.put(c, 1);
            else 
                countMap.put(c, countMap.get(c) + 1);
        }

        for(char c: char_t) {
            if(!countMap.containsKey(c)) 
                countMap.put(c, 1);
            else 
                countMap.put(c, countMap.get(c) - 1);
        }

        for(int freq: countMap.values()){
            if(freq!=0) return false;
        }

        return true;
    }
}
