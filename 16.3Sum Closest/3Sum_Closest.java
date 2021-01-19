import java.util.*;

class ThreeSum_Closest {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int numSize = nums.length, closest = Integer.MAX_VALUE / 2;
        for (int i = 0; i < numSize-2; i++)
        {
            if(i == 0 || nums[i] != nums[i-1])
            {
                int x = i+1, y = numSize-1;
                while(x < y)
                {
                    int s = nums[i] + nums[x] + nums[y];
                    if(Math.abs(s - target) < Math.abs(closest - target))
                    {
                        closest = s;
                    }
                    
                    if(s < target)
                    {
                        x++;
                    }else
                    {
                        y--;
                    }
                }
            } 
        }
        return closest; 
    }
}
