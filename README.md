# Java Data Structures Implementation

This project contains implementations of common data structures in Java. Each data structure is implemented in a separate file with a `main` method demonstrating its functionality.

## Implemented Data Structures

The following data structures are included in this repository:

1.  **Singly Linked List** (`SinglyLinkedList.java`)
    *   Basic operations: Insert (beginning, end), Delete (by value), Display.
2.  **Doubly Linked List** (`DoublyLinkedList.java`)
    *   Bidirectional nodes, forward and backward traversal.
3.  **Stack** (`StackImpl.java`)
    *   LIFO structure implemented using a Linked List.
4.  **Queue** (`QueueImpl.java`)
    *   FIFO structure implemented using a Linked List.
5.  **Binary Search Tree** (`BinarySearchTree.java`)
    *   Insertion, Search, and Traversals (Inorder, Preorder, Postorder).
6.  **Hash Map** (`CustomHashMap.java`)
    *   Key-Value storage using chaining for collision resolution.
7.  **Graph** (`Graph.java`)
    *   Adjacency List representation with BFS and DFS traversals.
8.  **Min Heap** (`MinHeap.java`)
    *   Array-based binary heap implementation.

## Usage

Each file is a self-contained Java program. You can compile and run them individually.

### Prerequisites
*   Java Development Kit (JDK) installed.

### How to Run

To run any of the data structures, use the standard `javac` and `java` commands.

**Example: Singly Linked List**
```bash
javac SinglyLinkedList.java
java SinglyLinkedList
```

**Example: Binary Search Tree**
```bash
javac BinarySearchTree.java
java BinarySearchTree
```

**Example: Graph**
```bash
javac Graph.java
java Graph
```
