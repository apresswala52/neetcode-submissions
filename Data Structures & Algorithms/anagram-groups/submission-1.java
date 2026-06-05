class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<List<Integer>, List<String>> map = new HashMap<>();

        for(String str: strs) {
            char[] charArray = str.toCharArray();
            List<Integer> frequency = new ArrayList<>(Collections.nCopies(26, 0));

            for(int i=0; i < charArray.length; i++) {
                int ascii = charArray[i] - 'a';
                frequency.set(ascii, frequency.get(ascii) + 1);
            }

            map.computeIfAbsent(frequency, k -> new ArrayList<>()).add(str);
        }

        return new ArrayList<>(map.values());
    }
}