# 209. Minimum Size Subarray Sum

**Difficulty:** 🟡 Medium  
**Topics:** `Array` `Binary Search` `Sliding Window` `Prefix Sum`  
**Solve Date:** 2026-08-06 17:07:26 UTC  
**LeetCode Link:** [Minimum Size Subarray Sum](https://leetcode.com/problems/minimum-size-subarray-sum/)

---

## Problem Description

Given an array of positive integers `nums` and a positive integer `target`, return *the **minimal length** of a **subarray** whose sum is greater than or equal to* `target`. If there is no such subarray, return `0` instead.

 

<strong class="example">Example 1:</strong>

```

**Input:** target = 7, nums = [2,3,1,2,4,3]
**Output:** 2
**Explanation:** The subarray [4,3] has the minimal length under the problem constraint.

```

<strong class="example">Example 2:</strong>

```

**Input:** target = 4, nums = [1,4,4]
**Output:** 1

```

<strong class="example">Example 3:</strong>

```

**Input:** target = 11, nums = [1,1,1,1,1,1,1,1]
**Output:** 0

```

 

**Constraints:**

	- `1 <= target <= 10^9`

	- `1 <= nums.length <= 10^5`

	- `1 <= nums[i] <= 10^4`

 

**Follow up:** If you have figured out the `O(n)` solution, try coding another solution of which the time complexity is `O(n log(n))`.

---

## Submission Details

- **Language:** Java
- **Runtime:** 1 ms (Beats 99.81%)
- **Memory:** 69.3 MB (Beats 47.11%)
- **Submission Date:** 2026-08-06 17:07:26 UTC
