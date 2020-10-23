package br.com.victormoraes.arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class FindTwoNumbersThatAddUpToNumber {

    public static void main(String[] args) {

        int[] arr = {1, 21, 3, 14, 5, 60, 7, 6};
        int[] bruteForceResponse = findSumBruteForce(arr, 27);
        int[] optimizedResponse = findSumOptimized(arr, 27);

        System.out.println("< Brute force method . . . ");
        System.out.println(Arrays.toString(bruteForceResponse));
        System.out.println("Brute force method end >");
        System.out.println("< Optimized method . . . ");
        System.out.println(Arrays.toString(optimizedResponse));
        System.out.println("Optimized end >");
    }


    public static int[] findSumBruteForce(int[] arr, int n) {

        int[] response = new int[2];

        for (int k : arr) {
            for (int j = 1; j < arr.length; j++) {
                int sum = k + arr[j];
                if (sum == n) {
                    response[0] = k;
                    response[1] = arr[j];
                }
            }
        }
        return response;
    }

    public static int[] findSumOptimized(int[] arr, int n) {

        int[] response = new int[2];
        Set<Integer> integersRead = new HashSet<>();

        for (int j : arr) {
            int pairToSum = n - j;

            if (integersRead.contains(pairToSum)) {
                response[0] = j;
                response[1] = pairToSum;
            }
            integersRead.add(j);
        }
        return response;
    }
}
