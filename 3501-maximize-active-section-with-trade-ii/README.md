# 3501. Maximize Active Section with Trade II

**Difficulty:** 🔴 Hard  
**Topics:** `Array` `String` `Binary Search` `Segment Tree`  
**Solve Date:** 2026-07-22 16:17:39 UTC  
**LeetCode Link:** [Maximize Active Section with Trade II](https://leetcode.com/problems/maximize-active-section-with-trade-ii/)

---

## Problem Description

You are given a binary string `s` of length `n`, where:

	- `'1'` represents an **active** section.

	- `'0'` represents an **inactive** section.

You can perform **at most one trade** to maximize the number of active sections in `s`. In a trade, you:

	- Convert a contiguous block of `'1'`s that is surrounded by `'0'`s to all `'0'`s.

	- Afterward, convert a contiguous block of `'0'`s that is surrounded by `'1'`s to all `'1'`s.

Additionally, you are given a **2D array** `queries`, where `queries[i] = [l_i, r_i]` represents a substring `s[l_i...r_i]`.

For each query, determine the **maximum** possible number of active sections in `s` after making the optimal trade on the substring `s[l_i...r_i]`.

Return an array `answer`, where `answer[i]` is the result for `queries[i]`.

**Note**

	- For each query, treat `s[l_i...r_i]` as if it is **augmented** with a `'1'` at both ends, forming `t = '1' + s[l_i...r_i] + '1'`. The augmented `'1'`s **do not** contribute to the final count.

	- The queries are independent of each other.

 

<strong class="example">Example 1:</strong>

**Input:** s = "01", queries = [[0,1]]

**Output:** [1]

**Explanation:**

Because there is no block of `'1'`s surrounded by `'0'`s, no valid trade is possible. The maximum number of active sections is 1.

<strong class="example">Example 2:</strong>

**Input:** s = "0100", queries = [[0,3],[0,2],[1,3],[2,3]]

**Output:** [4,3,1,1]

**Explanation:**

	- 
	Query `[0, 3]` → Substring `"0100"` → Augmented to `"101001"`<br />
	Choose `"0100"`, convert `"0100"` → `"0000"` → `"1111"`.<br />
	The final string without augmentation is `"1111"`. The maximum number of active sections is 4.

	

	- 
	Query `[0, 2]` → Substring `"010"` → Augmented to `"10101"`<br />
	Choose `"010"`, convert `"010"` → `"000"` → `"111"`.<br />
	The final string without augmentation is `"1110"`. The maximum number of active sections is 3.

	

	- 
	Query `[1, 3]` → Substring `"100"` → Augmented to `"11001"`<br />
	Because there is no block of `'1'`s surrounded by `'0'`s, no valid trade is possible. The maximum number of active sections is 1.

	

	- 
	Query `[2, 3]` → Substring `"00"` → Augmented to `"1001"`<br />
	Because there is no block of `'1'`s surrounded by `'0'`s, no valid trade is possible. The maximum number of active sections is 1.

	

<strong class="example">Example 3:</strong>

**Input:** s = "1000100", queries = [[1,5],[0,6],[0,4]]

**Output:** [6,7,2]

**Explanation:**

	<li data-end="383" data-start="217">
	<p data-end="383" data-start="219">Query `[1, 5]` → Substring <code data-end="255" data-start="246">"00010"</code> → Augmented to <code data-end="282" data-start="271">"1000101"</code><br data-end="285" data-start="282" />
	Choose <code data-end="303" data-start="294">"00010"</code>, convert <code data-end="322" data-start="313">"00010"</code> → <code data-end="322" data-start="313">"00000"</code> → <code data-end="334" data-start="325">"11111"</code>.<br />
	The final string without augmentation is <code data-end="404" data-start="396">"1111110"</code>. The maximum number of active sections is 6.</p>
	</li>
	<li data-end="561" data-start="385">
	<p data-end="561" data-start="387">Query `[0, 6]` → Substring <code data-end="425" data-start="414">"1000100"</code> → Augmented to <code data-end="454" data-start="441">"110001001"</code><br data-end="457" data-start="454" />
	Choose <code data-end="477" data-start="466">"000100"</code>, convert <code data-end="498" data-start="487">"000100"</code> → <code data-end="498" data-start="487">"000000"</code> → <code data-end="512" data-start="501">"111111"</code>.<br />
	The final string without augmentation is <code data-end="404" data-start="396">"1111111"</code>. The maximum number of active sections is 7.</p>
	</li>
	<li data-end="741" data-start="563">
	<p data-end="741" data-start="565">Query `[0, 4]` → Substring <code data-end="601" data-start="592">"10001"</code> → Augmented to <code data-end="627" data-start="617">"1100011"</code><br data-end="630" data-start="627" />
	Because there is no block of `'1'`s surrounded by `'0'`s, no valid trade is possible. The maximum number of active sections is 2.</p>
	</li>

<strong class="example">Example 4:</strong>

**Input:** s = "01010", queries = [[0,3],[1,4],[1,3]]

**Output:** [4,4,2]

**Explanation:**

	- 
	Query `[0, 3]` → Substring `"0101"` → Augmented to `"101011"`<br />
	Choose `"010"`, convert `"010"` → `"000"` → `"111"`.<br />
	The final string without augmentation is `"11110"`. The maximum number of active sections is 4.

	

	- 
	Query `[1, 4]` → Substring `"1010"` → Augmented to `"110101"`<br />
	Choose `"010"`, convert `"010"` → `"000"` → `"111"`.<br />
	The final string without augmentation is `"01111"`. The maximum number of active sections is 4.

	

	- 
	Query `[1, 3]` → Substring `"101"` → Augmented to `"11011"`<br />
	Because there is no block of `'1'`s surrounded by `'0'`s, no valid trade is possible. The maximum number of active sections is 2.

	

 

**Constraints:**

	- `1 <= n == s.length <= 10^5`

	- `1 <= queries.length <= 10^5`

	- `s[i]` is either `'0'` or `'1'`.

	- `queries[i] = [l_i, r_i]`

	- `0 <= l_i <= r_i < n`

---

## Submission Details

- **Language:** Java
- **Runtime:** 60 ms (Beats 81.98%)
- **Memory:** 232.6 MB (Beats 65.68%)
- **Submission Date:** 2026-07-22 16:17:39 UTC
