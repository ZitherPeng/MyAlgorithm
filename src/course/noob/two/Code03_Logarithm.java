package course.noob.two;

public class Code03_Logarithm {


    // 返回数组 arr，arr长度 [0,maxLen-1], arr 中的每个值 [0,maxvalue-1]
    public static int[] lenRandomValueRandom(int maxLen, int maxValue) {
        int len = (int) (Math.random() * maxLen);
        int[] intArr = new int[len];
        for (int i = 0; i < len; i++) {
            intArr[i] = (int) (Math.random() * maxValue);
        }
        return intArr;
    }


    // 复制数组
    public static int[] copyArray(int[] arr) {
        int[] ans = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            ans[i] = arr[i];
        }
        return ans;
    }


    // 判断是否升序
    public static boolean isSorted(int[] arr) {
        if (arr.length < 2) {
            return true;
        }
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max > arr[i]) {
                return false;
            }
            max = Math.max(max, arr[i]);
        }
        return true;
    }

    public static void selectionSort(int[] arr) {
        if (arr == null || arr.length < 2) {
            return;
        }
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            swap(arr, i, minIndex);
        }
    }

    public static void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

    public static void insertionSort(int[] arr) {
        if (arr == null || arr.length < 2) {
            return;
        }
        for (int i = 1; i < arr.length; i++) { // 0 ~ i 做到有序
            for (int j = i - 1; j >= 0 && arr[j] > arr[j + 1]; j--) {
                swap(arr, j, j + 1);
            }
        }
    }


    public static void main(String[] args) {

        int maxLen = 3;
        int maxValue = 1000;
        int times = 10000;


        for (int i = 0; i < times; i++) {
            int[] arr = lenRandomValueRandom(maxLen, maxValue);
            int[] tmp = copyArray(arr);
            insertionSort(arr);
            if (!isSorted(arr)) {
                for (int n : tmp) {
                    System.out.print(n + " ");
                }
                System.out.println();
            }
        }

    }
}
