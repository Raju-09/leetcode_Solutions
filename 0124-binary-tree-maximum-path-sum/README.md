# 124. Binary Tree Maximum Path Sum

**Difficulty:** 🔴 Hard  
**Topics:** `Dynamic Programming` `Tree` `Depth-First Search` `Binary Tree` `DP on Trees`  
**Solve Date:** 2026-07-22 06:26:09 UTC  
**LeetCode Link:** [Binary Tree Maximum Path Sum](https://leetcode.com/problems/binary-tree-maximum-path-sum/)

---

## Problem Description

A **path** in a binary tree is a sequence of nodes where each pair of adjacent nodes in the sequence has an edge connecting them. A node can only appear in the sequence **at most once**. Note that the path does not need to pass through the root.

The **path sum** of a path is the sum of the node's values in the path.

Given the `root` of a binary tree, return *the maximum **path sum** of any **non-empty** path*.

 

<strong class="example">Example 1:</strong>

<img alt="" src="https://assets.leetcode.com/uploads/2020/10/13/exx1.jpg" style="width: 322px; height: 182px;" />
```

**Input:** root = [1,2,3]
**Output:** 6
**Explanation:** The optimal path is 2 -> 1 -> 3 with a path sum of 2 + 1 + 3 = 6.

```

<strong class="example">Example 2:</strong>

<img alt="" src="https://assets.leetcode.com/uploads/2020/10/13/exx2.jpg" />
```

**Input:** root = [-10,9,20,null,null,15,7]
**Output:** 42
**Explanation:** The optimal path is 15 -> 20 -> 7 with a path sum of 15 + 20 + 7 = 42.

```

 

**Constraints:**

	- The number of nodes in the tree is in the range `[1, 3 * 10^4]`.

	- `-1000 <= Node.val <= 1000`

---

## Submission Details

- **Language:** Java
- **Runtime:** 0 ms (Beats 100.00%)
- **Memory:** 46.5 MB (Beats 75.57%)
- **Submission Date:** 2026-07-22 06:26:09 UTC
