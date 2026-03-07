# 1888. Minimum Number of Flips to Make the Binary String Alternating

**Difficulty:** 🟡 Medium  
**Topics:** `String` `Dynamic Programming` `Sliding Window`  
**Solve Date:** 2026-03-07 09:13:01 UTC  
**LeetCode Link:** [Minimum Number of Flips to Make the Binary String Alternating](https://leetcode.com/problems/minimum-number-of-flips-to-make-the-binary-string-alternating/)

---

## Problem Description

You are given a binary string `s`. You are allowed to perform two types of operations on the string in any sequence:

	- **Type-1: Remove** the character at the start of the string `s` and **append** it to the end of the string.

	- **Type-2: Pick** any character in `s` and **flip** its value, i.e., if its value is `'0'` it becomes `'1'` and vice-versa.

Return *the **minimum** number of **type-2** operations you need to perform* *such that *`s` *becomes **alternating**.*

The string is called **alternating** if no two adjacent characters are equal.

	- For example, the strings `"010"` and `"1010"` are alternating, while the string `"0100"` is not.

 

<strong class="example">Example 1:</strong>

```

**Input:** s = "111000"
**Output:** 2
**Explanation**: Use the first operation two times to make s = "100011".
Then, use the second operation on the third and sixth elements to make s = "10<u>1</u>01<u>0</u>".

```

<strong class="example">Example 2:</strong>

```

**Input:** s = "010"
**Output:** 0
**Explanation**: The string is already alternating.

```

<strong class="example">Example 3:</strong>

```

**Input:** s = "1110"
**Output:** 1
**Explanation**: Use the second operation on the second element to make s = "1<u>0</u>10".

```

 

**Constraints:**

	- `1 <= s.length <= 10^5`

	- `s[i]` is either `'0'` or `'1'`.

---

## Submission Details

- **Language:** Java
- **Runtime:** 18 ms (Beats 83.64%)
- **Memory:** 47.1 MB (Beats 67.28%)
- **Submission Date:** 2026-03-07 09:13:01 UTC
