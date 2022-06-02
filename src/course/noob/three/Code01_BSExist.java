package course.noob.three;

import course.noob.two.Code03_Logarithm;

/**
 * 二分法
 */
public class Code01_BSExist extends Code03_Logarithm {

    /**
     * 二分
     * #有序数组# 中找到 num
     * arr 保证有序
     */
    public static boolean find(int[] arr, int num) {
        if (arr == null || arr.length == 0) {
            return false;
        }

        int L = 0;
        int R = arr.length - 1;
        while (L <= R) {
            int mid = L + R / 2;
            if (arr[mid] == num) {
                return true;
            } else if (arr[mid] < num) {
                L = mid + 1;
            } else if (arr[mid] > num)
                R = mid - 1;
        }
        return false;
    }


    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            // int[] arr = lenRandomValueRandom(10, 100);
            int[] arr = {18, 24, 43, 48, 56, 65, 93};
            insertionSort(arr);

            int num = arr[0];

            if (!find(arr, num)) {
                printArray(arr);
                System.out.println("找不到");
            }

        }

    }
}