/*
Description: This program performs a recursive binary search and
             displays the low, high, and target values during
             every recursive call.

Programmed by: <KRISTEL ANGEL R. PROTACIO> <BSIT> <CN48079> <CC104>

Last Modified: September 9, 2026

Version: 1.0

[Acknowledgements: Instructor-provided Binary Search program;
Generative AI used for code assistance and explanation.]
*/

import java.util.Scanner;

public class Binary_Search {

    public static int bSearch(int[] arr, int target, int low, int high) {

        System.out.println(
            "binarySearch(" + low + ", " + high + ", " + target + ")"
        );

        // Base case: target is not found
        if (low > high) {
            return -1;
        }

        // Find the middle index
        int mid = low + (high - low) / 2;

        // If target is found at the middle
        if (arr[mid] == target) {
            return mid;
        }

        // If target is smaller, search the left half
        if (target < arr[mid]) {
            return bSearch(arr, target, low, mid - 1);
        }

        // Otherwise, search the right half
        return bSearch(arr, target, mid + 1, high);
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Number of elements: ");
        int n = input.nextInt();

        int[] numbers = new int[n];

        System.out.println("Enter the elements in ascending order:");

        for (int i = 0; i < n; i++) {
            numbers[i] = input.nextInt();
        }

        System.out.print("Target: ");
        int target = input.nextInt();

        int result = bSearch(
            numbers,
            target,
            0,
            numbers.length - 1
        );

        if (result == -1) {
            System.out.println("Target not found.");
            System.out.println("Index: -1");
        } else {
            System.out.println("Target found.");
            System.out.println("Index: " + result);
        }

        input.close();
    }
}