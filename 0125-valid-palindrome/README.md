# 125. Valid Palindrome

**Difficulty:** 🟢 Easy  
**Topics:** `Two Pointers` `String`  
**Solve Date:** 2026-07-03 10:26:51 UTC  
**LeetCode Link:** [Valid Palindrome](https://leetcode.com/problems/valid-palindrome/)

---

## Problem Description

A phrase is a **palindrome** if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.

Given a string `s`, return `true`* if it is a **palindrome**, or *`false`* otherwise*.

 

<strong class="example">Example 1:</strong>

```

**Input:** s = "A man, a plan, a canal: Panama"
**Output:** true
**Explanation:** "amanaplanacanalpanama" is a palindrome.

```

<strong class="example">Example 2:</strong>

```

**Input:** s = "race a car"
**Output:** false
**Explanation:** "raceacar" is not a palindrome.

```

<strong class="example">Example 3:</strong>

```

**Input:** s = " "
**Output:** true
**Explanation:** s is an empty string "" after removing non-alphanumeric characters.
Since an empty string reads the same forward and backward, it is a palindrome.

```

 

**Constraints:**

	- `1 <= s.length <= 2 * 10^5`

	- `s` consists only of printable ASCII characters.

---

## Submission Details

- **Language:** Java
- **Runtime:** 2 ms (Beats 99.29%)
- **Memory:** 44 MB (Beats 95.65%)
- **Submission Date:** 2026-07-03 10:26:51 UTC
