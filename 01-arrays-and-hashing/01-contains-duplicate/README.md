# Contains Duplicate

- **LeetCode Link**: [LeetCode 217 - Contains Duplicate](https://leetcode.com/problems/contains-duplicate/)
- **Difficulty**: `🟢 Easy`

### 📝 Problem Statement
Given an integer array `nums`, return `true` if any value appears at least twice in the array, and return `false` if every element is distinct.

*   **Input**: `int[] nums`
*   **Output**: `boolean`

**Example 1**:
*   Input: `nums = [1, 2, 3, 1]`
*   Output: `true`

**Example 2**:
*   Input: `nums = [1, 2, 3, 4]`
*   Output: `false`

---

- **Time Complexity**: `O(N)` | [Explain runtime]
- **Space Complexity**: `O(N)` | [Explain space]

### 💡 Core Intuition
By storing visited numbers in a hash-based set, we can check if a number was seen before in O(1) amortized time instead of performing nested loop searches

### ⚡ Key SDE-3 Trap Cases
*   **Null / Empty Bounds**: We perform a defensive check (`nums == null || nums.length <= 1`) at the entry point to return `false` early, preventing `NullPointerException` and saving memory allocations.
*   **Performance / Language Traps**: Java's `HashSet<Integer>` requires autoboxing primitives (`int` -> `Integer` objects), which causes high GC (Garbage Collection) overhead on large inputs. Pre-sizing the set based on load factor (`0.75`) reduces internal bucket resizing.
*   **Duplicates & Order**: An alternative sorting-based solution (`O(N log N)`) would mutate the input array. Mutating input arrays is a dangerous side-effect in concurrent, multithreaded backend pipelines.
