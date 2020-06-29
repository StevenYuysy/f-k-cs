import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MaxSubArray {
  public int maxSubArray(int[] nums) {
    List<Integer> result = new ArrayList<Integer>();
    for (int i = 0; i < nums.length; i++) {
      List<Integer> cResult = new ArrayList<>(result);
      result.add(nums[i]);
      for (int j = 1; j <= i; j++) {
        int index = cResult.size() - j;
        int num = cResult.get(index);
        result.add(num + nums[i]);
      }
    }
    return Collections.max(result);
  }

  public static void main(String[] args) {
    MaxSubArray msa = new MaxSubArray();
    int[] nums = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
    System.out.println(msa.maxSubArray(nums));
  }
}
