# 21. Merge Two Sorted Lists

**Difficulty:** 🟢 Easy  
**Topics:** `Linked List` `Recursion`  
**Solve Date:** 2026-07-18 17:18:25 UTC  
**LeetCode Link:** [Merge Two Sorted Lists](https://leetcode.com/problems/merge-two-sorted-lists/)

---

## Problem Description

You are given the heads of two sorted linked lists `list1` and `list2`.

Merge the two lists into one **sorted** list. The list should be made by splicing together the nodes of the first two lists.

Return *the head of the merged linked list*.

 

<strong class="example">Example 1:</strong>

<img alt="" src="https://assets.leetcode.com/uploads/2020/10/03/merge_ex1.jpg" style="width: 662px; height: 302px;" />
```

**Input:** list1 = [1,2,4], list2 = [1,3,4]
**Output:** [1,1,2,3,4,4]

```

<strong class="example">Example 2:</strong>

```

**Input:** list1 = [], list2 = []
**Output:** []

```

<strong class="example">Example 3:</strong>

```

**Input:** list1 = [], list2 = [0]
**Output:** [0]

```

 

**Constraints:**

	- The number of nodes in both lists is in the range `[0, 50]`.

	- `-100 <= Node.val <= 100`

	- Both `list1` and `list2` are sorted in **non-decreasing** order.

---

## Submission Details

- **Language:** Java
- **Runtime:** 0 ms (Beats 100.00%)
- **Memory:** 44.4 MB (Beats 38.46%)
- **Submission Date:** 2026-07-18 17:18:25 UTC
