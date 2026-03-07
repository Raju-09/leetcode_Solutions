# 203. Remove Linked List Elements

**Difficulty:** 🟢 Easy  
**Topics:** `Linked List` `Recursion`  
**Solve Date:** 2026-03-07 07:01:01 UTC  
**LeetCode Link:** [Remove Linked List Elements](https://leetcode.com/problems/remove-linked-list-elements/)

---

## Problem Description

Given the `head` of a linked list and an integer `val`, remove all the nodes of the linked list that has `Node.val == val`, and return *the new head*.

 

<strong class="example">Example 1:</strong>

<img alt="" src="https://assets.leetcode.com/uploads/2021/03/06/removelinked-list.jpg" style="width: 500px; height: 142px;" />
```

**Input:** head = [1,2,6,3,4,5,6], val = 6
**Output:** [1,2,3,4,5]

```

<strong class="example">Example 2:</strong>

```

**Input:** head = [], val = 1
**Output:** []

```

<strong class="example">Example 3:</strong>

```

**Input:** head = [7,7,7,7], val = 7
**Output:** []

```

 

**Constraints:**

	- The number of nodes in the list is in the range `[0, 10^4]`.

	- `1 <= Node.val <= 50`

	- `0 <= val <= 50`

---

## Submission Details

- **Language:** Java
- **Runtime:** 0 ms (Beats 100.00%)
- **Memory:** 47.2 MB (Beats 79.02%)
- **Submission Date:** 2026-03-07 07:01:01 UTC
