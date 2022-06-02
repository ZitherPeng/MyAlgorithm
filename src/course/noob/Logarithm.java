package course.noob;

public class Logarithm {


    /**
     * 生成 0 ～ （maxValue-1） 范围内随机数组含空数组
     */
    public static int[] generateRandomArray(int maxLen, int maxValue) {
        int len = (int) (Math.random() * maxLen);
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = (int) (Math.random() * maxValue);
        }
        return arr;
    }


    public static int[] generateRandomArrayDim(int maxSize, int maxValue) {
        int[] arr = new int[(int) ((maxSize + 1) * Math.random())];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) ((maxValue + 1) * Math.random()) - (int) (maxValue * Math.random());
        }
        return arr;
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int maxLen = 10;
        int maxValue = 100;
        int times = 5;
        for (int i = 0; i < times; i++) {
            printArray(generateRandomArray(maxLen, maxValue));
        }
    }
}
