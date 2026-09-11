# Laboratory Activity: Recursion

## Brief Description

This program implements a recursive binary search algorithm in Java. It accepts the number of elements, the elements of an array, and a target value from the user. The program searches for the target using recursive binary search and displays its index if it is found or -1 if it is not found.

The program also displays the values of low, high, and the target during every recursive call to show how the search interval becomes smaller.

The array must be arranged in ascending order before performing binary search.

## Programming Language

Java

## Instructions for Compiling and Running

1. Make sure Java/JDK is installed.
2. Open a command prompt or terminal in the folder containing Binary_Search.java.
3. Compile the program using:

```text
javac Binary_Search.java
Run the program using:
java Binary_Search
Enter the number of elements, the array elements in ascending order, and the target value.
Sample Input
Number of elements: 5
Enter the elements in ascending order:
10 20 30 40 50
Target: 40
Sample Output
binarySearch(0, 4, 40)
binarySearch(3, 4, 40)
Target found.
Index: 3
Unsuccessful Search
Sample Input
Number of elements: 5
Enter the elements in ascending order:
10 20 30 40 50
Target: 35
Sample Output
binarySearch(0, 4, 35)
binarySearch(0, 1, 35)
binarySearch(1, 1, 35)
binarySearch(2, 1, 35)
Target not found.
Index: -1
AI Disclosure

ChatGPT by OpenAI, GPT-5.6 Luna, was used to assist with understanding the recursive binary search algorithm, explaining the program, preparing the recursion trace, and providing programming guidance. The student reviewed, tested, and verified the submitted program and is responsible for understanding and explaining the source code.
