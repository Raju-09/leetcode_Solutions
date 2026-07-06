# 1288. Remove Covered Intervals

**Difficulty:** 🟡 Medium  
**Topics:** `Array` `Sorting`  
**Solve Date:** 2026-07-06 15:31:20 UTC  
**LeetCode Link:** [Remove Covered Intervals](https://leetcode.com/problems/remove-covered-intervals/)

---

## Problem Description

Given an array `intervals` where `intervals[i] = [l_i, r_i]` represent the interval `[l_i, r_i)`, remove all intervals that are covered by another interval in the list.

The interval `[a, b)` is covered by the interval `[c, d)` if and only if `c <= a` and `b <= d`.

Return *the number of remaining intervals*.

 

<strong class="example">Example 1:</strong>

```

**Input:** intervals = [[1,4],[3,6],[2,8]]
**Output:** 2
**Explanation:** Interval [3,6] is covered by [2,8], therefore it is removed.

```

<strong class="example">Example 2:</strong>

```

**Input:** intervals = [[1,4],[2,3]]
**Output:** 1

```

 

**Constraints:**

	- `1 <= intervals.length <= 1000`

	- `intervals[i].length == 2`

	- `0 <= l_i < r_i <= 10^5`

	- All the given intervals are **unique**.

---

## Submission Details

- **Language:** Java
- **Runtime:** 3 ms (Beats 99.29%)
- **Memory:** 46.7 MB (Beats 10.79%)
- **Submission Date:** 2026-07-06 15:31:20 UTC
