# 3302. Find the Lexicographically Smallest Valid Sequence

**Difficulty:** 🟡 Medium  
**Topics:** `Two Pointers` `String` `Dynamic Programming` `Greedy`  
**Solve Date:** 2026-08-08 06:45:48 UTC  
**LeetCode Link:** [Find the Lexicographically Smallest Valid Sequence](https://leetcode.com/problems/find-the-lexicographically-smallest-valid-sequence/)

---

## Problem Description

You are given two strings `word1` and `word2`.

A string `x` is called **almost equal** to `y` if you can change **at most** one character in `x` to make it *identical* to `y`.

A sequence of indices `seq` is called **valid** if:

	- The indices are sorted in **ascending** order.

	- *Concatenating* the characters at these indices in `word1` in **the same** order results in a string that is **almost equal** to `word2`.

Return an array of size `word2.length` representing the lexicographically smallest **valid** sequence of indices. If no such sequence of indices exists, return an **empty** array.

**Note** that the answer must represent the *lexicographically smallest array*, **not** the corresponding string formed by those indices.<!-- notionvc: 2ff8e782-bd6f-4813-a421-ec25f7e84c1e -->

 

<strong class="example">Example 1:</strong>

**Input:** word1 = "vbcca", word2 = "abc"

**Output:** [0,1,2]

**Explanation:**

The lexicographically smallest valid sequence of indices is `[0, 1, 2]`:

	- Change `word1[0]` to `'a'`.

	- `word1[1]` is already `'b'`.

	- `word1[2]` is already `'c'`.

<strong class="example">Example 2:</strong>

**Input:** word1 = "bacdc", word2 = "abc"

**Output:** [1,2,4]

**Explanation:**

The lexicographically smallest valid sequence of indices is `[1, 2, 4]`:

	- `word1[1]` is already `'a'`.

	- Change `word1[2]` to `'b'`.

	- `word1[4]` is already `'c'`.

<strong class="example">Example 3:</strong>

**Input:** word1 = "aaaaaa", word2 = "aaabc"

**Output:** []

**Explanation:**

There is no valid sequence of indices.

<strong class="example">Example 4:</strong>

**Input:** word1 = "abc", word2 = "ab"

**Output:** [0,1]

 

**Constraints:**

	- `1 <= word2.length < word1.length <= 3 * 10^5`

	- `word1` and `word2` consist only of lowercase English letters.

---

## Submission Details

- **Language:** Java
- **Runtime:** 21 ms (Beats 96.29%)
- **Memory:** 144.5 MB (Beats 7.89%)
- **Submission Date:** 2026-08-08 06:45:48 UTC
