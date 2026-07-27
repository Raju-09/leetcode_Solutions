# 1464. Maximum Product of Two Elements in an Array

**Difficulty:** 🟢 Easy  
**Topics:** `Array` `Sorting` `Heap (Priority Queue)`  
**Solve Date:** 2026-07-27 14:50:57 UTC  
**LeetCode Link:** [Maximum Product of Two Elements in an Array](https://leetcode.com/problems/maximum-product-of-two-elements-in-an-array/)

---

## Problem Description

You are given an array of integers `nums`.

Choose two **different** indices `i` and `j` of that array.

Return the **maximum** value of `(nums[i] - 1) * (nums[j] - 1)`.

 

<strong class="example">Example 1:</strong>

```

**Input:** nums = [3,4,5,2]
**Output:** 12 
**Explanation:** If you choose the indices i=1 and j=2 (indexed from 0), you will get the maximum value, that is, (nums[1]-1)*(nums[2]-1) = (4-1)*(5-1) = 3*4 = 12. 

```

<strong class="example">Example 2:</strong>

```

**Input:** nums = [1,5,4,5]
**Output:** 16
**Explanation:** Choosing the indices i=1 and j=3 (indexed from 0), you will get the maximum value of (5-1)*(5-1) = 16.

```

<strong class="example">Example 3:</strong>

```

**Input:** nums = [3,7]
**Output:** 12

```

 

**Constraints:**

	- `2 <= nums.length <= 500`

	- `1 <= nums[i] <= 10^3`

---

## Submission Details

- **Language:** Java
- **Runtime:** 5 ms (Beats 42.04%)
- **Memory:** 44.7 MB (Beats 46.64%)
- **Submission Date:** 2026-07-27 14:50:57 UTC
