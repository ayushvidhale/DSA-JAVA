package DSA_with_Kunal.PracticeQuestions;

public class firstAndLastPosition {
    public static void main(String[] args) {

    }

    public int[] searchRange(int[] nums, int target) {

        int[] ans = {-1,-1};


        //check for first occurrence of target
        int start = search(nums, target, true);
        int end = search(nums, target, false);

        ans[0] = start;
        ans[1] = end;
        return ans;
    }

    int search(int[] nums, int target, boolean findStartIndex ){
        int ans =-1;
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (target < nums[mid]) {
                end = mid - 1;
            } else if (target > nums[mid]) {
                start = mid + 1;

            } else {
                // potential ans is found!!
                ans = mid;
                if(findStartIndex == true){
                    end = mid -1;
                }else {
                    start  = mid + 1;
                }
            }

        }
        return ans;
    }
}
