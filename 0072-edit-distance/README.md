# 72. Edit Distance

**Difficulty:** 🟡 Medium  
**Topics:** `String` `Dynamic Programming`  
**Solve Date:** 2026-07-25 10:49:27 UTC  
**LeetCode Link:** [Edit Distance](https://leetcode.com/problems/edit-distance/)

---

## Problem Description

Given two strings `word1` and `word2`, return *the minimum number of operations required to convert `word1` to `word2`*.

You have the following three operations permitted on a word:

	- Insert a character

	- Delete a character

	- Replace a character

 

<strong class="example">Example 1:</strong>

```

**Input:** word1 = "horse", word2 = "ros"
**Output:** 3
**Explanation:** 
horse -> rorse (replace 'h' with 'r')
rorse -> rose (remove 'r')
rose -> ros (remove 'e')

```

<strong class="example">Example 2:</strong>

```

**Input:** word1 = "intention", word2 = "execution"
**Output:** 5
**Explanation:** 
intention -> inention (remove 't')
inention -> enention (replace 'i' with 'e')
enention -> exention (replace 'n' with 'x')
exention -> exection (replace 'n' with 'c')
exection -> execution (insert 'u')

```

 

**Constraints:**

	- `0 <= word1.length, word2.length <= 500`

	- `word1` and `word2` consist of lowercase English letters.

---

## Submission Details

- **Language:** Java
- **Runtime:** 5 ms (Beats 66.55%)
- **Memory:** 47.1 MB (Beats 70.24%)
- **Submission Date:** 2026-07-25 10:49:27 UTC
