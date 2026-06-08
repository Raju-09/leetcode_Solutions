# 1539. Kth Missing Positive Number

**Difficulty:** 🟢 Easy  
**Topics:** `Array` `Binary Search`  
**Solve Date:** 2026-06-08 16:06:07 UTC  
**LeetCode Link:** [Kth Missing Positive Number](https://leetcode.com/problems/kth-missing-positive-number/)

---

## Problem Description

Given an array `arr` of positive integers sorted in a **strictly increasing order**, and an integer `k`.

Return *the* `k^th` ***positive** integer that is **missing** from this array.*

 

<strong class="example">Example 1:</strong>

```

**Input:** arr = [2,3,4,7,11], k = 5
**Output:** 9
**Explanation: **The missing positive integers are [1,5,6,8,9,10,12,13,...]. The 5^th missing positive integer is 9.

```

<strong class="example">Example 2:</strong>

```

**Input:** arr = [1,2,3,4], k = 2
**Output:** 6
**Explanation: **The missing positive integers are [5,6,7,...]. The 2^nd missing positive integer is 6.

```

 

**Constraints:**

	- `1 <= arr.length <= 1000`

	- `1 <= arr[i] <= 1000`

	- `1 <= k <= 1000`

	- `arr[i] < arr[j]` for `1 <= i < j <= arr.length`

 

**Follow up:**

Could you solve this problem in less than O(n) complexity?

---

## Submission Details

- **Language:** Java
- **Runtime:** 0 ms (Beats 100.00%)
- **Memory:** 44.7 MB (Beats 24.48%)
- **Submission Date:** 2026-06-08 16:06:07 UTC
