package br.com.victormoraes.arrays;

public class FindTheSumOfMaxSumSubArray {

    public static void main(String[] args) {
        int[] arr = {1, 7, -2, -5, 10, -1};
        System.out.println(findMaxSumSubArray(arr));
    }

    public static int findMaxSumSubArray(int[] arr) {

        // global max keep track max of all positive contiguous segments
        int global_max = 0;
        int local_max = 0;

        for (int i : arr) {
            local_max = local_max + i;

            if (global_max < local_max) {
                global_max = local_max;
            }

            // I only look for positive contiguous segments
            if (local_max < 0) {
                local_max = 0;
            }
        }
        return global_max;
    }
}
