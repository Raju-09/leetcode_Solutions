# 41. First Missing Positive

**Difficulty:** 🔴 Hard  
**Topics:** `Array` `Hash Table`  
**Solve Date:** 2026-06-07 05:36:57 UTC  
**LeetCode Link:** [First Missing Positive](https://leetcode.com/problems/first-missing-positive/)

---

## Problem Description

Given an unsorted integer array `nums`. Return the *smallest positive integer* that is *not present* in `nums`.

You must implement an algorithm that runs in `O(n)` time and uses `O(1)` auxiliary space.

 

<strong class="example">Example 1:</strong>

```

**Input:** nums = [1,2,0]
**Output:** 3
**Explanation:** The numbers in the range [1,2] are all in the array.

```

<strong class="example">Example 2:</strong>

```

**Input:** nums = [3,4,-1,1]
**Output:** 2
**Explanation:** 1 is in the array but 2 is missing.

```

<strong class="example">Example 3:</strong>

```

**Input:** nums = [7,8,9,11,12]
**Output:** 1
**Explanation:** The smallest positive integer 1 is missing.

```

 

**Constraints:**

	- `1 <= nums.length <= 10^5`

	- `-2^31 <= nums[i] <= 2^31 - 1`

---

## Submission Details

- **Language:** Java
- **Runtime:** 18 ms (Beats 11.93%)
- **Memory:** 73.7 MB (Beats 30.39%)
- **Submission Date:** 2026-06-07 05:36:57 UTC
