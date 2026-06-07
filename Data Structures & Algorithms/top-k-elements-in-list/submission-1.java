class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> countMap = new HashMap<>();
        List<List<Integer>> buckets = new ArrayList<>();

        for(int num: nums) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

        for(int i=0; i<=nums.length; i++) {
            buckets.add(new ArrayList<>());
        }

        for(Map.Entry<Integer, Integer> entry: countMap.entrySet()) {
            int num = entry.getKey();
            int freq = entry.getValue();

            buckets.get(freq).add(num);
        }

        List<Integer> result = new ArrayList<>();

        for(int i = buckets.size() - 1; i >= 0 && result.size() < k; i--) {
            result.addAll(buckets.get(i));
        }

        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}
