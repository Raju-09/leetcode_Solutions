# 2. Add Two Numbers

**Difficulty:** 🟡 Medium  
**Topics:** `Linked List` `Math` `Recursion`  
**Solve Date:** 2026-03-19 07:43:06 UTC  
**LeetCode Link:** [Add Two Numbers](https://leetcode.com/problems/add-two-numbers/)

---

## Problem Description

You are given two **non-empty** linked lists representing two non-negative integers. The digits are stored in **reverse order**, and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.

You may assume the two numbers do not contain any leading zero, except the number 0 itself.

 

<strong class="example">Example 1:</strong>

<img alt="" src="https://assets.leetcode.com/uploads/2020/10/02/addtwonumber1.jpg" style="width: 483px; height: 342px;" />
```

**Input:** l1 = [2,4,3], l2 = [5,6,4]
**Output:** [7,0,8]
**Explanation:** 342 + 465 = 807.

```

<strong class="example">Example 2:</strong>

```

**Input:** l1 = [0], l2 = [0]
**Output:** [0]

```

<strong class="example">Example 3:</strong>

```

**Input:** l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
**Output:** [8,9,9,9,0,0,0,1]

```

 

**Constraints:**

	- The number of nodes in each linked list is in the range `[1, 100]`.

	- `0 <= Node.val <= 9`

	- It is guaranteed that the list represents a number that does not have leading zeros.

---

## Submission Details

- **Language:** Java
- **Runtime:** 1 ms (Beats 100.00%)
- **Memory:** 46.6 MB (Beats 38.20%)
- **Submission Date:** 2026-03-19 07:43:06 UTC
