# 287. Find the Duplicate Number

**Difficulty:** 🟡 Medium  
**Topics:** `Array` `Two Pointers` `Binary Search` `Bit Manipulation` `Pigeonhole Principle` `Floyd's Cycle Finding Algorithm`  
**Solve Date:** 2026-05-20 04:53:11 UTC  
**LeetCode Link:** [Find the Duplicate Number](https://leetcode.com/problems/find-the-duplicate-number/)

---

## Problem Description

Given an array of integers `nums` containing `n + 1` integers where each integer is in the range `[1, n]` inclusive.

There is only **one repeated number** in `nums`, return *this repeated number*.

You must solve the problem **without** modifying the array `nums` and using only constant extra space.

 

<strong class="example">Example 1:</strong>

```

**Input:** nums = [1,3,4,2,2]
**Output:** 2

```

<strong class="example">Example 2:</strong>

```

**Input:** nums = [3,1,3,4,2]
**Output:** 3

```

<strong class="example">Example 3:</strong>

```

**Input:** nums = [3,3,3,3,3]
**Output:** 3
```

 

**Constraints:**

	- `1 <= n <= 10^5`

	- `nums.length == n + 1`

	- `1 <= nums[i] <= n`

	- All the integers in `nums` appear only **once** except for **precisely one integer** which appears **two or more** times.

 

**Follow up:**

	- How can we prove that at least one duplicate number must exist in `nums`?

	- Can you solve the problem in linear runtime complexity?

---

## Submission Details

- **Language:** Java
- **Runtime:** 1 ms (Beats 100.00%)
- **Memory:** 85.6 MB (Beats 25.91%)
- **Submission Date:** 2026-05-20 04:53:11 UTC
