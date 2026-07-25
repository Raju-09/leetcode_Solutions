# 139. Word Break

**Difficulty:** 🟡 Medium  
**Topics:** `Array` `Hash Table` `String` `Dynamic Programming` `Trie` `Memoization` `Brute-Force Search`  
**Solve Date:** 2026-07-25 10:57:43 UTC  
**LeetCode Link:** [Word Break](https://leetcode.com/problems/word-break/)

---

## Problem Description

Given a string `s` and a dictionary of strings `wordDict`, return `true` if `s` can be segmented into a space-separated sequence of one or more dictionary words.

**Note** that the same word in the dictionary may be reused multiple times in the segmentation.

 

<strong class="example">Example 1:</strong>

```

**Input:** s = "leetcode", wordDict = ["leet","code"]
**Output:** true
**Explanation:** Return true because "leetcode" can be segmented as "leet code".

```

<strong class="example">Example 2:</strong>

```

**Input:** s = "applepenapple", wordDict = ["apple","pen"]
**Output:** true
**Explanation:** Return true because "applepenapple" can be segmented as "apple pen apple".
Note that you are allowed to reuse a dictionary word.

```

<strong class="example">Example 3:</strong>

```

**Input:** s = "catsandog", wordDict = ["cats","dog","sand","and","cat"]
**Output:** false

```

 

**Constraints:**

	- `1 <= s.length <= 300`

	- `1 <= wordDict.length <= 1000`

	- `1 <= wordDict[i].length <= 20`

	- `s` and `wordDict[i]` consist of only lowercase English letters.

	- All the strings of `wordDict` are **unique**.

---

## Submission Details

- **Language:** Java
- **Runtime:** 8 ms (Beats 48.14%)
- **Memory:** 46.4 MB (Beats 11.40%)
- **Submission Date:** 2026-07-25 10:57:43 UTC
