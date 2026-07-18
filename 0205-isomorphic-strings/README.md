# 205. Isomorphic Strings

**Difficulty:** 🟢 Easy  
**Topics:** `Hash Table` `String`  
**Solve Date:** 2026-07-18 17:09:46 UTC  
**LeetCode Link:** [Isomorphic Strings](https://leetcode.com/problems/isomorphic-strings/)

---

## Problem Description

Given two strings `s` and `t`, *determine if they are isomorphic*.

Two strings `s` and `t` are isomorphic if the characters in `s` can be replaced to get `t`.

All occurrences of a character must be replaced with another character while preserving the order of characters. No two characters may map to the same character, but a character may map to itself.

 

<strong class="example">Example 1:</strong>

**Input:** s = "egg", t = "add"

**Output:** true

**Explanation:**

The strings `s` and `t` can be made identical by:

	- Mapping `'e'` to `'a'`.

	- Mapping `'g'` to `'d'`.

<strong class="example">Example 2:</strong>

**Input:** s = "f11", t = "b23"

**Output:** false

**Explanation:**

The strings `s` and `t` can not be made identical as `'1'` needs to be mapped to both `'2'` and `'3'`.

<strong class="example">Example 3:</strong>

**Input:** s = "paper", t = "title"

**Output:** true

 

**Constraints:**

	- `1 <= s.length <= 5 * 10^4`

	- `t.length == s.length`

	- `s` and `t` consist of any valid ascii character.

---

## Submission Details

- **Language:** Java
- **Runtime:** 6 ms (Beats 87.52%)
- **Memory:** 44.1 MB (Beats 25.83%)
- **Submission Date:** 2026-07-18 17:09:46 UTC
