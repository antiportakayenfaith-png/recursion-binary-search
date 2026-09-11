# Laboratory Activity: Recursion

## Brief Description

This program implements a recursive binary search algorithm in Java. It accepts the number of elements in the array, the elements of the array, and the target value from the user.

The program performs a recursive binary search and displays the array index of the target if it is found. If the target is not found, the program displays -1.

The program also displays the values of low, high, and target during every recursive call to show how the search interval becomes smaller.

Binary search depends on a sorted sequence, so the array must be arranged in ascending order before the search is performed.

## Programming Language

Java

## Instructions for Compiling and Running

1. Make sure Java/JDK is installed.
2. Open a command prompt or terminal in the folder containing Binary_Search.java.
3. Compile the program using:

javac Binary_Search.java

4. Run the program using:

java Binary_Search

5. Enter the number of elements.
6. Enter the elements of the array in ascending order.
7. Enter the target value.
8. The program will display the recursive search trace and the index of the target.

## Sample Input

Number of elements: 5

Enter the elements in ascending order:

10 20 30 40 50

Target: 40

## Sample Output

binarySearch(0, 4, 40)

binarySearch(3, 4, 40)

Target found.

Index: 3

## Unsuccessful Search

### Sample Input

Number of elements: 5

Enter the elements in ascending order:

10 20 30 40 50

Target: 35

### Sample Output

binarySearch(0, 4, 35)

binarySearch(0, 1, 35)

binarySearch(1, 1, 35)

binarySearch(2, 1, 35)

Target not found.

Index: -1

## AI Disclosure

ChatGPT by OpenAI, GPT-5.6 Luna, was used to assist with understanding the recursive binary search algorithm, explaining the program, preparing the recursion trace, and providing programming guidance. The student reviewed, tested, and verified the submitted program and is responsible for understanding and explaining the source code.
