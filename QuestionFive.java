class QuestionFive {
    public int removeElement(int[] nums, int val) {
        int i =0;
        int ind = nums.length;
        while(i<ind)
        {
            if(nums[i] ==val)
            {
                int temp = nums[i];
                nums[i] = nums[ind-1];
                nums[ind-1] = temp;
                ind--;
            }
            else
            {
                i++;
            }
        }
        return ind;
    }
}
