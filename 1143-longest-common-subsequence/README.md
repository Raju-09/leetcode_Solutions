# 1143. Longest Common Subsequence

**Difficulty:** 🟡 Medium  
**Topics:** `String` `Dynamic Programming` `Longest Common Subsequence`  
**Solve Date:** 2026-07-25 09:57:15 UTC  
**LeetCode Link:** [Longest Common Subsequence](https://leetcode.com/problems/longest-common-subsequence/)

---

## Problem Description

Given two strings `text1` and `text2`, return *the length of their longest **common subsequence**. *If there is no **common subsequence**, return `0`.

A **subsequence** of a string is a new string generated from the original string with some characters (can be none) deleted without changing the relative order of the remaining characters.

	- For example, `"ace"` is a subsequence of `"abcde"`.

A **common subsequence** of two strings is a subsequence that is common to both strings.

 

<strong class="example">Example 1:</strong>

```

**Input:** text1 = "abcde", text2 = "ace" 
**Output:** 3  
**Explanation:** The longest common subsequence is "ace" and its length is 3.

```

<strong class="example">Example 2:</strong>

```

**Input:** text1 = "abc", text2 = "abc"
**Output:** 3
**Explanation:** The longest common subsequence is "abc" and its length is 3.

```

<strong class="example">Example 3:</strong>

```

**Input:** text1 = "abc", text2 = "def"
**Output:** 0
**Explanation:** There is no such common subsequence, so the result is 0.

```

 

**Constraints:**

	- `1 <= text1.length, text2.length <= 1000`

	- `text1` and `text2` consist of only lowercase English characters.

---

## Submission Details

- **Language:** Java
- **Runtime:** 20 ms (Beats 77.77%)
- **Memory:** 54 MB (Beats 36.41%)
- **Submission Date:** 2026-07-25 09:57:15 UTC
