# 199. Binary Tree Right Side View

**Difficulty:** 🟡 Medium  
**Topics:** `Tree` `Depth-First Search` `Breadth-First Search` `Binary Tree`  
**Solve Date:** 2026-08-10 00:42:26 UTC  
**LeetCode Link:** [Binary Tree Right Side View](https://leetcode.com/problems/binary-tree-right-side-view/)

---

## Problem Description

Given the `root` of a binary tree, imagine yourself standing on the **right side** of it, return *the values of the nodes you can see ordered from top to bottom*.

 

<strong class="example">Example 1:</strong>

**Input:** root = [1,2,3,null,5,null,4]

**Output:** [1,3,4]

**Explanation:**

<img alt="" src="https://assets.leetcode.com/uploads/2024/11/24/tmpd5jn43fs-1.png" style="width: 400px; height: 207px;" />

<strong class="example">Example 2:</strong>

**Input:** root = [1,2,3,4,null,null,null,5]

**Output:** [1,3,4,5]

**Explanation:**

<img alt="" src="https://assets.leetcode.com/uploads/2024/11/24/tmpkpe40xeh-1.png" style="width: 400px; height: 214px;" />

<strong class="example">Example 3:</strong>

**Input:** root = [1,null,3]

**Output:** [1,3]

<strong class="example">Example 4:</strong>

**Input:** root = []

**Output:** []

 

**Constraints:**

	- The number of nodes in the tree is in the range `[0, 100]`.

	- `-100 <= Node.val <= 100`

---

## Submission Details

- **Language:** Java
- **Runtime:** 1 ms (Beats 72.17%)
- **Memory:** 43.5 MB (Beats 83.28%)
- **Submission Date:** 2026-08-10 00:42:26 UTC
