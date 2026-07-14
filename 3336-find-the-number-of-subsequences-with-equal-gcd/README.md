# 3336. Find the Number of Subsequences With Equal GCD

**Difficulty:** 🔴 Hard  
**Topics:** `Array` `Math` `Dynamic Programming` `Number Theory` `Euclidean Algorithm` `Greatest Common Divisor`  
**Solve Date:** 2026-07-14 10:06:01 UTC  
**LeetCode Link:** [Find the Number of Subsequences With Equal GCD](https://leetcode.com/problems/find-the-number-of-subsequences-with-equal-gcd/)

---

## Problem Description

You are given an integer array `nums`.

Your task is to find the number of pairs of **non-empty** subsequences `(seq1, seq2)` of `nums` that satisfy the following conditions:

	- The subsequences `seq1` and `seq2` are **disjoint**, meaning **no index** of `nums` is common between them.

	- The GCD of the elements of `seq1` is equal to the GCD of the elements of `seq2`.

Return the total number of such pairs.

Since the answer may be very large, return it **modulo** `10^9 + 7`.

 

<strong class="example">Example 1:</strong>

**Input:** nums = [1,2,3,4]

**Output:** 10

**Explanation:**

The subsequence pairs which have the GCD of their elements equal to 1 are:

	- `([**<u>1</u>**, 2, 3, 4], [1, **<u>2</u>**, **<u>3</u>**, 4])`

	- `([**<u>1</u>**, 2, 3, 4], [1, **<u>2</u>**, **<u>3</u>**, **<u>4</u>**])`

	- `([**<u>1</u>**, 2, 3, 4], [1, 2, **<u>3</u>**, **<u>4</u>**])`

	- `([**<u>1</u>**, **<u>2</u>**, 3, 4], [1, 2, **<u>3</u>**, **<u>4</u>**])`

	- `([**<u>1</u>**, 2, 3, **<u>4</u>**], [1, **<u>2</u>**, **<u>3</u>**, 4])`

	- `([1, **<u>2</u>**, **<u>3</u>**, 4], [**<u>1</u>**, 2, 3, 4])`

	- `([1, **<u>2</u>**, **<u>3</u>**, 4], [**<u>1</u>**, 2, 3, **<u>4</u>**])`

	- `([1, **<u>2</u>**, **<u>3</u>**, **<u>4</u>**], [**<u>1</u>**, 2, 3, 4])`

	- `([1, 2, **<u>3</u>**, **<u>4</u>**], [**<u>1</u>**, 2, 3, 4])`

	- `([1, 2, **<u>3</u>**, **<u>4</u>**], [**<u>1</u>**, **<u>2</u>**, 3, 4])`

<strong class="example">Example 2:</strong>

**Input:** nums = [10,20,30]

**Output:** 2

**Explanation:**

The subsequence pairs which have the GCD of their elements equal to 10 are:

	- `([**<u>10</u>**, 20, 30], [10, **<u>20</u>**, **<u>30</u>**])`

	- `([10, **<u>20</u>**, **<u>30</u>**], [**<u>10</u>**, 20, 30])`

<strong class="example">Example 3:</strong>

**Input:** nums = [1,1,1,1]

**Output:** 50

 

**Constraints:**

	- `1 <= nums.length <= 200`

	- `1 <= nums[i] <= 200`

---

## Submission Details

- **Language:** Java
- **Runtime:** 15 ms (Beats 100.00%)
- **Memory:** 46.5 MB (Beats 99.49%)
- **Submission Date:** 2026-07-14 10:06:01 UTC
