# 2110. Number of Smooth Descent Periods of a Stock

**Difficulty:** 🟡 Medium  
**Topics:** `Array` `Math` `Two Pointers` `Dynamic Programming` `Sliding Window`  
**Solve Date:** 2025-12-15 15:33:05 UTC  
**LeetCode Link:** [Number of Smooth Descent Periods of a Stock](https://leetcode.com/problems/number-of-smooth-descent-periods-of-a-stock/)

---

## Problem Description

You are given an integer array `prices` representing the daily price history of a stock, where `prices[i]` is the stock price on the `i^th` day.

A **smooth descent period** of a stock consists of **one or more contiguous** days such that the price on each day is **lower** than the price on the **preceding day** by **exactly** `1`. The first day of the period is exempted from this rule.

Return *the number of **smooth descent periods***.

 

<strong class="example">Example 1:</strong>

```

**Input:** prices = [3,2,1,4]
**Output:** 7
**Explanation:** There are 7 smooth descent periods:
[3], [2], [1], [4], [3,2], [2,1], and [3,2,1]
Note that a period with one day is a smooth descent period by the definition.

```

<strong class="example">Example 2:</strong>

```

**Input:** prices = [8,6,7,7]
**Output:** 4
**Explanation:** There are 4 smooth descent periods: [8], [6], [7], and [7]
Note that [8,6] is not a smooth descent period as 8 - 6 ≠ 1.

```

<strong class="example">Example 3:</strong>

```

**Input:** prices = [1]
**Output:** 1
**Explanation:** There is 1 smooth descent period: [1]

```

 

**Constraints:**

	- `1 <= prices.length <= 10^5`

	- `1 <= prices[i] <= 10^5`

---

## Submission Details

- **Language:** Java
- **Runtime:** 2 ms (Beats 99.39%)
- **Memory:** 84.1 MB (Beats 68.81%)
- **Submission Date:** 2025-12-15 15:33:05 UTC
