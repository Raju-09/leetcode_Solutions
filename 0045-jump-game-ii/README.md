# 45. Jump Game II

**Difficulty:** 🟡 Medium  
**Topics:** `Array` `Dynamic Programming` `Greedy`  
**Solve Date:** 2025-12-22 16:09:25 UTC  
**LeetCode Link:** [Jump Game II](https://leetcode.com/problems/jump-game-ii/)

---

## Problem Description

You are given a **0-indexed** array of integers `nums` of length `n`. You are initially positioned at index 0.

Each element `nums[i]` represents the maximum length of a forward jump from index `i`. In other words, if you are at index `i`, you can jump to any index `(i + j)` where:

	- `0 <= j <= nums[i]` and

	- `i + j < n`

Return *the minimum number of jumps to reach index *`n - 1`. The test cases are generated such that you can reach index `n - 1`.

 

<strong class="example">Example 1:</strong>

```

**Input:** nums = [2,3,1,1,4]
**Output:** 2
**Explanation:** The minimum number of jumps to reach the last index is 2. Jump 1 step from index 0 to 1, then 3 steps to the last index.

```

<strong class="example">Example 2:</strong>

```

**Input:** nums = [2,3,0,1,4]
**Output:** 2

```

 

**Constraints:**

	- `1 <= nums.length <= 10^4`

	- `0 <= nums[i] <= 1000`

	- It's guaranteed that you can reach `nums[n - 1]`.

---

## Submission Details

- **Language:** Java
- **Runtime:** 1 ms (Beats 99.78%)
- **Memory:** 47.3 MB (Beats 38.75%)
- **Submission Date:** 2025-12-22 16:09:25 UTC
