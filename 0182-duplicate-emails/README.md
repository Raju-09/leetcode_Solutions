# 182. Duplicate Emails

**Difficulty:** 🟢 Easy  
**Topics:** `Database`  
**Solve Date:** 2026-08-07 07:36:48 UTC  
**LeetCode Link:** [Duplicate Emails](https://leetcode.com/problems/duplicate-emails/)

---

## Problem Description

Table: `Person`

```

+-------------+---------+
| Column Name | Type    |
+-------------+---------+
| id          | int     |
| email       | varchar |
+-------------+---------+
id is the primary key (column with unique values) for this table.
Each row of this table contains an email. The emails will not contain uppercase letters.

```

 

Write a solution to report all the duplicate emails. Note that it's guaranteed that the email field is not NULL.

Return the result table in **any order**.

The result format is in the following example.

 

<strong class="example">Example 1:</strong>

```

**Input:** 
Person table:
+----+---------+
| id | email   |
+----+---------+
| 1  | a@b.com |
| 2  | c@d.com |
| 3  | a@b.com |
+----+---------+
**Output:** 
+---------+
| Email   |
+---------+
| a@b.com |
+---------+
**Explanation:** a@b.com is repeated two times.

```

---

## Submission Details

- **Language:** MySQL
- **Runtime:** 367 ms (Beats 91.27%)
- **Memory:** 0B (Beats 100.00%)
- **Submission Date:** 2026-08-07 07:36:48 UTC
