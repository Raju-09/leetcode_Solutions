# 1510. Stone Game IV

**Difficulty:** 🔴 Hard  
**Topics:** `Math` `Dynamic Programming` `Minimax` `Game Theory` `Nim Game` `Sprague–Grundy Theorem` `Zero-Sum Game`  
**Solve Date:** 2026-08-10 12:31:46 UTC  
**LeetCode Link:** [Stone Game IV](https://leetcode.com/problems/stone-game-iv/)

---

## Problem Description

Alice and Bob take turns playing a game, with Alice starting first.

Initially, there are `n` stones in a pile. On each player's turn, that player makes a *move* consisting of removing **any** non-zero **square number** of stones in the pile.

Also, if a player cannot make a move, he/she loses the game.

Given a positive integer `n`, return `true` if and only if Alice wins the game otherwise return `false`, assuming both players play optimally.

 

<strong class="example">Example 1:</strong>

```

**Input:** n = 1
**Output:** true
**Explanation: **Alice can remove 1 stone winning the game because Bob doesn't have any moves.
```

<strong class="example">Example 2:</strong>

```

**Input:** n = 2
**Output:** false
**Explanation: **Alice can only remove 1 stone, after that Bob removes the last one winning the game (2 -> 1 -> 0).

```

<strong class="example">Example 3:</strong>

```

**Input:** n = 4
**Output:** true
**Explanation:** n is already a perfect square, Alice can win with one move, removing 4 stones (4 -> 0).

```

 

**Constraints:**

	- `1 <= n <= 10^5`

---

## Submission Details

- **Language:** Java
- **Runtime:** 3 ms (Beats 92.39%)
- **Memory:** 42.3 MB (Beats 62.51%)
- **Submission Date:** 2026-08-10 12:31:46 UTC
