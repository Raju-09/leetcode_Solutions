# 3499. Maximize Active Section with Trade I

**Difficulty:** 🟡 Medium  
**Topics:** `String` `Enumeration`  
**Solve Date:** 2026-07-21 00:21:57 UTC  
**LeetCode Link:** [Maximize Active Section with Trade I](https://leetcode.com/problems/maximize-active-section-with-trade-i/)

---

## Problem Description

You are given a binary string `s` of length `n`, where:

	- `'1'` represents an **active** section.

	- `'0'` represents an **inactive** section.

You can perform **at most one trade** to maximize the number of active sections in `s`. In a trade, you:

	- Convert a contiguous block of `'1'`s that is surrounded by `'0'`s to all `'0'`s.

	- Afterward, convert a contiguous block of `'0'`s that is surrounded by `'1'`s to all `'1'`s.

Return the **maximum** number of active sections in `s` after making the optimal trade.

**Note:** Treat `s` as if it is **augmented** with a `'1'` at both ends, forming `t = '1' + s + '1'`. The augmented `'1'`s **do not** contribute to the final count.

 

<strong class="example">Example 1:</strong>

**Input:** s = "01"

**Output:** 1

**Explanation:**

Because there is no block of `'1'`s surrounded by `'0'`s, no valid trade is possible. The maximum number of active sections is 1.

<strong class="example">Example 2:</strong>

**Input:** s = "0100"

**Output:** 4

**Explanation:**

	- String `"0100"` → Augmented to `"101001"`.

	- Choose `"0100"`, convert `"10<u>**1**</u>001"` → `"1<u>**0000**</u>1"` → `"1<u>**1111**</u>1"`.

	- The final string without augmentation is `"1111"`. The maximum number of active sections is 4.

<strong class="example">Example 3:</strong>

**Input:** s = "1000100"

**Output:** 7

**Explanation:**

	- String `"1000100"` → Augmented to `"110001001"`.

	- Choose `"000100"`, convert `"11000<u>**1**</u>001"` → `"11<u>**000000**</u>1"` → `"11<u>**111111**</u>1"`.

	- The final string without augmentation is `"1111111"`. The maximum number of active sections is 7.

<strong class="example">Example 4:</strong>

**Input:** s = "01010"

**Output:** 4

**Explanation:**

	- String `"01010"` → Augmented to `"1010101"`.

	- Choose `"010"`, convert `"10<u>**1**</u>0101"` → `"1<u>**000**</u>101"` → `"1<u>**111**</u>101"`.

	- The final string without augmentation is `"11110"`. The maximum number of active sections is 4.

 

**Constraints:**

	- `1 <= n == s.length <= 10^5`

	- `s[i]` is either `'0'` or `'1'`

---

## Submission Details

- **Language:** Java
- **Runtime:** 50 ms (Beats 96.85%)
- **Memory:** 47.7 MB (Beats 85.77%)
- **Submission Date:** 2026-07-21 00:21:57 UTC
