# 167. Two Sum II - Input Array Is Sorted

**Difficulty:** 🟡 Medium  
**Topics:** `Array` `Two Pointers` `Binary Search`  
**Solve Date:** 2026-07-03 09:45:22 UTC  
**LeetCode Link:** [Two Sum II - Input Array Is Sorted](https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/)

---

## Problem Description

You are given a **1-indexed** array of integers `numbers` that is already **sorted in non-decreasing order**.

Find **two** numbers such that they add up to a specific `target` number. Let these two numbers be `numbers[index_1]` and `numbers[index_2]` where `1 <= index_1 < index_2 <= numbers.length`.

Return the indices of the two numbers `index_1` and `index_2` as an integer array `[index_1, index_2]` of length 2.

The tests are generated such that there is **exactly one solution**. You **may not** use the same element twice.

Your solution must use only constant extra space.

 

<strong class="example">Example 1:</strong>

```

**Input:** numbers = [<u>2</u>,<u>7</u>,11,15], target = 9
**Output:** [1,2]
**Explanation:** The sum of 2 and 7 is 9. Therefore, index_1 = 1, index_2 = 2. We return [1, 2].

```

<strong class="example">Example 2:</strong>

```

**Input:** numbers = [<u>2</u>,3,<u>4</u>], target = 6
**Output:** [1,3]
**Explanation:** The sum of 2 and 4 is 6. Therefore index_1 = 1, index_2 = 3. We return [1, 3].

```

<strong class="example">Example 3:</strong>

```

**Input:** numbers = [<u>-1</u>,<u>0</u>], target = -1
**Output:** [1,2]
**Explanation:** The sum of -1 and 0 is -1. Therefore index_1 = 1, index_2 = 2. We return [1, 2].

```

 

**Constraints:**

	- `2 <= numbers.length <= 3 * 10^4`

	- `-1000 <= numbers[i] <= 1000`

	- `numbers` is sorted in **non-decreasing order**.

	- `-1000 <= target <= 1000`

	- The tests are generated such that there is **exactly one solution**.

---

## Submission Details

- **Language:** Java
- **Runtime:** 1 ms (Beats 99.91%)
- **Memory:** 48.1 MB (Beats 95.08%)
- **Submission Date:** 2026-07-03 09:45:22 UTC
