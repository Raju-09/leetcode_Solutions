# 567. Permutation in String

**Difficulty:** 🟡 Medium  
**Topics:** `Hash Table` `Two Pointers` `String` `Sliding Window`  
**Solve Date:** 2026-08-05 08:32:10 UTC  
**LeetCode Link:** [Permutation in String](https://leetcode.com/problems/permutation-in-string/)

---

## Problem Description

Given two strings `s1` and `s2`, return `true` if `s2` contains a permutation of `s1`, or `false` otherwise.

In other words, return `true` if one of `s1`'s permutations is the substring of `s2`.

 

<strong class="example">Example 1:</strong>

```

**Input:** s1 = "ab", s2 = "eidbaooo"
**Output:** true
**Explanation:** s2 contains one permutation of s1 ("ba").

```

<strong class="example">Example 2:</strong>

```

**Input:** s1 = "ab", s2 = "eidboaoo"
**Output:** false

```

 

**Constraints:**

	- `1 <= s1.length, s2.length <= 10^4`

	- `s1` and `s2` consist of lowercase English letters.

---

## Submission Details

- **Language:** Java
- **Runtime:** 5 ms (Beats 97.38%)
- **Memory:** 44.1 MB (Beats 60.96%)
- **Submission Date:** 2026-08-05 08:32:10 UTC
