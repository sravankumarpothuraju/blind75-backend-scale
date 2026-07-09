package arraysandhashing.containsduplicate;

import java.util.HashSet;

public class Solution {
    public boolean containsDuplicate(int[] nums) {
        // Defensive input validation
        if (nums == null || nums.length <= 1) {
            return false;
        }

        // Pre-size set to completely prevent rehashing
        int initialCapacity = (int) Math.ceil(nums.length / 0.75);
        HashSet<Integer> hashset = new HashSet<>(initialCapacity);

        for (int num : nums) {
            // .add() returns false if the item was already in the set
            if (!hashset.add(num)) {
                return true;
            }
        }
        return false;
    }
}