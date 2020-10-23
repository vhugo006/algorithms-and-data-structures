package br.com.victormoraes.arrays;

public class FindMinimumValueInArray {

    public static void main(String[] args) {

        int[] arr = {9, 2, 3, 6};
        int response = findMinimum(arr);
        System.out.println(response);
    }

    public static int findMinimum(int[] arr) {

        int minValue = Integer.MAX_VALUE;
        for (int i : arr) {
            if (i < minValue) {
                minValue = i;
            }
        }
        return minValue;
    }
}
