# 739. Daily Temperatures

**Difficulty:** 🟡 Medium  
**Topics:** `Array` `Stack` `Monotonic Stack`  
**Solve Date:** 2026-06-25 02:58:33 UTC  
**LeetCode Link:** [Daily Temperatures](https://leetcode.com/problems/daily-temperatures/)

---

## Problem Description

Given an array of integers `temperatures` represents the daily temperatures, return *an array* `answer` *such that* `answer[i]` *is the number of days you have to wait after the* `i^th` *day to get a warmer temperature*. If there is no future day for which this is possible, keep `answer[i] == 0` instead.

 

<strong class="example">Example 1:</strong>

```
**Input:** temperatures = [73,74,75,71,69,72,76,73]
**Output:** [1,1,4,2,1,1,0,0]

```<strong class="example">Example 2:</strong>

```
**Input:** temperatures = [30,40,50,60]
**Output:** [1,1,1,0]

```<strong class="example">Example 3:</strong>

```
**Input:** temperatures = [30,60,90]
**Output:** [1,1,0]

```
 

**Constraints:**

	- `1 <= temperatures.length <= 10^5`

	- `30 <= temperatures[i] <= 100`

---

## Submission Details

- **Language:** Java
- **Runtime:** 24 ms (Beats 85.22%)
- **Memory:** 106.7 MB (Beats 61.78%)
- **Submission Date:** 2026-06-25 02:58:33 UTC
