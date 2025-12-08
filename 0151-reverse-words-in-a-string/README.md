# 151. Reverse Words in a String

**Difficulty:** 🟡 Medium  
**Topics:** `Two Pointers` `String`  
**Solve Date:** 2025-12-08 06:43:57 UTC  
**LeetCode Link:** [Reverse Words in a String](https://leetcode.com/problems/reverse-words-in-a-string/)

---

## Problem Description

Given an input string `s`, reverse the order of the **words**.

A **word** is defined as a sequence of non-space characters. The **words** in `s` will be separated by at least one space.

Return *a string of the words in reverse order concatenated by a single space.*

**Note** that `s` may contain leading or trailing spaces or multiple spaces between two words. The returned string should only have a single space separating the words. Do not include any extra spaces.

 

<strong class="example">Example 1:</strong>

```

**Input:** s = "the sky is blue"
**Output:** "blue is sky the"

```

<strong class="example">Example 2:</strong>

```

**Input:** s = "  hello world  "
**Output:** "world hello"
**Explanation:** Your reversed string should not contain leading or trailing spaces.

```

<strong class="example">Example 3:</strong>

```

**Input:** s = "a good   example"
**Output:** "example good a"
**Explanation:** You need to reduce multiple spaces between two words to a single space in the reversed string.

```

 

**Constraints:**

	- `1 <= s.length <= 10^4`

	- `s` contains English letters (upper-case and lower-case), digits, and spaces `' '`.

	- There is **at least one** word in `s`.

 

<b data-stringify-type="bold">Follow-up: </b>If the string data type is mutable in your language, can you solve it <b data-stringify-type="bold">in-place</b> with <code data-stringify-type="code">O(1)</code> extra space?

---

## Submission Details

- **Language:** Java
- **Runtime:** 4 ms (Beats 93.45%)
- **Memory:** 44.4 MB (Beats 57.52%)
- **Submission Date:** 2025-12-08 06:43:57 UTC
