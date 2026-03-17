# 392. Is Subsequence

**Difficulty:** 🟢 Easy  
**Topics:** `Two Pointers` `String` `Dynamic Programming`  
**Solve Date:** 2026-03-17 09:59:20 UTC  
**LeetCode Link:** [Is Subsequence](https://leetcode.com/problems/is-subsequence/)

---

## Problem Description

Given two strings `s` and `t`, return `true`* if *`s`* is a **subsequence** of *`t`*, or *`false`* otherwise*.

A **subsequence** of a string is a new string that is formed from the original string by deleting some (can be none) of the characters without disturbing the relative positions of the remaining characters. (i.e., `"ace"` is a subsequence of `"<u>a</u>b<u>c</u>d<u>e</u>"` while `"aec"` is not).

 

<strong class="example">Example 1:</strong>

```
**Input:** s = "abc", t = "ahbgdc"
**Output:** true

```<strong class="example">Example 2:</strong>

```
**Input:** s = "axc", t = "ahbgdc"
**Output:** false

```
 

**Constraints:**

	- `0 <= s.length <= 100`

	- `0 <= t.length <= 10^4`

	- `s` and `t` consist only of lowercase English letters.

 

**Follow up:** Suppose there are lots of incoming `s`, say `s_1, s_2, ..., s_k` where `k >= 10^9`, and you want to check one by one to see if `t` has its subsequence. In this scenario, how would you change your code?

---

## Submission Details

- **Language:** Java
- **Runtime:** 2 ms (Beats 73.12%)
- **Memory:** 43 MB (Beats 13.18%)
- **Submission Date:** 2026-03-17 09:59:20 UTC
