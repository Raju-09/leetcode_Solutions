# 3232. Find if Digit Game Can Be Won

**Difficulty:** 🟢 Easy  
**Topics:** `Array` `Math`  
**Solve Date:** 2026-06-10 14:00:29 UTC  
**LeetCode Link:** [Find if Digit Game Can Be Won](https://leetcode.com/problems/find-if-digit-game-can-be-won/)

---

## Problem Description

You are given an array of **positive** integers `nums`.

Alice and Bob are playing a game. In the game, Alice can choose **either** all single-digit numbers or all double-digit numbers from `nums`, and the rest of the numbers are given to Bob. Alice wins if the sum of her numbers is **strictly greater** than the sum of Bob's numbers.

Return `true` if Alice can win this game, otherwise, return `false`.

 

<strong class="example">Example 1:</strong>

**Input:** nums = [1,2,3,4,10]

**Output:** false

**Explanation:**

Alice cannot win by choosing either single-digit or double-digit numbers.

<strong class="example">Example 2:</strong>

**Input:** nums = [1,2,3,4,5,14]

**Output:** true

**Explanation:**

Alice can win by choosing single-digit numbers which have a sum equal to 15.

<strong class="example">Example 3:</strong>

**Input:** nums = [5,5,5,25]

**Output:** true

**Explanation:**

Alice can win by choosing double-digit numbers which have a sum equal to 25.

 

**Constraints:**

	- `1 <= nums.length <= 100`

	- `1 <= nums[i] <= 99`

---

## Submission Details

- **Language:** Java
- **Runtime:** 1 ms (Beats 91.50%)
- **Memory:** 45.2 MB (Beats 87.94%)
- **Submission Date:** 2026-06-10 14:00:29 UTC
