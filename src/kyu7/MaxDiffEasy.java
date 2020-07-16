package kyu7;
/*
You must implement a function maxDiff that return the difference between the biggest and the smallest value in a list(lst) received as parameter.
The list(lst) contains integers, that means it may contain some negative numbers.
If the list is empty or contains a single element, return 0.
The list(lst) is not sorted.
maxDiff([1, 2, 3, 4]); //return 3, because 4 - 1 == 3
maxDiff([1, 2, 3, -4]); //return 7, because 3 - (-4) == 7
 */

public class MaxDiffEasy {
    public static int maxDiff(int[] lst) {
        int lstLen = lst.length;
        int maxNum, minNum;

        if (lstLen > 1) {
            minNum = maxNum = lst[0];

            for (int count : lst) {
                if (minNum > count) minNum = count;
                else if (maxNum < count) maxNum = count;
            }
        return maxNum - minNum;
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(maxDiff(new int [] {1, 2, 3, 4})); //3
        System.out.println(maxDiff(new int [] {1, 2, 3, -4})); //7
    }
}
