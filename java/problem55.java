class Solution {
    public boolean canJump(int[] nums) {
            int[] newNums = new int[nums.length];
            for (int i = 0; i < nums.length; i++) {
                newNums[i] = nums[i] + i;
            };
            int index = nums.length - 1;
            while (index > 0) {
                for (int i = 0; i <= index; i++) {
                    if (newNums[i] >= index) {;
                        index = i;
                        break;
                    }
                    if (i == index - 1) {
                        return false;
                    }
                }
            }
            return true;
    }
}
