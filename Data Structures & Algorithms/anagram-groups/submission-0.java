class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<List<Integer>, List<String>> map = new HashMap<>();
        List<List<String>> groupedAnagrams = new ArrayList<>();
        for(String str: strs) {
                char[] charArray = str.toCharArray();
                List<Integer> freq = new ArrayList<>(Collections.nCopies(26, 0));
                for(int i=0;i<charArray.length;i++) {
                    int index = charArray[i] - 'a';
                    freq.set(index, freq.get(index) + 1);
                }
                if(!map.containsKey(freq))
                    map.put(freq, new ArrayList<>(List.of(str)));
                else
                    map.get(freq).add(str);
        }

        for(List<String> anagrams: map.values()) {
            groupedAnagrams.add(anagrams);
        }

        return groupedAnagrams;
    }
}