# 1833. Maximum Ice Cream Bars

**Difficulty:** 🟡 Medium  
**Topics:** `Array` `Greedy` `Sorting` `Counting Sort`  
**Solve Date:** 2026-06-21 15:32:59 UTC  
**LeetCode Link:** [Maximum Ice Cream Bars](https://leetcode.com/problems/maximum-ice-cream-bars/)

---

## Problem Description

It is a sweltering summer day, and a boy wants to buy some ice cream bars.

At the store, there are `n` ice cream bars. You are given an array `costs` of length `n`, where `costs[i]` is the price of the `i^th` ice cream bar in coins. The boy initially has `coins` coins to spend, and he wants to buy as many ice cream bars as possible. 

**Note:** The boy can buy the ice cream bars in any order.

Return *the **maximum** number of ice cream bars the boy can buy with *`coins`* coins.*

You must solve the problem by counting sort.

 

<strong class="example">Example 1:</strong>

```

**Input:** costs = [1,3,2,4,1], coins = 7
**Output:** 4
**Explanation: **The boy can buy ice cream bars at indices 0,1,2,4 for a total price of 1 + 3 + 2 + 1 = 7.

```

<strong class="example">Example 2:</strong>

```

**Input:** costs = [10,6,8,7,7,8], coins = 5
**Output:** 0
**Explanation: **The boy cannot afford any of the ice cream bars.

```

<strong class="example">Example 3:</strong>

```

**Input:** costs = [1,6,3,1,2,5], coins = 20
**Output:** 6
**Explanation: **The boy can buy all the ice cream bars for a total price of 1 + 6 + 3 + 1 + 2 + 5 = 18.

```

 

**Constraints:**

	- `costs.length == n`

	- `1 <= n <= 10^5`

	- `1 <= costs[i] <= 10^5`

	- `1 <= coins <= 10^8`

---

## Submission Details

- **Language:** Java
- **Runtime:** 9 ms (Beats 82.14%)
- **Memory:** 81.5 MB (Beats 99.39%)
- **Submission Date:** 2026-06-21 15:32:59 UTC
