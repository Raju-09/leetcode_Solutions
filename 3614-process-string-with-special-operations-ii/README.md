# 3614. Process String with Special Operations II

**Difficulty:** 🔴 Hard  
**Topics:** `String` `Simulation`  
**Solve Date:** 2026-06-17 01:02:38 UTC  
**LeetCode Link:** [Process String with Special Operations II](https://leetcode.com/problems/process-string-with-special-operations-ii/)

---

## Problem Description

You are given a string `s` consisting of lowercase English letters and the special characters: `'*'`, `'#'`, and `'%'`.

You are also given an integer `k`.

Build a new string `result` by processing `s` according to the following rules from left to right:

	- If the letter is a **lowercase** English letter append it to `result`.

	- A `'*'` **removes** the last character from `result`, if it exists.

	- A `'#'` **duplicates** the current `result` and **appends** it to itself.

	- A `'%'` **reverses** the current `result`.

Return the `k^th` character of the final string `result`. If `k` is out of the bounds of `result`, return `'.'`.

 

<strong class="example">Example 1:</strong>

**Input:** s = "a#b%*", k = 1

**Output:** "a"

**Explanation:**

<table style="border: 1px solid black;">
	<thead>
		<tr>
			<th style="border: 1px solid black;">`i`</th>
			<th style="border: 1px solid black;">`s[i]`</th>
			<th style="border: 1px solid black;">Operation</th>
			<th style="border: 1px solid black;">Current `result`</th>
		</tr>
	</thead>
	<tbody>
		<tr>
			<td style="border: 1px solid black;">0</td>
			<td style="border: 1px solid black;">`'a'`</td>
			<td style="border: 1px solid black;">Append `'a'`</td>
			<td style="border: 1px solid black;">`"a"`</td>
		</tr>
		<tr>
			<td style="border: 1px solid black;">1</td>
			<td style="border: 1px solid black;">`'#'`</td>
			<td style="border: 1px solid black;">Duplicate `result`</td>
			<td style="border: 1px solid black;">`"aa"`</td>
		</tr>
		<tr>
			<td style="border: 1px solid black;">2</td>
			<td style="border: 1px solid black;">`'b'`</td>
			<td style="border: 1px solid black;">Append `'b'`</td>
			<td style="border: 1px solid black;">`"aab"`</td>
		</tr>
		<tr>
			<td style="border: 1px solid black;">3</td>
			<td style="border: 1px solid black;">`'%'`</td>
			<td style="border: 1px solid black;">Reverse `result`</td>
			<td style="border: 1px solid black;">`"baa"`</td>
		</tr>
		<tr>
			<td style="border: 1px solid black;">4</td>
			<td style="border: 1px solid black;">`'*'`</td>
			<td style="border: 1px solid black;">Remove the last character</td>
			<td style="border: 1px solid black;">`"ba"`</td>
		</tr>
	</tbody>
</table>

The final `result` is `"ba"`. The character at index `k = 1` is `'a'`.

<strong class="example">Example 2:</strong>

**Input:** s = "cd%#*#", k = 3

**Output:** "d"

**Explanation:**

<table style="border: 1px solid black;">
	<thead>
		<tr>
			<th style="border: 1px solid black;">`i`</th>
			<th style="border: 1px solid black;">`s[i]`</th>
			<th style="border: 1px solid black;">Operation</th>
			<th style="border: 1px solid black;">Current `result`</th>
		</tr>
	</thead>
	<tbody>
		<tr>
			<td style="border: 1px solid black;">0</td>
			<td style="border: 1px solid black;">`'c'`</td>
			<td style="border: 1px solid black;">Append `'c'`</td>
			<td style="border: 1px solid black;">`"c"`</td>
		</tr>
		<tr>
			<td style="border: 1px solid black;">1</td>
			<td style="border: 1px solid black;">`'d'`</td>
			<td style="border: 1px solid black;">Append `'d'`</td>
			<td style="border: 1px solid black;">`"cd"`</td>
		</tr>
		<tr>
			<td style="border: 1px solid black;">2</td>
			<td style="border: 1px solid black;">`'%'`</td>
			<td style="border: 1px solid black;">Reverse `result`</td>
			<td style="border: 1px solid black;">`"dc"`</td>
		</tr>
		<tr>
			<td style="border: 1px solid black;">3</td>
			<td style="border: 1px solid black;">`'#'`</td>
			<td style="border: 1px solid black;">Duplicate `result`</td>
			<td style="border: 1px solid black;">`"dcdc"`</td>
		</tr>
		<tr>
			<td style="border: 1px solid black;">4</td>
			<td style="border: 1px solid black;">`'*'`</td>
			<td style="border: 1px solid black;">Remove the last character</td>
			<td style="border: 1px solid black;">`"dcd"`</td>
		</tr>
		<tr>
			<td style="border: 1px solid black;">5</td>
			<td style="border: 1px solid black;">`'#'`</td>
			<td style="border: 1px solid black;">Duplicate `result`</td>
			<td style="border: 1px solid black;">`"dcddcd"`</td>
		</tr>
	</tbody>
</table>

The final `result` is `"dcddcd"`. The character at index `k = 3` is `'d'`.

<strong class="example">Example 3:</strong>

**Input:** s = "z*#", k = 0

**Output:** "."

**Explanation:**

<table style="border: 1px solid black;">
	<thead>
		<tr>
			<th style="border: 1px solid black;">`i`</th>
			<th style="border: 1px solid black;">`s[i]`</th>
			<th style="border: 1px solid black;">Operation</th>
			<th style="border: 1px solid black;">Current `result`</th>
		</tr>
	</thead>
	<tbody>
		<tr>
			<td style="border: 1px solid black;">0</td>
			<td style="border: 1px solid black;">`'z'`</td>
			<td style="border: 1px solid black;">Append `'z'`</td>
			<td style="border: 1px solid black;">`"z"`</td>
		</tr>
		<tr>
			<td style="border: 1px solid black;">1</td>
			<td style="border: 1px solid black;">`'*'`</td>
			<td style="border: 1px solid black;">Remove the last character</td>
			<td style="border: 1px solid black;">`""`</td>
		</tr>
		<tr>
			<td style="border: 1px solid black;">2</td>
			<td style="border: 1px solid black;">`'#'`</td>
			<td style="border: 1px solid black;">Duplicate the string</td>
			<td style="border: 1px solid black;">`""`</td>
		</tr>
	</tbody>
</table>

The final `result` is `""`. Since index `k = 0` is out of bounds, the output is `'.'`.

 

**Constraints:**

	- `1 <= s.length <= 10^5`

	- `s` consists of only lowercase English letters and special characters `'*'`, `'#'`, and `'%'`.

	- `0 <= k <= 10^15`

	- The length of `result` after processing `s` will not exceed `10^15`.

---

## Submission Details

- **Language:** Java
- **Runtime:** 58 ms (Beats 6.25%)
- **Memory:** 47.8 MB (Beats 86.36%)
- **Submission Date:** 2026-06-17 01:02:38 UTC
