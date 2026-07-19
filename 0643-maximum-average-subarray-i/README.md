# 643. Maximum Average Subarray I

**Difficulty:** 🟢 Easy  
**Topics:** `Array` `Sliding Window`  
**Solve Date:** 2026-07-19 23:49:53 UTC  
**LeetCode Link:** [Maximum Average Subarray I](https://leetcode.com/problems/maximum-average-subarray-i/)

---

## Problem Description

You are given an integer array `nums` consisting of `n` elements, and an integer `k`.

Find a contiguous subarray whose **length is equal to** `k` that has the maximum average value and return *this value*. Any answer with a calculation error less than `10^-5` will be accepted.

 

<strong class="example">Example 1:</strong>

```

**Input:** nums = [1,12,-5,-6,50,3], k = 4
**Output:** 12.75000
**Explanation:** Maximum average is (12 - 5 - 6 + 50) / 4 = 51 / 4 = 12.75

```

<strong class="example">Example 2:</strong>

```

**Input:** nums = [5], k = 1
**Output:** 5.00000

```

 

**Constraints:**

	- `n == nums.length`

	- `1 <= k <= n <= 10^5`

	- `-10^4 <= nums[i] <= 10^4`

---

## Submission Details

- **Language:** Java
- **Runtime:** 2569 ms (Beats 5.00%)
- **Memory:** 69.6 MB (Beats 62.57%)
- **Submission Date:** 2026-07-19 23:49:53 UTC
