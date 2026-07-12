# 1331. Rank Transform of an Array

**Difficulty:** 🟢 Easy  
**Topics:** `Array` `Hash Table` `Sorting`  
**Solve Date:** 2026-07-12 11:41:41 UTC  
**LeetCode Link:** [Rank Transform of an Array](https://leetcode.com/problems/rank-transform-of-an-array/)

---

## Problem Description

Given an array of integers `arr`, replace each element with its rank.

The rank represents how large the element is. The rank has the following rules:

	- Rank is an integer starting from 1.

	- The larger the element, the larger the rank. If two elements are equal, their rank must be the same.

	- Rank should be as small as possible.

 

<strong class="example">Example 1:</strong>

```

**Input:** arr = [40,10,20,30]
**Output:** [4,1,2,3]
**Explanation**: 40 is the largest element. 10 is the smallest. 20 is the second smallest. 30 is the third smallest.
```

<strong class="example">Example 2:</strong>

```

**Input:** arr = [100,100,100]
**Output:** [1,1,1]
**Explanation**: Same elements share the same rank.

```

<strong class="example">Example 3:</strong>

```

**Input:** arr = [37,12,28,9,100,56,80,5,12]
**Output:** [5,3,4,2,8,6,7,1,3]

```

 

**Constraints:**

	- `0 <= arr.length <= 10^5`

	- `-10^9 <= arr[i] <= 10^9`

---

## Submission Details

- **Language:** Java
- **Runtime:** 31 ms (Beats 55.50%)
- **Memory:** 77 MB (Beats 30.45%)
- **Submission Date:** 2026-07-12 11:41:41 UTC
