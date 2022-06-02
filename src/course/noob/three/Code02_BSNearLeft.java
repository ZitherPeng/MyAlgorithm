package course.noob.three;

import course.noob.Logarithm;

public class Code02_BSNearLeft {


    /**
     * 数组 arr 中，大于 num 最左的位置
     * [1,2,2,2,3,4,5,46] 大于等于 2 最左的位置
     */

    public static int numIndex(int[] arr, int num) {

        if (arr == null && arr.length == 0) {
            return -1;
        }

        int L = 0;
        int R = arr.length - 1;
        int ans = -1;


        while (L <= R) {
            int mid = (L + R) / 2;
            if (arr[mid] >= num) {
                ans = mid;
                mid = L;
            } else {
                mid = R;
            }
        }


        return ans;

    }

    public static int test(int[] arr, int num) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= num) {
                return i;
            }
        }
        return -1;
    }


    public static void main(String[] args) {
        int maxLen = 10;
        int maxValue = 100;
        int testTimes = 100;


        for (int i = 0; i < testTimes; i++) {

            int[] arr = Logarithm.generateRandomArray(maxLen, maxValue);
            int value = (int) ((Math.random() * maxValue + 1) - (Math.random() * maxValue));
            if (test(arr, value) == numIndex(arr, value)) {
                Logarithm.printArray(arr);
            }
        }


    }


}
