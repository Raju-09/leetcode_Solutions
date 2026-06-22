# 75. Sort Colors

**Difficulty:** 🟡 Medium  
**Topics:** `Array` `Two Pointers` `Sorting` `Quicksort` `Bubble Sort`  
**Solve Date:** 2026-06-22 10:14:55 UTC  
**LeetCode Link:** [Sort Colors](https://leetcode.com/problems/sort-colors/)

---

## Problem Description

You are given an array `nums` with `n` objects colored red, white, or blue, sort them **[in-place](https://en.wikipedia.org/wiki/In-place_algorithm) **so that objects of the same color are adjacent, with the colors in the order red, white, and blue.

We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.

You must solve this problem without using the library's sort function.

 

<strong class="example">Example 1:</strong>

**Input:** nums = [2,0,2,1,1,0]

**Output:** [0,0,1,1,2,2]

**Explanation:**

The array has two 0s, two 1s, and two 2s. Sorting them in-place places all 0s first, then all 1s, then all 2s.

<strong class="example">Example 2:</strong>

**Input:** nums = [2,0,1]

**Output:** [0,1,2]

**Explanation:**

The array has one each of 0, 1, and 2, arranged in-place in the order 0, 1, 2.

 

**Constraints:**

	- `n == nums.length`

	- `1 <= n <= 300`

	- `nums[i]` is either 0, 1, or 2.

 

**Follow up:** Could you come up with a one-pass algorithm using only constant extra space?

---

## Submission Details

- **Language:** Java
- **Runtime:** 0 ms (Beats 100.00%)
- **Memory:** 43.8 MB (Beats 7.21%)
- **Submission Date:** 2026-06-22 10:14:55 UTC
