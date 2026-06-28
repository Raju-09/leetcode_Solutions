# 744. Find Smallest Letter Greater Than Target

**Difficulty:** 🟢 Easy  
**Topics:** `Array` `Binary Search`  
**Solve Date:** 2026-06-28 15:34:34 UTC  
**LeetCode Link:** [Find Smallest Letter Greater Than Target](https://leetcode.com/problems/find-smallest-letter-greater-than-target/)

---

## Problem Description

You are given an array of characters `letters` that is sorted in **non-decreasing order**, and a character `target`. There are **at least two different** characters in `letters`.

Return *the smallest character in *`letters`* that is lexicographically greater than *`target`. If such a character does not exist, return the first character in `letters`.

 

<strong class="example">Example 1:</strong>

```

**Input:** letters = ["c","f","j"], target = "a"
**Output:** "c"
**Explanation:** The smallest character that is lexicographically greater than 'a' in letters is 'c'.

```

<strong class="example">Example 2:</strong>

```

**Input:** letters = ["c","f","j"], target = "c"
**Output:** "f"
**Explanation:** The smallest character that is lexicographically greater than 'c' in letters is 'f'.

```

<strong class="example">Example 3:</strong>

```

**Input:** letters = ["x","x","y","y"], target = "z"
**Output:** "x"
**Explanation:** There are no characters in letters that is lexicographically greater than 'z' so we return letters[0].

```

 

**Constraints:**

	- `2 <= letters.length <= 10^4`

	- `letters[i]` is a lowercase English letter.

	- `letters` is sorted in **non-decreasing** order.

	- `letters` contains at least two different characters.

	- `target` is a lowercase English letter.

---

## Submission Details

- **Language:** Java
- **Runtime:** 0 ms (Beats 100.00%)
- **Memory:** 46.5 MB (Beats 32.25%)
- **Submission Date:** 2026-06-28 15:34:34 UTC
