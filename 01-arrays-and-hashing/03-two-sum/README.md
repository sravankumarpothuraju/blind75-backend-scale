# Two Sum

- **LeetCode Link**: [LeetCode 1 - Two Sum](https://leetcode.com/problems/two-sum/)
- **Difficulty**: `🟢 Easy`

### 📝 Problem Statement
Given an array of integers `nums` and an integer `target`, return indices of the two numbers such that they add up to `target`.
You may assume that each input would have exactly one solution, and you may not use the same element twice. You can return the answer in any order.

*   **Input**: `int[] nums`, `int target`
*   **Output**: `int[]`

**Example 1**:
*   Input: `nums = [2, 7, 11, 15]`, `target = 9`
*   Output: `[0, 1]`

**Example 2**:
*   Input: `nums = [3, 2, 4]`, `target = 6`
*   Output: `[1, 2]`

---

- **Time Complexity**: `O(N)` | Single pass of the array where each lookup/insertion in the map takes amortized O(1) time.
- **Space Complexity**: `O(N)` | Storing visited numbers and their indices in a HashMap.

### 💡 Core Intuition
For any number `x`, we search for its target complement `target - x` that was already traversed. By storing previously visited numbers and their indices in a hash map, we look up this complement in $O(1)$ average time.

### ⚡ Key SDE-3 Trap Cases
*   **Null / Empty Bounds**: Standard defensive validation checking if `nums == null || nums.length < 2`.
*   **Duplicate Elements**: If input is `[3, 3]` and target is `6`, we check the complement `3` *before* inserting the second `3` into the map. This prevents index collisions and successfully finds the pair `[0, 1]`.
*   **Map capacity rehashing**: Sizing the `HashMap` appropriately if input size is huge to prevent expensive bucket reallocations.
