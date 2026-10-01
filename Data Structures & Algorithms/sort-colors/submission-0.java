class Solution {
    public void sortColors(int[] nums) {
        int left=0;
        int right=nums.length-1;
        int mid=0;
        while(mid<=right)
        {
            if(nums[mid]==0)
            {
                int t=nums[left];
                nums[left]=0;
                nums[mid]=t;
                mid++;
                left++;
            }
            else if(nums[mid]==2){
                int t=nums[mid];
                nums[mid]=nums[right];
                nums[right]=t;
                mid++;
                right--;
            }
            else{
                mid++;
            }
        }
    }
}