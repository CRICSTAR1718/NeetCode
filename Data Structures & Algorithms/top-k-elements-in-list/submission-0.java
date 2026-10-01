class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        PriorityQueue<int[]> pq = new PriorityQueue<>(
            (a, b) -> a[1] - b[1]
        );
        HashMap<Integer, Integer>mpp=new HashMap<>();
        for(int i=0; i<nums.length; i++)
        {
            if(mpp.containsKey(nums[i]))
            {
                mpp.put(nums[i], mpp.get(nums[i])+1);
            }
            else{
                mpp.put(nums[i],1);
            }
        }
        for(Integer it: mpp.keySet())
        {
            pq.add(new int[]{it, mpp.get(it)});
            if(pq.size()>k)
            {
                pq.poll();
            }
        }
        int[] ans=new int[k];
        for(int i=0; i<k; i++)
        {
            ans[i]=pq.poll()[0];
        }
        return ans;
    }
}
