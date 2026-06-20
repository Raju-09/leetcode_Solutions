# 176. Second Highest Salary

**Difficulty:** 🟡 Medium  
**Topics:** `Database`  
**Solve Date:** 2026-06-20 11:26:47 UTC  
**LeetCode Link:** [Second Highest Salary](https://leetcode.com/problems/second-highest-salary/)

---

## Problem Description

Table: `Employee`

```

+-------------+------+
| Column Name | Type |
+-------------+------+
| id          | int  |
| salary      | int  |
+-------------+------+
id is the primary key (column with unique values) for this table.
Each row of this table contains information about the salary of an employee.

```

 

Write a solution to find the second highest **distinct** salary from the `Employee` table. If there is no second highest salary, return `null (return None in Pandas)`.

The result format is in the following example.

 

<strong class="example">Example 1:</strong>

```

**Input:** 
Employee table:
+----+--------+
| id | salary |
+----+--------+
| 1  | 100    |
| 2  | 200    |
| 3  | 300    |
+----+--------+
**Output:** 
+---------------------+
| SecondHighestSalary |
+---------------------+
| 200                 |
+---------------------+

```

<strong class="example">Example 2:</strong>

```

**Input:** 
Employee table:
+----+--------+
| id | salary |
+----+--------+
| 1  | 100    |
+----+--------+
**Output:** 
+---------------------+
| SecondHighestSalary |
+---------------------+
| null                |
+---------------------+

```

---

## Submission Details

- **Language:** MySQL
- **Runtime:** 273 ms (Beats 86.62%)
- **Memory:** 0B (Beats 100.00%)
- **Submission Date:** 2026-06-20 11:26:47 UTC
