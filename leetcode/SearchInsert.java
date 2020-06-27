public class SearchInsert {
  public int searchInsert(int[] nums, int target) {
    int low = 0;
    int high = nums.length - 1;
    int mid = 0;
    if (target > nums[high]) {
      return nums.length;
    } else if (target < nums[low]) {
      return 0;
    }
    while (low <= high) {
      mid = low + (high - low) / 2;
      if (nums[mid] > target) {
        high = mid - 1;
      } else if (nums[mid] < target) {
        low = mid + 1;
      } else {
        break;
      }
    }
    if (nums[mid] == target) {
      return mid;
    } else {
      return low;
    }
  }

  public static void main(String[] args) {
    SearchInsert si = new SearchInsert();
    int[] arr1 = { 1, 3, 5 };
    System.out.println(si.searchInsert(arr1, 0));
    System.out.println(si.searchInsert(arr1, 1));
    System.out.println(si.searchInsert(arr1, 2));
    System.out.println(si.searchInsert(arr1, 3));
    System.out.println(si.searchInsert(arr1, 4));
    System.out.println(si.searchInsert(arr1, 5));
    System.out.println(si.searchInsert(arr1, 6));
  }
}