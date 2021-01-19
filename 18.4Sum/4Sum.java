import java.util.*;

class FourSum {
    public void threeSum(List<List<Integer>> result, 
                            int[] nums, int head, int target, int startIdx) {
        int numSize = nums.length;

        for(int i = startIdx; i < numSize-2; i++) {
            int twoTarget = target - nums[i];
            if(i == startIdx || nums[i] != nums[i-1])
            {
                int x = i+1, y = numSize-1;
                while(x < y) {
                    if (x + y == twoTarget)
                    {
                        List<Integer> r = new ArrayList<Integer>();
                        r.add(head);
                        r.add(nums[i]);
                        r.add(nums[x]);
                        r.add(nums[y]);
                        result.add(r);
                    }else if(x + y > twoTarget) {
                        y--;
                    }else {
                        x++;
                    }
                }
            }
        }
    }
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        int numSize = nums.length;
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        if(numSize < 4) {
            return result;
        }

        for(int i = 0; i < numSize-3; i++) {
            if(i == 0 || nums[i] != nums[i-1]) {
                threeSum(result, nums, nums[i], target - nums[i], i+1);          
            }
        }

        return result;
    }
}
