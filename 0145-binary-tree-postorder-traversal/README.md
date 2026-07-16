# 145. Binary Tree Postorder Traversal

**Difficulty:** 🟢 Easy  
**Topics:** `Stack` `Tree` `Depth-First Search` `Binary Tree`  
**Solve Date:** 2026-07-16 11:49:50 UTC  
**LeetCode Link:** [Binary Tree Postorder Traversal](https://leetcode.com/problems/binary-tree-postorder-traversal/)

---

## Problem Description

Given the `root` of a binary tree, return *the postorder traversal of its nodes' values*.

 

<strong class="example">Example 1:</strong>

**Input:** root = [1,null,2,3]

**Output:** [3,2,1]

**Explanation:**

<img alt="" src="https://assets.leetcode.com/uploads/2024/08/29/screenshot-2024-08-29-202743.png" style="width: 200px; height: 264px;" />

<strong class="example">Example 2:</strong>

**Input:** root = [1,2,3,4,5,null,8,null,null,6,7,9]

**Output:** [4,6,7,5,2,9,8,3,1]

**Explanation:**

<img alt="" src="https://assets.leetcode.com/uploads/2024/08/29/tree_2.png" style="width: 350px; height: 286px;" />

<strong class="example">Example 3:</strong>

**Input:** root = []

**Output:** []

<strong class="example">Example 4:</strong>

**Input:** root = [1]

**Output:** [1]

 

**Constraints:**

	- The number of the nodes in the tree is in the range `[0, 100]`.

	- `-100 <= Node.val <= 100`

 

**Follow up:** Recursive solution is trivial, could you do it iteratively?

---

## Submission Details

- **Language:** Java
- **Runtime:** 0 ms (Beats 100.00%)
- **Memory:** 43.4 MB (Beats 16.07%)
- **Submission Date:** 2026-07-16 11:49:50 UTC
