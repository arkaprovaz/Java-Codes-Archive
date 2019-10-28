package Arrays;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

//this Solution is from HackerRank Interview Questions to Sort array in Minimum Swaps 

//Link to the Question : https://www.hackerrank.com/challenges/minimum-swaps-2/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=arrays


public class MinimumSwapSolution {

    // Complete the minimumSwaps function below.
    static int minimumSwaps(int[] arr) {
        int swaps = 0;

        for (int current = 0; current < arr.length; ) {
            if (!inPlace(arr, current)) {
                System.out.println("item at index " + arr[current] + " is not equal with " + (current + 1));
                ++swaps;
                swapInPlace(arr, current);
            } else {
                ++current;
            }
        }

        return swaps;
    }


    //swap the array with current position with next position
    private static void swapInPlace(int[] arr, int index) {
        //initiating swap
        int newIndex = arr[index] - 1;
        System.out.println("swapping element "+arr[newIndex]+" with "+arr[index]);
        int tmp = arr[newIndex];
        arr[newIndex] = arr[index];
        arr[index] = tmp;

        System.out.println(" after swapping element "+arr[newIndex]+" with "+arr[index]);
    }

    //to check that the array item is equal with the index+1 element
    private static boolean inPlace(int[] arr, int index) {
        return arr[index] == index + 1;

    }


    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        int res = minimumSwaps(arr);

        System.out.println("minimum swaps: " + res);


        scanner.close();
    }
}