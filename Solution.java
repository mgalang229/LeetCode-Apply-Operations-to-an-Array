class Solution {
    public int[] applyOperations(int[] nums) {
        int n = nums.length;
        int zeroes = 0;
        for (int i = 0; i < n - 1; i++) {
            if (nums[i] == nums[i+1]) {
                nums[i] *= 2;
                nums[i+1] = 0;
            }
        }
        int[] ans = new int[n];
        Arrays.fill(ans, 0);
        int index = 0;
        for (int x : nums) {
            if (x > 0) {
                ans[index++] = x;
            }
        }
        return ans;
    }
}
