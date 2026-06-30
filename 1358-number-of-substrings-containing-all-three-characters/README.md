# 1358. Number of Substrings Containing All Three Characters

**Difficulty:** 🟡 Medium  
**Topics:** `Hash Table` `String` `Sliding Window`  
**Solve Date:** 2026-06-30 11:28:12 UTC  
**LeetCode Link:** [Number of Substrings Containing All Three Characters](https://leetcode.com/problems/number-of-substrings-containing-all-three-characters/)

---

## Problem Description

Given a string `s` consisting only of characters *a*, *b* and *c*.

Return the number of substrings containing **at least** one occurrence of all these characters *a*, *b* and *c*.

 

<strong class="example">Example 1:</strong>

```

**Input:** s = "abcabc"
**Output:** 10
**Explanation:** The substrings containing at least one occurrence of the characters *a*, *b* and *c are "*abc*", "*abca*", "*abcab*", "*abcabc*", "*bca*", "*bcab*", "*bcabc*", "*cab*", "*cabc*" *and* "*abc*" *(**again**)*. *

```

<strong class="example">Example 2:</strong>

```

**Input:** s = "aaacb"
**Output:** 3
**Explanation:** The substrings containing at least one occurrence of the characters *a*, *b* and *c are "*aaacb*", "*aacb*" *and* "*acb*".** *

```

<strong class="example">Example 3:</strong>

```

**Input:** s = "abc"
**Output:** 1

```

 

**Constraints:**

	- `3 <= s.length <= 5 x 10^4`

	- `s` only consists of `'a'`, `'b'` or `'c'` characters.

---

## Submission Details

- **Language:** Java
- **Runtime:** 9 ms (Beats 98.10%)
- **Memory:** 46.2 MB (Beats 78.67%)
- **Submission Date:** 2026-06-30 11:28:12 UTC
