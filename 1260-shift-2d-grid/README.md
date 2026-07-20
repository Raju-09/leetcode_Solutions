# 1260. Shift 2D Grid

**Difficulty:** 🟢 Easy  
**Topics:** `Array` `Matrix` `Simulation`  
**Solve Date:** 2026-07-20 14:54:45 UTC  
**LeetCode Link:** [Shift 2D Grid](https://leetcode.com/problems/shift-2d-grid/)

---

## Problem Description

Given a 2D `grid` of size `m x n` and an integer `k`. You need to shift the `grid` `k` times.

In one shift operation:

	- Element at `grid[i][j]` moves to `grid[i][j + 1]`.

	- Element at `grid[i][n - 1]` moves to `grid[i + 1][0]`.

	- Element at `grid[m - 1][n - 1]` moves to `grid[0][0]`.

Return the *2D grid* after applying shift operation `k` times.

 

<strong class="example">Example 1:</strong>

<img alt="" src="https://assets.leetcode.com/uploads/2019/11/05/e1.png" style="width: 400px; height: 178px;" />
```

**Input:** `grid` = [[1,2,3],[4,5,6],[7,8,9]], k = 1
**Output:** [[9,1,2],[3,4,5],[6,7,8]]

```

<strong class="example">Example 2:</strong>

<img alt="" src="https://assets.leetcode.com/uploads/2019/11/05/e2.png" style="width: 400px; height: 166px;" />
```

**Input:** `grid` = [[3,8,1,9],[19,7,2,5],[4,6,11,10],[12,0,21,13]], k = 4
**Output:** [[12,0,21,13],[3,8,1,9],[19,7,2,5],[4,6,11,10]]

```

<strong class="example">Example 3:</strong>

```

**Input:** `grid` = [[1,2,3],[4,5,6],[7,8,9]], k = 9
**Output:** [[1,2,3],[4,5,6],[7,8,9]]

```

 

**Constraints:**

	- `m == grid.length`

	- `n == grid[i].length`

	- `1 <= m <= 50`

	- `1 <= n <= 50`

	- `-1000 <= grid[i][j] <= 1000`

	- `0 <= k <= 100`

---

## Submission Details

- **Language:** Java
- **Runtime:** 7 ms (Beats 51.82%)
- **Memory:** 47.1 MB (Beats 66.47%)
- **Submission Date:** 2026-07-20 14:54:45 UTC
