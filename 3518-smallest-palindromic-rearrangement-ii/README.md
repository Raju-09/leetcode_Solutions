# 3518. Smallest Palindromic Rearrangement II

**Difficulty:** 🔴 Hard  
**Topics:** `Hash Table` `Math` `String` `Combinatorics` `Counting`  
**Solve Date:** 2026-07-29 10:55:43 UTC  
**LeetCode Link:** [Smallest Palindromic Rearrangement II](https://leetcode.com/problems/smallest-palindromic-rearrangement-ii/)

---

## Problem Description

<p data-end="332" data-start="99">You are given a **palindromic** string `s` and an integer `k`.</p>

Return the **k-th** **lexicographically smallest** palindromic permutation of `s`. If there are fewer than `k` distinct palindromic permutations, return an empty string.

**Note:** Different rearrangements that yield the same palindromic string are considered identical and are counted once.

 

<strong class="example">Example 1:</strong>

**Input:** s = "abba", k = 2

**Output:** "baab"

**Explanation:**

	- The two distinct palindromic rearrangements of `"abba"` are `"abba"` and `"baab"`.

	- Lexicographically, `"abba"` comes before `"baab"`. Since `k = 2`, the output is `"baab"`.

<strong class="example">Example 2:</strong>

**Input:** s = "aa", k = 2

**Output:** ""

**Explanation:**

	- There is only one palindromic rearrangement: <code data-end="1112" data-start="1106">"aa"</code>.

	- The output is an empty string since `k = 2` exceeds the number of possible rearrangements.

<strong class="example">Example 3:</strong>

**Input:** s = "bacab", k = 1

**Output:** "abcba"

**Explanation:**

	- The two distinct palindromic rearrangements of `"bacab"` are `"abcba"` and `"bacab"`.

	- Lexicographically, `"abcba"` comes before `"bacab"`. Since `k = 1`, the output is `"abcba"`.

 

**Constraints:**

	- `1 <= s.length <= 10^4`

	- `s` consists of lowercase English letters.

	- `s` is guaranteed to be palindromic.

	- `1 <= k <= 10^6`

---

## Submission Details

- **Language:** Java
- **Runtime:** 17 ms (Beats 76.91%)
- **Memory:** 47.3 MB (Beats 43.72%)
- **Submission Date:** 2026-07-29 10:55:43 UTC
