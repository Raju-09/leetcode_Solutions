# 238. Product of Array Except Self

**Difficulty:** 🟡 Medium  
**Topics:** `Array` `Prefix Sum`  
**Solve Date:** 2026-06-01 06:29:16 UTC  
**LeetCode Link:** [Product of Array Except Self](https://leetcode.com/problems/product-of-array-except-self/)

---

## Problem Description

Given an integer array `nums`, return *an array* `answer` *such that* `answer[i]` *is equal to the product of all the elements of* `nums` *except* `nums[i]`.

The product of any prefix or suffix of `nums` is **guaranteed** to fit in a **32-bit** integer.

You must write an algorithm that runs in `O(n)` time and without using the division operation.

 

<strong class="example">Example 1:</strong>

```
**Input:** nums = [1,2,3,4]
**Output:** [24,12,8,6]

```<strong class="example">Example 2:</strong>

```
**Input:** nums = [-1,1,0,-3,3]
**Output:** [0,0,9,0,0]

```
 

**Constraints:**

	- `2 <= nums.length <= 10^5`

	- `-30 <= nums[i] <= 30`

	- The input is generated such that `answer[i]` is **guaranteed** to fit in a **32-bit** integer.

 

**Follow up:** Can you solve the problem in `O(1)` extra space complexity? (The output array **does not** count as extra space for space complexity analysis.)

---

## Submission Details

- **Language:** Java
- **Runtime:** 2 ms (Beats 92.42%)
- **Memory:** 72.3 MB (Beats 6.95%)
- **Submission Date:** 2026-06-01 06:29:16 UTC
