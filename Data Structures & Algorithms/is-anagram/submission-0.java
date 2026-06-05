class Solution {
    public boolean isAnagram(String s, String t) {
        char[] char_s = s.toCharArray();
        char[] char_t = t.toCharArray();

        Map<Character, Integer> count_s = new HashMap();
        Map<Character, Integer> count_t = new HashMap();

        for(char c: char_s) {
            if(!count_s.containsKey(c))
                count_s.put(c, 1);
            else 
                count_s.put(c, count_s.get(c) + 1);
        }

        for(char c: char_t) {
            if(!count_t.containsKey(c)) 
                count_t.put(c, 1);
            else 
                count_t.put(c, count_t.get(c) + 1);
        }

        if(count_s.equals(count_t)) return true;
        else return false;
    }
}
