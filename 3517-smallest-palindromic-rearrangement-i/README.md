# 3517. Smallest Palindromic Rearrangement I

**Difficulty:** 🟡 Medium  
**Topics:** `String` `Sorting` `Counting Sort`  
**Solve Date:** 2026-07-28 08:22:42 UTC  
**LeetCode Link:** [Smallest Palindromic Rearrangement I](https://leetcode.com/problems/smallest-palindromic-rearrangement-i/)

---

## Problem Description

You are given a **palindromic** string `s`.

Return the **lexicographically smallest** palindromic permutation of `s`.

 

<strong class="example">Example 1:</strong>

**Input:** s = "z"

**Output:** "z"

**Explanation:**

A string of only one character is already the lexicographically smallest palindrome.

<strong class="example">Example 2:</strong>

**Input:** s = "babab"

**Output:** "abbba"

**Explanation:**

Rearranging `"babab"` → `"abbba"` gives the smallest lexicographic palindrome.

<strong class="example">Example 3:</strong>

**Input:** s = "daccad"

**Output:** "acddca"

**Explanation:**

Rearranging `"daccad"` → `"acddca"` gives the smallest lexicographic palindrome.

 

**Constraints:**

	- `1 <= s.length <= 10^5`

	- `s` consists of lowercase English letters.

	- `s` is guaranteed to be palindromic.

---

## Submission Details

- **Language:** Java
- **Runtime:** 20 ms (Beats 89.34%)
- **Memory:** 48 MB (Beats 90.98%)
- **Submission Date:** 2026-07-28 08:22:42 UTC
