import java.util.*;

class RemoveDuplicatesFromSortedArray {
    public int removeDuplicates(int[] nums) {
        int idx = 1, length = nums.length;
        for (int i = 1; i < length; i++) {
            if(nums[i] != nums[idx-1]) {
                nums[idx] = nums[i];
                idx++;
            }
        }

        return idx;
    }
}
