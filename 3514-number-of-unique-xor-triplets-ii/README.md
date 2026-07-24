# 3514. Number of Unique XOR Triplets II

**Difficulty:** 🟡 Medium  
**Topics:** `Array` `Math` `Bit Manipulation` `Enumeration`  
**Solve Date:** 2026-07-24 03:17:57 UTC  
**LeetCode Link:** [Number of Unique XOR Triplets II](https://leetcode.com/problems/number-of-unique-xor-triplets-ii/)

---

## Problem Description

<p data-end="261" data-start="147">You are given an integer array `nums`.</p>

A **XOR triplet** is defined as the XOR of three elements `nums[i] XOR nums[j] XOR nums[k]` where `i <= j <= k`.

Return the number of **unique** XOR triplet values from all possible triplets `(i, j, k)`.

 

<strong class="example">Example 1:</strong>

**Input:** nums = [1,3]

**Output:** 2

**Explanation:**

<p data-end="158" data-start="101">The possible XOR triplet values are:</p>

	<li data-end="188" data-start="159">`(0, 0, 0) → 1 XOR 1 XOR 1 = 1`</li>
	<li data-end="218" data-start="189">`(0, 0, 1) → 1 XOR 1 XOR 3 = 3`</li>
	<li data-end="248" data-start="219">`(0, 1, 1) → 1 XOR 3 XOR 3 = 1`</li>
	<li data-end="280" data-start="249">`(1, 1, 1) → 3 XOR 3 XOR 3 = 3`</li>

<p data-end="343" data-start="282">The unique XOR values are <code data-end="316" data-start="308">{1, 3}</code>. Thus, the output is 2.</p>

<strong class="example">Example 2:</strong>

**Input:** nums = [6,7,8,9]

**Output:** 4

**Explanation:**

The possible XOR triplet values are <code data-end="275" data-start="267">{6, 7, 8, 9}</code>. Thus, the output is 4.

 

**Constraints:**

	- `1 <= nums.length <= 1500`

	- `1 <= nums[i] <= 1500`

---

## Submission Details

- **Language:** Java
- **Runtime:** 413 ms (Beats 26.38%)
- **Memory:** 46.9 MB (Beats 59.36%)
- **Submission Date:** 2026-07-24 03:17:57 UTC
