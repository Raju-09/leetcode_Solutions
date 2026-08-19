# 180. Consecutive Numbers

**Difficulty:** 🟡 Medium  
**Topics:** `Database`  
**Solve Date:** 2026-08-19 09:49:22 UTC  
**LeetCode Link:** [Consecutive Numbers](https://leetcode.com/problems/consecutive-numbers/)

---

## Problem Description

Table: `Logs`

```

+-------------+---------+
| Column Name | Type    |
+-------------+---------+
| id          | int     |
| num         | varchar |
+-------------+---------+
In SQL, id is the primary key for this table.
id is an autoincrement column starting from 1.

```

 

Find all numbers that appear at least three times consecutively.

Return the result table in **any order**.

The result format is in the following example.

 

<strong class="example">Example 1:</strong>

```

**Input:** 
Logs table:
+----+-----+
| id | num |
+----+-----+
| 1  | 1   |
| 2  | 1   |
| 3  | 1   |
| 4  | 2   |
| 5  | 1   |
| 6  | 2   |
| 7  | 2   |
+----+-----+
**Output:** 
+-----------------+
| ConsecutiveNums |
+-----------------+
| 1               |
+-----------------+
**Explanation:** 1 is the only number that appears consecutively for at least three times.

```

---

## Submission Details

- **Language:** MySQL
- **Runtime:** 751 ms (Beats 19.00%)
- **Memory:** 0B (Beats 100.00%)
- **Submission Date:** 2026-08-19 09:49:22 UTC
