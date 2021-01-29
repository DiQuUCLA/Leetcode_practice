class RemoveElement {
    public int removeElement(int[] nums, int val) {
        int idx = 0, length = nums.length;
        for(int i = 0; i < length; i++) {
            if(nums[i] != val) {
                nums[idx] = nums[i];
                idx++;
            }
        }

        return idx;
    }
}
