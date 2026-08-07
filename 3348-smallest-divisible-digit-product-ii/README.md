# 3348. Smallest Divisible Digit Product II

**Difficulty:** 🔴 Hard  
**Topics:** `Math` `String` `Backtracking` `Greedy` `Number Theory`  
**Solve Date:** 2026-08-07 12:59:53 UTC  
**LeetCode Link:** [Smallest Divisible Digit Product II](https://leetcode.com/problems/smallest-divisible-digit-product-ii/)

---

## Problem Description

You are given a string `num` which represents a **positive** integer, and an integer `t`.

A number is called **zero-free** if *none* of its digits are 0.

Return a string representing the **smallest** **zero-free** number greater than or equal to `num` such that the **product of its digits** is divisible by `t`. If no such number exists, return `"-1"`.

 

<strong class="example">Example 1:</strong>

**Input:** num = "1234", t = 256

**Output:** "1488"

**Explanation:**

The smallest zero-free number that is greater than 1234 and has the product of its digits divisible by 256 is 1488, with the product of its digits equal to 256.

<strong class="example">Example 2:</strong>

**Input:** num = "12355", t = 50

**Output:** "12355"

**Explanation:**

12355 is already zero-free and has the product of its digits divisible by 50, with the product of its digits equal to 150.

<strong class="example">Example 3:</strong>

**Input:** num = "11111", t = 26

**Output:** "-1"

**Explanation:**

No number greater than 11111 has the product of its digits divisible by 26.

 

**Constraints:**

	- `2 <= num.length <= 2 * 10^5`

	- `num` consists only of digits in the range `['0', '9']`.

	- `num` does not contain leading zeros.

	- `1 <= t <= 10^14`

---

## Submission Details

- **Language:** Java
- **Runtime:** 14 ms (Beats 98.83%)
- **Memory:** 48.2 MB (Beats 81.06%)
- **Submission Date:** 2026-08-07 12:59:53 UTC
