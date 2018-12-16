# DS Trees
- Tree : is a data structure composed of nodes
- Each tree has a root node
- The root node has zero or more child nodes
- Each child node has zero or more child nodes, and so on
- A node is called a “leaf” node if it has no children
Trees vs. Binary Trees


A binary tree is a tree in which each node has up to two children. Not all trees are binary trees. For example, this tree is not a binary tree.
Binary Tree vs Binary Search Tree
A binary search tree is a binary tree in which every node fits a specific ordering property. All left descendents <= n < all right descendents. This must be true for each n.
1- We will first select a root
2- If next values is less than root, then we add it in the left subtree 3- else we go to right
Balanced vs. Unbalanced
It is ​balanced​​ enough to ensure O(log n) times for insert and find and it does not mean the left
and right subtrees are exactly the same size.
Unbalanced​​: can become a singly linked list in worst case o(n) search performance Example: Inserting values 1, 2, 3, 4 into binary tree and binary tree became linked listed. To look for value 4, four comparisons were necessary o(n) search performance
Complete Binary Trees: ​​is a binary tree in which every level of the tree is fully filled, except the last level. To the extent that the last level is filled, it is filled left to right.
 
  Full Binary Tree: ​​in which every node has either zero or two children. That is, no nodes have only one child
 Perfect Binary Trees​​: is that one both full and complete. All leaf nodes will be at the same level and this level has the maximum number of nodes.
 Binary Tree Traversal

 1- In-order Traversal (most common in interviews) ​​it means to visit the left branch, then the current branch and then the right branch
 2- Pre-order Traversal: ​​it means visits the current node before its child nodes (current node, left branch and then right branch)
 3- Post-order Traversal: ​​it means visits (left branch, right branch, and the current node)
 
 Binary Heaps (Min heaps and Max heaps)
1- Min heaps: ​​is a complete binary tree and the root is the min element in the tree (each node is smaller than its children). We have two key operations on a min-heap: insert and extract-min
Insertion​​: When we insert into a min- heap, we always start by inserting the element at the bottom. We insert at the rightmost spot so as to maintain the complete tree property. Then we fix the tree by swapping the new element with its parent, until we find an appropriate spot for the element.
This takes o(log n) time, where n is the number of nodes in the heap.
Extract min element​​: finding the min element of a min-heap is easy as it is always at the top. First, we remove the min element and swap it with the last element in the heap (the bottomost rightmost element). Then, we bubble down this element, swapping it with one of its children until the min-heap property is restored. Do we swap it with the left child or the right child? That depends on their values. There is no inherent ordering between the left and right element, but you will need to take the smaller one in order to maintain the min-heap ordering.
 
  This algorithm will take o(log n) time.
2- ​Max heaps​​: the tree is in descending order (the max element is in the root of the tree).
Tries (Prefix Trees)
