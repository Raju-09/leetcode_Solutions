# 1480. Running Sum of 1d Array

**Difficulty:** 🟢 Easy  
**Topics:** `Array` `Prefix Sum`  
**Solve Date:** 2026-06-08 13:29:42 UTC  
**LeetCode Link:** [Running Sum of 1d Array](https://leetcode.com/problems/running-sum-of-1d-array/)

---

## Problem Description

Given an array `nums`. We define a running sum of an array as `runningSum[i] = sum(nums[0]…nums[i])`.

Return the running sum of `nums`.

 

<strong class="example">Example 1:</strong>

```

**Input:** nums = [1,2,3,4]
**Output:** [1,3,6,10]
**Explanation:** Running sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4].
```

<strong class="example">Example 2:</strong>

```

**Input:** nums = [1,1,1,1,1]
**Output:** [1,2,3,4,5]
**Explanation:** Running sum is obtained as follows: [1, 1+1, 1+1+1, 1+1+1+1, 1+1+1+1+1].
```

<strong class="example">Example 3:</strong>

```

**Input:** nums = [3,1,2,10,1]
**Output:** [3,4,6,16,17]

```

 

**Constraints:**

	- `1 <= nums.length <= 1000`

	- `-10^6 <= nums[i] <= 10^6`

---

## Submission Details

- **Language:** Java
- **Runtime:** 0 ms (Beats 100.00%)
- **Memory:** 44.3 MB (Beats 35.31%)
- **Submission Date:** 2026-06-08 13:29:42 UTC
