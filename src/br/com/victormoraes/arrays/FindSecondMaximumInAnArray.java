package br.com.victormoraes.arrays;

public class FindSecondMaximumInAnArray {

    public static void main(String[] args) {
        int[] arr = {9, 2, 3, 6, 8};
        System.out.println(findSecondMaximum(arr));
    }

    public static int findSecondMaximum(int[] arr) {

        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int i : arr) {

            if (i > max) {
                secondMax = max;
                max = i;
            }else if(i > secondMax){
                secondMax = i;
            }
        }
        return secondMax;
    }
}
