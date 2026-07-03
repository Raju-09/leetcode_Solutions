# 3620. Network Recovery Pathways

**Difficulty:** 🔴 Hard  
**Topics:** `Array` `Binary Search` `Dynamic Programming` `Graph Theory` `Topological Sort` `Heap (Priority Queue)` `Shortest Path`  
**Solve Date:** 2026-07-03 15:33:18 UTC  
**LeetCode Link:** [Network Recovery Pathways](https://leetcode.com/problems/network-recovery-pathways/)

---

## Problem Description

<p data-end="502" data-start="75">You are given a directed acyclic graph of `n` nodes numbered from 0 to `n − 1`. This is represented by a 2D array <code data-end="201" data-start="194">edges</code> of length<font face="monospace"> `m`</font>, where <code data-end="255" data-start="227">edges[i] = [u_i, v_i, cost_i]</code> indicates a one‑way communication from node <code data-end="304" data-start="300">u_i</code> to node <code data-end="317" data-start="313">v_i</code> with a recovery cost of <code data-end="349" data-start="342">cost_i</code>.</p>

<p data-end="502" data-start="75">Some nodes may be offline. You are given a boolean array <code data-end="416" data-start="408">online</code> where <code data-end="441" data-start="423">online[i] = true</code> means node <code data-end="456" data-start="453">i</code> is online. Nodes 0 and `n − 1` are always online.</p>

<p data-end="547" data-start="504">A path from 0 to `n − 1` is <strong data-end="541" data-start="532">valid</strong> if:</p>

	- All intermediate nodes on the path are online.

	<li data-end="676" data-start="605">The total recovery cost of all edges on the path does not exceed `k`.</li>

<p data-end="771" data-start="653">For each valid path, define its <strong data-end="694" data-start="685">score</strong> as the minimum edge‑cost along that path.</p>

<p data-end="913" data-start="847">Return the **maximum** path score (i.e., the largest **minimum**-edge cost) among all valid paths. If no valid path exists, return -1.</p>

 

<strong class="example">Example 1:</strong>

**Input:** edges = [[0,1,5],[1,3,10],[0,2,3],[2,3,4]], online = [true,true,true,true], k = 10

**Output:** 3

**Explanation:**

<img alt="" src="https://assets.leetcode.com/uploads/2025/06/06/graph-10.png" style="width: 239px; height: 267px;" />

	<li data-end="462" data-start="146">
	<p data-end="206" data-start="148">The graph has two possible routes from node 0 to node 3:</p>

	
		<li data-end="315" data-start="209">
		<p data-end="228" data-start="212">Path `0 → 1 → 3`</p>

		
			<li data-end="315" data-start="234">
			<p data-end="315" data-start="236">Total cost = `5 + 10 = 15`, which exceeds k (`15 > 10`), so this path is invalid.</p>
			</li>
		
		</li>
		<li data-end="462" data-start="318">
		<p data-end="337" data-start="321">Path `0 → 2 → 3`</p>

		
			<li data-end="397" data-start="343">
			<p data-end="397" data-start="345">Total cost = `3 + 4 = 7 <= k`, so this path is valid.</p>
			</li>
			<li data-end="462" data-start="403">
			<p data-end="462" data-start="405">The minimum edge‐cost along this path is `min(3, 4) = 3`.</p>
			</li>
		
		</li>
	
	</li>
	<li data-end="551" data-start="463">
	<p data-end="551" data-start="465">There are no other valid paths. Hence, the maximum among all valid path‐scores is 3.</p>
	</li>

<strong class="example">Example 2:</strong>

**Input:** edges = [[0,1,7],[1,4,5],[0,2,6],[2,3,6],[3,4,2],[2,4,6]], online = [true,true,true,false,true], k = 12

**Output:** 6

**Explanation:**

<img alt="" src="https://assets.leetcode.com/uploads/2025/06/06/graph-11.png" style="width: 343px; height: 194px;" />

	<li data-end="790" data-start="726">
	<p data-end="790" data-start="728">Node 3 is offline, so any path passing through 3 is invalid.</p>
	</li>
	<li data-end="1231" data-start="791">
	<p data-end="837" data-start="793">Consider the remaining routes from 0 to 4:</p>

	
		<li data-end="985" data-start="840">
		<p data-end="859" data-start="843">Path `0 → 1 → 4`</p>

		
			<li data-end="920" data-start="865">
			<p data-end="920" data-start="867">Total cost = `7 + 5 = 12 <= k`, so this path is valid.</p>
			</li>
			<li data-end="985" data-start="926">
			<p data-end="985" data-start="928">The minimum edge‐cost along this path is `min(7, 5) = 5`.</p>
			</li>
		
		</li>
		<li data-end="1083" data-start="988">
		<p data-end="1011" data-start="991">Path `0 → 2 → 3 → 4`</p>

		
			<li data-end="1083" data-start="1017">
			<p data-end="1083" data-start="1019">Node 3 is offline, so this path is invalid regardless of cost.</p>
			</li>
		
		</li>
		<li data-end="1231" data-start="1086">
		<p data-end="1105" data-start="1089">Path `0 → 2 → 4`</p>

		
			<li data-end="1166" data-start="1111">
			<p data-end="1166" data-start="1113">Total cost = `6 + 6 = 12 <= k`, so this path is valid.</p>
			</li>
			<li data-end="1231" data-start="1172">
			<p data-end="1231" data-start="1174">The minimum edge‐cost along this path is `min(6, 6) = 6`.</p>
			</li>
		
		</li>
	
	</li>
	<li data-end="1314" data-is-last-node="" data-start="1232">
	<p data-end="1314" data-is-last-node="" data-start="1234">Among the two valid paths, their scores are 5 and 6. Therefore, the answer is 6.</p>
	</li>

 

**Constraints:**

	<li data-end="42" data-start="20"><code data-end="40" data-start="20">n == online.length</code></li>
	<li data-end="63" data-start="45"><code data-end="61" data-start="45">2 <= n <= 5 * 10^4</code></li>
	<li data-end="102" data-start="66"><code data-end="100" data-start="66">0 <= m == edges.length <= </code>`min(10^5, n * (n - 1) / 2)`</li>
	<li data-end="102" data-start="66"><code data-end="127" data-start="105">edges[i] = [u_i, v_i, cost_i]</code></li>
	<li data-end="151" data-start="132"><code data-end="149" data-start="132">0 <= u_i, v_i < n</code></li>
	<li data-end="166" data-start="154"><code data-end="164" data-start="154">u_i != v_i</code></li>
	<li data-end="191" data-start="169"><code data-end="189" data-start="169">0 <= cost_i <= 10^9</code></li>
	<li data-end="213" data-start="194"><code data-end="211" data-start="194">0 <= k <= 5 * 10^13</code></li>
	<li data-end="309" data-start="216"><code data-end="227" data-start="216">online[i]</code> is either <code data-end="244" data-is-only-node="" data-start="238">true</code> or <code data-end="255" data-start="248">false</code>, and both <code data-end="277" data-start="266">online[0]</code> and <code data-end="295" data-start="282">online[n − 1]</code> are <code data-end="306" data-start="300">true</code>.</li>
	<li data-end="362" data-is-last-node="" data-start="312">The given graph is a directed acyclic graph.</li>

---

## Submission Details

- **Language:** Java
- **Runtime:** 151 ms (Beats 69.58%)
- **Memory:** 173 MB (Beats 81.13%)
- **Submission Date:** 2026-07-03 15:33:18 UTC
