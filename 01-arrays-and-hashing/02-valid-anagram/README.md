# Valid Anagram

- **LeetCode Link**: [LeetCode 242 - Valid Anagram](https://leetcode.com/problems/valid-anagram/)
- **Difficulty**: `🟢 Easy`

### 📝 Problem Statement
Given two strings `s` and `t`, return `true` if `t` is an anagram of `s`, and `false` otherwise.
*(An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.)*

*   **Input**: `String s`, `String t`
*   **Output**: `boolean`

**Example 1**:
*   Input: `s = "anagram"`, `t = "nagaram"`
*   Output: `true`

**Example 2**:
*   Input: `s = "rat"`, `t = "car"`
*   Output: `false`

---

- **Time Complexity**: `O(N)` | Single pass frequency mapping of both strings where N is string length.
- **Space Complexity**: `O(N)` | Allocating auxiliary space for character frequency maps.

### 💡 Core Intuition
An anagram requires identical character frequencies. By building character count maps for both strings in a single pass, we can verify if they are identical in O(1) average lookup time per character.

### ⚡ Key SDE-3 Trap Cases
*   **Null / Empty Bounds**: We perform defensive checks (`s == null || t == null || s.length() != t.length()`) to fail early before allocating heap memory.
*   **Performance / Language Traps**: Using a general `HashMap<Character, Integer>` causes autoboxing overhead (primitive `char` to `Character` object). If constrained to lowercase English letters, a fixed `int[26]` array is faster and uses `O(1)` stack memory.
*   **Unicode/Emojis Support**: For international characters or emojis, `HashMap` is required, making the code scale-flexible.
