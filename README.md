# Sequential DSA Learning Roadmap

Welcome to my structured Data Structures and Algorithms learning repository. This roadmap is designed to build problem-solving intuition progressively, moving from foundational math and arrays up to advanced non-linear data structures.

---
# DSA Master Mental Blueprint

A single-glance reference sheet mapping every core algorithm and data structure pattern to its **physical action**, **core invariant**, **complexity**, and **engineering trade-offs**.

---

## 1. Sorting Algorithms

| Algorithm | Physical Action | How It Works / Grows | Time (Best / Worst) | Space | Key Trade-off |
| :--- | :--- | :--- | :--- | :--- | :--- |
| **Bubble Sort** | Swap out-of-order neighbors | Largest values bubble to the **right** end | $O(N)$ / $O(N^2)$ | $O(1)$ | Adaptive (`isSwap`), but heavy on swaps |
| **Selection Sort** | Scan for smallest, swap once | Smallest values lock into the **left** end | $O(N^2)$ / $O(N^2)$ | $O(1)$ | Minimal writes ($O(N)$ swaps), never stops early |
| **Insertion Sort** | Pick up card, shift larger right, drop in | Sorted hand grows **left-to-right** | $O(N)$ / $O(N^2)$ | $O(1)$ | Fastest on tiny or nearly sorted arrays |
| **Merge Sort** | Split in half recursively, zip sorted halves | Bottom-up merging into sorted subarrays | $O(N \log N)$ / $O(N \log N)$ | $O(N)$ | Guaranteed $O(N \log N)$ & stable, needs extra RAM |
| **Quick Sort** | Pick a pivot, partition smaller left / larger right | Pivot locks into exact final index | $O(N \log N)$ / $O(N^2)$ | $O(\log N)$ | Cache-friendly & in-place, bad pivots degrade speed |
| **Cyclic Sort** | Place `nums[i]` at its exact index `nums[i] - 1` | Swaps until current slot holds its rightful value | $O(N)$ / $O(N)$ | $O(1)$ | Only works when values are in range `[1 ... N]` |

---

## 2. Array & Search Patterns

| Pattern / Algorithm | Physical Action | Core Invariant / Trigger | Time | Space | Key Trade-off |
| :--- | :--- | :--- | :--- | :--- | :--- |
| **Two Pointers** | Move `left` and `right` inward or in tandem | Sorted array or palindrome/pair-sum symmetry | $O(N)$ | $O(1)$ | Turns nested $O(N^2)$ loops into a single pass |
| **Sliding Window** | Expand `right` to include, shrink `left` to fix | Contiguous subarray/substring meeting a condition | $O(N)$ | $O(1)$–$O(K)$ | Only works when adding/removing updates state cleanly |
| **Binary Search (Standard)** | Halve search space (`s <= e`) | Sorted input; discard half where target cannot live | $O(\log N)$ | $O(1)$ | Requires random access ($O(1)$ indexing) |
| **Binary Search on Answer** | Guess answer `mid` in `[min ... max]`, validate | Monotonic feasibility (`false, false, true, true`) | $O(N \log M)$ | $O(1)$ | Searches output range instead of input array |
| **Prefix Sum** | Precompute running totals (`pre[i] = pre[i-1] + arr[i]`) | Range sum `[L..R]` becomes `pre[R] - pre[L-1]` | $O(N)$ build / $O(1)$ query | $O(N)$ | Trades $O(N)$ memory for instant range queries |

---

## 3. Linear Data Structures (Linked Lists, Stacks & Queues)

| Algorithm / Pattern | Physical Action | Core Invariant / Trigger | Time | Space | Key Trade-off |
| :--- | :--- | :--- | :--- | :--- | :--- |
| **Fast & Slow Pointers** | Move `slow` 1 step, `fast` 2 steps | Cycle detection or finding exact middle node | $O(N)$ | $O(1)$ | Finds mid/loops without counting length first |
| **In-Place List Reversal** | Flip `curr.next = prev` while advancing `prev, curr, next` | Reverses pointer direction without allocating nodes | $O(N)$ | $O(1)$ | Zero memory overhead, easy to drop a reference |
| **Monotonic Stack** | Pop elements smaller/larger than `curr` before pushing | Stack stays strictly increasing or decreasing | $O(N)$ | $O(N)$ | Solves "Next Greater / Smaller Element" in one pass |
| **BFS Queue (Level-Order)** | Push neighbors to back, process from front (FIFO) | Visits nodes strictly layer-by-layer by distance | $O(V + E)$ | $O(W)$ | Guarantees shortest path in unweighted graphs |

---

## 4. Trees, Heaps & Graphs

| Algorithm / Pattern | Physical Action | Core Invariant / Trigger | Time | Space | Key Trade-off |
| :--- | :--- | :--- | :--- | :--- | :--- |
| **DFS (Pre / In / Post)** | Dive deep down one branch before backtracking (LIFO) | Recursion stack or explicit stack tracks path | $O(V + E)$ | $O(H)$ | Low memory on deep/narrow trees; doesn't find shortest path |
| **Heap / Priority Queue** | Bubble smallest/largest item to root in a tree array | Root is always the extreme (`min` or `max`) | $O(N \log K)$ | $O(K)$ | Ideal for "Top K" or streaming median problems |
| **Dijkstra's Algorithm** | Greedily expand closest unvisited node via Min-Heap | Shortest distance to popped node is finalized | $O((V + E) \log V)$ | $O(V)$ | Finds shortest weighted path; fails on negative weights |
| **Topological Sort** | Peel off nodes with `in-degree == 0` in a DAG | Every dependency appears before its dependent | $O(V + E)$ | $O(V)$ | Detects cycles and resolves build/course dependencies |

---

## 5. Recursion, Backtracking & Dynamic Programming

| Pattern | Physical Action | Core Invariant / Trigger | Time | Space | Key Trade-off |
| :--- | :--- | :--- | :--- | :--- | :--- |
| **Backtracking** | Choose $\rightarrow$ Explore $\rightarrow$ **Undo choice** | Explores decision tree, pruning invalid branches | $O(2^N)$ or $O(N!)$ | $O(N)$ | Finds all valid combinations/paths; exponential cost |
| **DP (Memoization)** | Top-down recursion + cache results in a table | Overlapping subproblems computed only once | $O(\text{States} \times \text{Transitions})$ | $O(\text{States})$ | Intuitive to write from recursion; uses call stack |
| **DP (Tabulation)** | Bottom-up loop filling a 1D/2D array from base cases | Iterative state transition (`dp[i]` from `dp[i-1]`) | $O(\text{States} \times \text{Transitions})$ | $O(1)$–$O(N)$ | Eliminates recursion overhead; allows space optimization |

---

## Roadmap Overview

### Phase 1: Basic Arrays & Math
* **Core Focus:** Iteration, element manipulation, and fundamental digit/math logic.
* **Key Concepts:** Traversals, in-place modifications, basic number theory, and arithmetic logic.

### Phase 2: Two-Pointer & Sliding Window
* **Core Focus:** Optimizing linear scans, managing sub-ranges, and partitioning techniques.
* **Key Concepts:** Opposite-direction pointers, fast-slow pointers, fixed and dynamic sliding windows (e.g., the "Move Zeros" pattern).

### Phase 3: Prefix Sum & Kadane's Algorithm
* **Core Focus:** Running calculations and efficient subarray pattern recognition.
* **Key Concepts:** Cumulative sum arrays, range sum queries, and maximum subarray sum optimization.

### Phase 4: Sorting & Binary Search
* **Core Focus:** Finding elements efficiently and leveraging sorted data properties.
* **Key Concepts:** Standard sorting algorithms, binary search variants (lower bound, upper bound, search on answer space).

### Phase 5: Strings & Basic Hashing
* **Core Focus:** Frequency mapping and character-level manipulation.
* **Key Concepts:** Hash maps/sets, anagrams, sliding window with character constraints, and string parsing.

### Phase 6: Recursion & Backtracking
* **Core Focus:** Building the foundation for exhaustive search and advanced problem-solving.
* **Key Concepts:** Call stacks, base cases, choice-constraint-goal state spaces, permutations, and combinations.

### Phase 7: Linear Data Structures
* **Core Focus:** Dynamic sequential data management.
* **Key Concepts:** Singly/Doubly Linked Lists, Stacks (LIFO applications), and Queues (FIFO/Deque patterns).

### Phase 8: Non-Linear Data Structures
* **Core Focus:** Hierarchical and network-based data modeling.
* **Key Concepts:** Binary Trees, Binary Search Trees, Tree Traversals (DFS/BFS), Graphs (Adjacency lists, traversal algorithms, and shortest paths).

---

## Repository Structure
Each phase folder contains problems, notes, and implementations as I progress through the curriculum.
