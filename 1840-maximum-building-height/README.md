# 1840. Maximum Building Height

**Difficulty:** 🔴 Hard  
**Topics:** `Array` `Math` `Sorting`  
**Solve Date:** 2026-06-20 11:11:42 UTC  
**LeetCode Link:** [Maximum Building Height](https://leetcode.com/problems/maximum-building-height/)

---

## Problem Description

You want to build `n` new buildings in a city. The new buildings will be built in a line and are labeled from `1` to `n`.

However, there are city restrictions on the heights of the new buildings:

	- The height of each building must be a non-negative integer.

	- The height of the first building **must** be `0`.

	- The height difference between any two adjacent buildings **cannot exceed** `1`.

Additionally, there are city restrictions on the maximum height of specific buildings. These restrictions are given as a 2D integer array `restrictions` where `restrictions[i] = [id_i, maxHeight_i]` indicates that building `id_i` must have a height **less than or equal to** `maxHeight_i`.

It is guaranteed that each building will appear **at most once** in `restrictions`, and building `1` will **not** be in `restrictions`.

Return *the **maximum possible height** of the **tallest** building*.

 

<strong class="example">Example 1:</strong>

<img alt="" src="https://assets.leetcode.com/uploads/2021/04/08/ic236-q4-ex1-1.png" style="width: 400px; height: 253px;" />
```

**Input:** n = 5, restrictions = [[2,1],[4,1]]
**Output:** 2
**Explanation:** The green area in the image indicates the maximum allowed height for each building.
We can build the buildings with heights [0,1,2,1,2], and the tallest building has a height of 2.
```

<strong class="example">Example 2:</strong>

<img alt="" src="https://assets.leetcode.com/uploads/2021/04/08/ic236-q4-ex2.png" style="width: 500px; height: 269px;" />
```

**Input:** n = 6, restrictions = []
**Output:** 5
**Explanation:** The green area in the image indicates the maximum allowed height for each building.
We can build the buildings with heights [0,1,2,3,4,5], and the tallest building has a height of 5.

```

<strong class="example">Example 3:</strong>

<img alt="" src="https://assets.leetcode.com/uploads/2021/04/08/ic236-q4-ex3.png" style="width: 500px; height: 187px;" />
```

**Input:** n = 10, restrictions = [[5,3],[2,5],[7,4],[10,3]]
**Output:** 5
**Explanation:** The green area in the image indicates the maximum allowed height for each building.
We can build the buildings with heights [0,1,2,3,3,4,4,5,4,3], and the tallest building has a height of 5.

```

 

**Constraints:**

	- `2 <= n <= 10^9`

	- `0 <= restrictions.length <= min(n - 1, 10^5)`

	- `2 <= id_i <= n`

	- `id_i` is **unique**.

	- `0 <= maxHeight_i <= 10^9`

---

## Submission Details

- **Language:** Java
- **Runtime:** 61 ms (Beats 30.65%)
- **Memory:** 123.3 MB (Beats 78.23%)
- **Submission Date:** 2026-06-20 11:11:42 UTC
