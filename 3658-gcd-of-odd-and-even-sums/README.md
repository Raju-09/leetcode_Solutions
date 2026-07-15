# 3658. GCD of Odd and Even Sums

**Difficulty:** 🟢 Easy  
**Topics:** `Math` `Number Theory`  
**Solve Date:** 2026-07-15 00:55:33 UTC  
**LeetCode Link:** [GCD of Odd and Even Sums](https://leetcode.com/problems/gcd-of-odd-and-even-sums/)

---

## Problem Description

You are given an integer `n`. Your task is to compute the **GCD** (greatest common divisor) of two values:

	- 
	`sumOdd`: the sum of the smallest `n` positive odd numbers.

	

	- 
	`sumEven`: the sum of the smallest `n` positive even numbers.

	

Return the GCD of `sumOdd` and `sumEven`.

 

<strong class="example">Example 1:</strong>

**Input:** n = 4

**Output:** 4

**Explanation:**

	- Sum of the first 4 odd numbers `sumOdd = 1 + 3 + 5 + 7 = 16`

	- Sum of the first 4 even numbers `sumEven = 2 + 4 + 6 + 8 = 20`

Hence, `GCD(sumOdd, sumEven) = GCD(16, 20) = 4`.

<strong class="example">Example 2:</strong>

**Input:** n = 5

**Output:** 5

**Explanation:**

	- Sum of the first 5 odd numbers `sumOdd = 1 + 3 + 5 + 7 + 9 = 25`

	- Sum of the first 5 even numbers `sumEven = 2 + 4 + 6 + 8 + 10 = 30`

Hence, `GCD(sumOdd, sumEven) = GCD(25, 30) = 5`.

 

**Constraints:**

	- `1 <= n <= 10​​​​​​​00`

---

## Submission Details

- **Language:** Java
- **Runtime:** 0 ms (Beats 100.00%)
- **Memory:** 42.1 MB (Beats 97.17%)
- **Submission Date:** 2026-07-15 00:55:33 UTC
