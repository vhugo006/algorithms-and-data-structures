package br.com.victormoraes.arrays;

import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatingIntegerInArray {

    public static void main(String[] args) {

        int[] arr = {9, 9, 2, 3, 2, 6, 6};
        int response = findFirstUniqueBruteForce(arr);
        System.out.println(response);

        int responseOptimized = findFirstUniqueOptimized(arr);
        System.out.println(responseOptimized);
    }

    public static int findFirstUniqueBruteForce(int[] arr) {

        for (int i : arr) {

            int countNumber = 0;
            for (int j : arr) {
                if (i == j) {
                    countNumber++;
                }
            }
            if (countNumber == 1) {
                return i;
            }
        }
        return -1;
    }

    public static int findFirstUniqueOptimized(int[] arr) {

        Map<Integer, Integer> mapCount = new HashMap<>();

        for (int i : arr) {
            if (mapCount.containsKey(i)) {
                mapCount.replace(i, mapCount.get(i) + 1);
            } else {
                mapCount.put(i, 1);
            }
        }

        for (int i : arr) {
            if (mapCount.get(i) == 1) {
                return i;
            }
        }

        return -1;
    }
}
