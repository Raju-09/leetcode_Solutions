# 3. Longest Substring Without Repeating Characters

**Difficulty:** 🟡 Medium  
**Topics:** `Hash Table` `String` `Sliding Window`  
**Solve Date:** 2026-07-15 08:35:58 UTC  
**LeetCode Link:** [Longest Substring Without Repeating Characters](https://leetcode.com/problems/longest-substring-without-repeating-characters/)

---

## Problem Description

Given a string `s`, find the length of the **longest** **substring** without duplicate characters.

 

<strong class="example">Example 1:</strong>

```

**Input:** s = "abcabcbb"
**Output:** 3
**Explanation:** The answer is "abc", with the length of 3. Note that `"bca"` and `"cab"` are also correct answers.

```

<strong class="example">Example 2:</strong>

```

**Input:** s = "bbbbb"
**Output:** 1
**Explanation:** The answer is "b", with the length of 1.

```

<strong class="example">Example 3:</strong>

```

**Input:** s = "pwwkew"
**Output:** 3
**Explanation:** The answer is "wke", with the length of 3.
Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.

```

 

**Constraints:**

	- `0 <= s.length <= 10^5`

	- `s` consists of English letters, digits, symbols and spaces.

---

## Submission Details

- **Language:** Java
- **Runtime:** 6 ms (Beats 95.52%)
- **Memory:** 46.2 MB (Beats 99.08%)
- **Submission Date:** 2026-07-15 08:35:58 UTC
