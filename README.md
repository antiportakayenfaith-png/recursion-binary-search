# Laboratory Activity: Recursion

## Brief Description

This program implements a recursive binary search algorithm in Java. It accepts the number of elements in the array, the elements of the array, and a target value from the user.

The program automatically sorts the entered array in ascending order before performing the recursive binary search. It displays the sorted array, the values of low, high, and mid during every recursive call, and the array index of the target if it is found. If the target is not found, the program displays -1.

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
6. Enter each element of the array when prompted.
7. The program automatically sorts the array in ascending order.
8. Enter the target value.
9. The program displays the sorted array, the recursive search trace, and the index of the target.

## Sample Input

Enter number of elements: 5
Element 1: 10
Element 2: 20
Element 3: 30
Element 4: 40
Element 5: 50
Target: 40

## Sample Output

Sorted Array: [10, 20, 30, 40, 50]

binarySearch(0, 4, 40)
low = 0, high = 4, mid = 2
binarySearch(3, 4, 40)
low = 3, high = 4, mid = 3

Target found.
Index: 3

## Unsuccessful Search

### Sample Input

Enter number of elements: 5
Element 1: 10
Element 2: 20
Element 3: 30
Element 4: 40
Element 5: 50
Target: 35

### Sample Output

Sorted Array: [10, 20, 30, 40, 50]

binarySearch(0, 4, 35)
low = 0, high = 4, mid = 2
binarySearch(0, 1, 35)
low = 0, high = 1, mid = 0
binarySearch(1, 1, 35)
low = 1, high = 1, mid = 1
binarySearch(2, 1, 35)

Target not found.
Index: -1

## Unsorted Array Example

### Sample Input

Enter number of elements: 7
Element 1: 40
Element 2: 10
Element 3: 70
Element 4: 20
Element 5: 50
Element 6: 30
Element 7: 60
Target: 50

### Sample Output

Sorted Array: [10, 20, 30, 40, 50, 60, 70]

binarySearch(0, 6, 50)
low = 0, high = 6, mid = 3
binarySearch(4, 6, 50)
low = 4, high = 6, mid = 5
binarySearch(4, 4, 50)
low = 4, high = 4, mid = 4

Target found.
Index: 4

## AI Disclosure

ChatGPT by OpenAI, GPT-5.6 Luna, was used to assist with understanding the recursive binary search algorithm, explaining the program, preparing the recursion trace, and providing programming guidance. The student reviewed, tested, and verified the submitted program and is responsible for understanding and explaining the source code.
