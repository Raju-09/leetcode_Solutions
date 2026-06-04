# 20. Valid Parentheses

**Difficulty:** 🟢 Easy  
**Topics:** `String` `Stack` `Bracket Sequences`  
**Solve Date:** 2026-06-04 14:32:21 UTC  
**LeetCode Link:** [Valid Parentheses](https://leetcode.com/problems/valid-parentheses/)

---

## Problem Description

Given a string `s` containing just the characters `'('`, `')'`, `'{'`, `'}'`, `'['` and `']'`, determine if the input string is valid.

An input string is valid if:

	- Open brackets must be closed by the same type of brackets.

	- Open brackets must be closed in the correct order.

	- Every close bracket has a corresponding open bracket of the same type.

 

<strong class="example">Example 1:</strong>

**Input:** s = "()"

**Output:** true

<strong class="example">Example 2:</strong>

**Input:** s = "()[]{}"

**Output:** true

<strong class="example">Example 3:</strong>

**Input:** s = "(]"

**Output:** false

<strong class="example">Example 4:</strong>

**Input:** s = "([])"

**Output:** true

<strong class="example">Example 5:</strong>

**Input:** s = "([)]"

**Output:** false

 

**Constraints:**

	- `1 <= s.length <= 10^4`

	- `s` consists of parentheses only `'()[]{}'`.

---

## Submission Details

- **Language:** Java
- **Runtime:** 3 ms (Beats 85.94%)
- **Memory:** 43 MB (Beats 92.70%)
- **Submission Date:** 2026-06-04 14:32:21 UTC
