public class MaxSubArray {
  public int maxSubArray(int[] nums) {
    int currentSum = nums[0];
    int lastSum = nums[0];
    for (int i = 1; i < nums.length; i++) {
      lastSum = Math.max(lastSum, 0) + nums[i];
      if (lastSum > currentSum) {
        currentSum = lastSum;
      }
    }
    return currentSum;
  }

  public static void main(String[] args) {
    MaxSubArray msa = new MaxSubArray();
    int[] nums = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
    System.out.println(msa.maxSubArray(nums));
  }
}
