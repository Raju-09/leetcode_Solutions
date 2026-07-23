# 746. Min Cost Climbing Stairs

**Difficulty:** 🟢 Easy  
**Topics:** `Array` `Dynamic Programming`  
**Solve Date:** 2026-07-23 08:06:29 UTC  
**LeetCode Link:** [Min Cost Climbing Stairs](https://leetcode.com/problems/min-cost-climbing-stairs/)

---

## Problem Description

You are given an integer array `cost` where `cost[i]` is the cost of `i^th` step on a staircase.

Once you pay the cost, you can either climb **one** or **two** steps.

You can either start from the step with index 0, or the step with index 1.

Return the **minimum** cost to reach the top of the staircase, which is the position just past the last step (index `cost.length`).

 

<strong class="example">Example 1:</strong>

```

**Input:** cost = [10,<u>15</u>,20]
**Output:** 15
**Explanation:** You will start at index 1.
- Pay 15 and climb two steps to reach the top.
The total cost is 15.

```

<strong class="example">Example 2:</strong>

```

**Input:** cost = [<u>1</u>,100,<u>1</u>,1,<u>1</u>,100,<u>1</u>,<u>1</u>,100,<u>1</u>]
**Output:** 6
**Explanation:** You will start at index 0.
- Pay 1 and climb two steps to reach index 2.
- Pay 1 and climb two steps to reach index 4.
- Pay 1 and climb two steps to reach index 6.
- Pay 1 and climb one step to reach index 7.
- Pay 1 and climb two steps to reach index 9.
- Pay 1 and climb one step to reach the top.
The total cost is 6.

```

 

**Constraints:**

	- `2 <= cost.length <= 1000`

	- `0 <= cost[i] <= 999`

---

## Submission Details

- **Language:** Java
- **Runtime:** 0 ms (Beats 100.00%)
- **Memory:** 44.8 MB (Beats 75.79%)
- **Submission Date:** 2026-07-23 08:06:29 UTC
