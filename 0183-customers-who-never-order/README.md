# 183. Customers Who Never Order

**Difficulty:** 🟢 Easy  
**Topics:** `Database`  
**Solve Date:** 2026-08-07 08:25:44 UTC  
**LeetCode Link:** [Customers Who Never Order](https://leetcode.com/problems/customers-who-never-order/)

---

## Problem Description

Table: `Customers`

```

+-------------+---------+
| Column Name | Type    |
+-------------+---------+
| id          | int     |
| name        | varchar |
+-------------+---------+
id is the primary key (column with unique values) for this table.
Each row of this table indicates the ID and name of a customer.

```

 

Table: `Orders`

```

+-------------+------+
| Column Name | Type |
+-------------+------+
| id          | int  |
| customerId  | int  |
+-------------+------+
id is the primary key (column with unique values) for this table.
customerId is a foreign key (reference columns) of the ID from the Customers table.
Each row of this table indicates the ID of an order and the ID of the customer who ordered it.

```

 

Write a solution to find all customers who never order anything.

Return the result table in **any order**.

The result format is in the following example.

 

<strong class="example">Example 1:</strong>

```

**Input:** 
Customers table:
+----+-------+
| id | name  |
+----+-------+
| 1  | Joe   |
| 2  | Henry |
| 3  | Sam   |
| 4  | Max   |
+----+-------+
Orders table:
+----+------------+
| id | customerId |
+----+------------+
| 1  | 3          |
| 2  | 1          |
+----+------------+
**Output:** 
+-----------+
| Customers |
+-----------+
| Henry     |
| Max       |
+-----------+

```

---

## Submission Details

- **Language:** MySQL
- **Runtime:** 615 ms (Beats 56.79%)
- **Memory:** 0B (Beats 100.00%)
- **Submission Date:** 2026-08-07 08:25:44 UTC
