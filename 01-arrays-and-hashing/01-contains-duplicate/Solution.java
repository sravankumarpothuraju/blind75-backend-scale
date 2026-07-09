package arraysandhashing.containsduplicate;

public class Solution {
    public boolean containsDuplicate(int[] nums) {   // 1 2 3 2
        if (nums.length == 0) return false;

        for (int i = 0; i < nums.length; i++) { //1

            for (int j = i + 1; j < nums.length; j++) { // 2 3 2

                if (nums[i] == nums[j]) {

                    return true;
                }

            }
        }
        return false;

    }


}
