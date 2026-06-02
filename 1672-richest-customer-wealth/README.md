# 1672. Richest Customer Wealth

**Difficulty:** 🟢 Easy  
**Topics:** `Array` `Matrix`  
**Solve Date:** 2026-06-02 17:10:29 UTC  
**LeetCode Link:** [Richest Customer Wealth](https://leetcode.com/problems/richest-customer-wealth/)

---

## Problem Description

You are given an `m x n` integer grid `accounts` where `accounts[i][j]` is the amount of money the `i​​​​​^​​​​​​th​​​​` customer has in the `j​​​​​^​​​​​​th`​​​​ bank. Return* the **wealth** that the richest customer has.*

A customer's **wealth** is the amount of money they have in all their bank accounts. The richest customer is the customer that has the maximum **wealth**.

 

<strong class="example">Example 1:</strong>

```

**Input:** accounts = [[1,2,3],[3,2,1]]
**Output:** 6
**Explanation****:**
<code>1st customer has wealth = 1 + 2 + 3 = 6
</code><code>2nd customer has wealth = 3 + 2 + 1 = 6
</code>Both customers are considered the richest with a wealth of 6 each, so return 6.

```

<strong class="example">Example 2:</strong>

```

**Input:** accounts = [[1,5],[7,3],[3,5]]
**Output:** 10
**Explanation**: 
1st customer has wealth = 6
2nd customer has wealth = 10 
3rd customer has wealth = 8
The 2nd customer is the richest with a wealth of 10.
```

<strong class="example">Example 3:</strong>

```

**Input:** accounts = [[2,8,7],[7,1,3],[1,9,5]]
**Output:** 17

```

 

**Constraints:**

	- `m == accounts.length`

	- `n == accounts[i].length`

	- `1 <= m, n <= 50`

	- `1 <= accounts[i][j] <= 100`

---

## Submission Details

- **Language:** Java
- **Runtime:** 0 ms (Beats 100.00%)
- **Memory:** 44.8 MB (Beats 19.21%)
- **Submission Date:** 2026-06-02 17:10:29 UTC
