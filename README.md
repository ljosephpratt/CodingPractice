# CodingPractice
## Data Structures
* Machine Data Representation
    * Ones, Two's Complement, and Related Arithmetic
    * Words, Pointers, Floating Point
    * Bit Access, Shifting, and Manipulation
* Linked Lists
* Hash Tables (maps or dictionaries)
* Arrays
* Trees
* Stacks
* Queues
* Graphs
* Databases
## Algorithms
### Sorting:
* Bubble Sort (to know why it's bad)
* Insertion Sort
* Merge Sort
* Quick Sort
* Radix style sorts, Counting Sort and Bucket Sort
* Heap Sort
* Bogo and Quantum Sort (=
### Searching:
* Linear Search
* Binary Search
* Depth First Search
* Breadth First Search
### General:
* String Manipulation
* Iteration
* Tree Traversal
* List Traversal
* Hashing Functions
* Concrete implementation of a Hash Table, Tree, List, Stack, Queue, Array, and Set or Collection
* Scheduling Algorithms
* File System Traversal and Manipulation (on the inode or equivalent level).
## Design Patterns
* Modularization
* Factory
* Builder
* Singleton
* Adapter
* Decorator
* Flyweight
* Observer
* Iterator
* State [Machine]
* Model View Controller
* Threading and Parallel Programming Patterns
## Coding Paradigms
* Imperative
* Object Oriented
* Functional
* Declarative
* Static and Dynamic Programming
* Data Markup
## Complexity Theory
* Complexity Spaces
* Computability
* Regular, Context Free, and Universal Turing Machine complete Languages
* Regular Expressions
* Counting and Basic Combinatorics

# Beyond
Be able to identify the appropriate pattern, algorithm, and data structure for a given scenario
Have General knowledge to be able to defend your choice against your peers

## Tips for algorithms and data structures
* Binary Search can only (and should) be used on sorted data.
* Radix style sorts are awesome, but only when you have finite classes of things being sorted.
* Trees are good for almost anything as are Hash Tables. The functionality of a Hash Table can be extrapolated and used to solve many problems at the cost of efficiency.
* Arrays can be used to back most higher level data structures. Sometimes a "data structure" is no more than some clever math for accessing locations in an array.
* The choice of language can be the difference between pulling your hair out over, or sailing through, a problem.
* The ASCII table and a 128 element array form an implicit hash table (=
* Regular expressions can solve a lot of problems, but they can't be used to parse HTML.
* Sometimes the data structure is just as important as the algorithm.

When encountered with a more concrete question such as, "Design a function that counts the number of occurrences of every character in a String", look to the tip about the ASCII table and 128 element arrays forming neat implicit hash tables for the answer.

Pulled mostly from [this StackExchange post](https://softwareengineering.stackexchange.com/questions/155639/which-algorithms-data-structures-should-i-recognize-and-know-by-name/155649#155649).

# General Prep
Find Amazon blogs, YT vids, Haystack something, be awesome at it

## Algorithms "To-Do"
* Know Big-0 and uses cases of array, tree, binary search tree, stack, queue
* Implement Bubblesort, Quicksort, and Mergesort
* Implement linear search, binary search
* Implement ArrayList<>
* Implement HashTable
* Implement a binary search tree
* Balance a binary search tree
* Implement a Linked List
* Implement a Doubly Linked List
* Traverse binary tree breadth first, then depth first
* Traverse post order, pre order, the other order
* Review interview questions
  * FizzBuzz
  * String manipulation

## Advanced Algorithms
* Trie Data Structure
* Map/Reduce

## Object-Oriented Principles
* Know SOLID
* Know 4 OO principles

## Behavioral Questions
#### Practice these...

## Architectural
* Know distributed system design
* Know distributed streaming system design

Learn how to design:
* TinyUrl
* Twitter
* Messaging App

### [Case 1](https://www.youtube.com/watch?v=ZgdS0EUmn70)
Assume successful mobile (Android, iOS) application, user base of 500 million active users, build a logging infrastructure for apps so developers can log any arbitrary data from the app they need, in a way that scales.
Battery, storage, data usage, reasonable api to develop, how to handle writes, converge logs into single log store, server-side vs client-side, where are the edges of your knowledge

#### Notes and thoughts
500 million active users is misleading - what is peak traffic? What user base are we planning for? Are they geographically distributed around the world?
Assume 70% are active every day, about 70% of 70% are active act peak hours. 245 million in a n hour, to seconds is 68,000 concurrent users. Node.js 1000 users = 68 servers.
70,000 people = thru-put? We don't know. But we can make an educated guess... What can people do to generate a log. There's only so many actions per minutes a person can do.
(Assert what is reasonable)
Think about the user. .5 meg is too much data. Choose a reasonable maximum. 10k-15k maximum.

O'Reilly's Java in a Nutshell by David Flanagan (see Resources) says: **"Java manipulates objects 'by reference,' but it passes object references to methods 'by value.'"**