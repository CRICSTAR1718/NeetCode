class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        HashMap<String, List<String>> mpp = new HashMap<>();

        for (String it : strs) {
            char[] a = it.toCharArray();
            Arrays.sort(a);

            String key = new String(a);

            if (!mpp.containsKey(key)) {
                mpp.put(key, new ArrayList<>());
            }

            mpp.get(key).add(it);
        }

        return new ArrayList<>(mpp.values());
    }
}