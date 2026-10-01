class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>>mpp=new HashMap<>();
        for(int i=0; i<strs.length; i++)
        {
            char[] a=strs[i].toCharArray();
            Arrays.sort(a);
            String s=new String(a);
            if(!mpp.containsKey(s))
            {
                mpp.put(s, new ArrayList<>());
            }
            mpp.get(s).add(strs[i]);
        }
        List<List<String>>ans=new ArrayList<>();
        for(List<String> it: mpp.values())
        {
            ans.add(it);
        }
        return ans;
    }
}
