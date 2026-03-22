# 4. Median of Two Sorted Arrays

**Difficulty:** 🔴 Hard  
**Topics:** `Array` `Binary Search` `Divide and Conquer`  
**Solve Date:** 2026-03-22 17:00:26 UTC  
**LeetCode Link:** [Median of Two Sorted Arrays](https://leetcode.com/problems/median-of-two-sorted-arrays/)

---

## Problem Description

Given two sorted arrays `nums1` and `nums2` of size `m` and `n` respectively, return **the median** of the two sorted arrays.

The overall run time complexity should be `O(log (m+n))`.

 

<strong class="example">Example 1:</strong>

```

**Input:** nums1 = [1,3], nums2 = [2]
**Output:** 2.00000
**Explanation:** merged array = [1,2,3] and median is 2.

```

<strong class="example">Example 2:</strong>

```

**Input:** nums1 = [1,2], nums2 = [3,4]
**Output:** 2.50000
**Explanation:** merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5.

```

 

**Constraints:**

	- `nums1.length == m`

	- `nums2.length == n`

	- `0 <= m <= 1000`

	- `0 <= n <= 1000`

	- `1 <= m + n <= 2000`

	- `-10^6 <= nums1[i], nums2[i] <= 10^6`

---

## Submission Details

- **Language:** Java
- **Runtime:** 1 ms (Beats 100.00%)
- **Memory:** 48.9 MB (Beats 51.87%)
- **Submission Date:** 2026-03-22 17:00:26 UTC
