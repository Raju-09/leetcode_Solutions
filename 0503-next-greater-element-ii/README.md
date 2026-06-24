# 503. Next Greater Element II

**Difficulty:** 🟡 Medium  
**Topics:** `Array` `Stack` `Monotonic Stack`  
**Solve Date:** 2026-06-24 11:59:45 UTC  
**LeetCode Link:** [Next Greater Element II](https://leetcode.com/problems/next-greater-element-ii/)

---

## Problem Description

Given a circular integer array `nums` (i.e., the next element of `nums[nums.length - 1]` is `nums[0]`), return *the **next greater number** for every element in* `nums`.

The **next greater number** of a number `x` is the first greater number to its traversing-order next in the array, which means you could search circularly to find its next greater number. If it doesn't exist, return `-1` for this number.

 

<strong class="example">Example 1:</strong>

```

**Input:** nums = [1,2,1]
**Output:** [2,-1,2]
Explanation: The first 1's next greater number is 2; 
The number 2 can't find next greater number. 
The second 1's next greater number needs to search circularly, which is also 2.

```

<strong class="example">Example 2:</strong>

```

**Input:** nums = [1,2,3,4,3]
**Output:** [2,3,4,-1,4]

```

 

**Constraints:**

	- `1 <= nums.length <= 10^4`

	- `-10^9 <= nums[i] <= 10^9`

---

## Submission Details

- **Language:** Java
- **Runtime:** 90 ms (Beats 6.43%)
- **Memory:** 47.3 MB (Beats 96.83%)
- **Submission Date:** 2026-06-24 11:59:45 UTC
