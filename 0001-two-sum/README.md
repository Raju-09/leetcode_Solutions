# 1. Two Sum

**Difficulty:** 🟢 Easy  
**Topics:** `Array` `Hash Table`  
**Solve Date:** 2026-08-05 09:41:59 UTC  
**LeetCode Link:** [Two Sum](https://leetcode.com/problems/two-sum/)

---

## Problem Description

You are given an array of integers `nums` and an integer `target`, return *indices of the two numbers such that they add up to `target`*.

You may assume that each input would have ***exactly* one solution**, and you may not use the *same* element twice.

You can return the answer in any order.

 

<strong class="example">Example 1:</strong>

```

**Input:** nums = [2,7,11,15], target = 9
**Output:** [0,1]
**Explanation:** Because nums[0] + nums[1] == 9, we return [0, 1].

```

<strong class="example">Example 2:</strong>

```

**Input:** nums = [3,2,4], target = 6
**Output:** [1,2]

```

<strong class="example">Example 3:</strong>

```

**Input:** nums = [3,3], target = 6
**Output:** [0,1]

```

 

**Constraints:**

	- `2 <= nums.length <= 10^4`

	- `-10^9 <= nums[i] <= 10^9`

	- `-10^9 <= target <= 10^9`

	- **Only one valid answer exists.**

 

**Follow-up: **Can you come up with an algorithm that is less than `O(n^2)`<font face="monospace"> </font>time complexity?

---

## Submission Details

- **Language:** Java
- **Runtime:** 44 ms (Beats 34.47%)
- **Memory:** 46.8 MB (Beats 90.35%)
- **Submission Date:** 2026-08-05 09:41:59 UTC
