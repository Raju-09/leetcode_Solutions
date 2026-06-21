# 3966. Count Good Integers in a Range

**Difficulty:** 🔴 Hard  
**Topics:** `Math` `Dynamic Programming`  
**Solve Date:** 2026-06-21 07:20:41 UTC  
**LeetCode Link:** [Count Good Integers in a Range](https://leetcode.com/problems/count-good-integers-in-a-range/)

---

## Problem Description

You are given three integers `l`, `r` and `k`.

A number is considered **good** if the **absolute difference** between every pair of **adjacent** digits is **at most** `k`.

Return the number of **good** integers in the range `[l, r]` (inclusive).

The **absolute difference** between values `x` and `y` is defined as `abs(x - y)`.

 

<strong class="example">Example 1:</strong>

**Input:** l = 10, r = 15, k = 1

**Output:** 3

**Explanation:**

	- The good integers in the range are 10, 11, and 12.

	- For 10, `abs(1 - 0) = 1`.

	- For 11, `abs(1 - 1) = 0`.

	- For 12, `abs(1 - 2) = 1`.

	- All these differences are at most `k = 1`. Thus, the answer is 3.

<strong class="example">Example 2:</strong>

**Input:** l = 201, r = 204, k = 2

**Output:** 2

**Explanation:**

	- The good integers in the range are 201 and 202.

	- For 201, `abs(2 - 0) = 2` and `abs(0 - 1) = 1`.

	- For 202, `abs(2 - 0) = 2` and `abs(0 - 2) = 2`.

	- Thus, the answer is 2.

 

**Constraints:**

	- `10 <= l <= r <= 10^15`

	- `0 <= k <= 9`

---

## Submission Details

- **Language:** Java
- **Runtime:** 19 ms (Beats 53.06%)
- **Memory:** 46.5 MB (Beats 55.10%)
- **Submission Date:** 2026-06-21 07:20:41 UTC
