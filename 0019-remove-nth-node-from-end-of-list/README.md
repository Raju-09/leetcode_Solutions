# 19. Remove Nth Node From End of List

**Difficulty:** 🟡 Medium  
**Topics:** `Linked List` `Two Pointers`  
**Solve Date:** 2026-06-23 07:06:21 UTC  
**LeetCode Link:** [Remove Nth Node From End of List](https://leetcode.com/problems/remove-nth-node-from-end-of-list/)

---

## Problem Description

Given the `head` of a linked list, remove the `n^th` node from the end of the list and return its head.

 

<strong class="example">Example 1:</strong>

<img alt="" src="https://assets.leetcode.com/uploads/2020/10/03/remove_ex1.jpg" style="width: 542px; height: 222px;" />
```

**Input:** head = [1,2,3,4,5], n = 2
**Output:** [1,2,3,5]

```

<strong class="example">Example 2:</strong>

```

**Input:** head = [1], n = 1
**Output:** []

```

<strong class="example">Example 3:</strong>

```

**Input:** head = [1,2], n = 1
**Output:** [1]

```

 

**Constraints:**

	- The number of nodes in the list is `sz`.

	- `1 <= sz <= 30`

	- `0 <= Node.val <= 100`

	- `1 <= n <= sz`

 

**Follow up:** Could you do this in one pass?

---

## Submission Details

- **Language:** Java
- **Runtime:** 0 ms (Beats 100.00%)
- **Memory:** 43.5 MB (Beats 39.64%)
- **Submission Date:** 2026-06-23 07:06:21 UTC
