package course.noob.two;

public class Code01_PreSum {


   /*
    数组中，有一些初始值
    查询 L～R 位置之间的累加和 Sum(arr,L,R),如何让单次查询更加快捷？

    方案一：建立正方型表（二维数组），横轴 R，竖轴 L，正方型表填满一半，查询时直接从表里拿
    生成表的成本，n*n/2

    方案二：前缀和数组(一维数组)，[3..7] 等于 [0..7] - [0-2]
    Sum(arr,3,7) = Sum(arr,0,7) - Sum(arr,0,2)

    PS：如果查询非常频烦，方案一，无需计算（根据具体需求）

    */

    public static void main(String[] args) {
        int[] ints = {1, 2, 3, 4, 5};
        System.out.println(rangeSum2(ints, 3, 4));

    }

    public static int rangeSum1(int[] arr, int l, int r) {
        int N = arr.length;
        // 建立二维数组存下所有相加和
        int[][] square = new int[N][N];
        for (int i = 0; i < N; i++) {
            int sum = 0;
            for (int j = 0; j < N; j++) {
                if (j < i) {
                    continue;
                }
                sum = sum + arr[j];
                square[i][j] = sum;
            }
        }
        return square[l - 1][r - 1];
    }

    public static int rangeSum2(int[] arr, int l, int r) {
        int N = arr.length;
        int[] preSum = new int[N];
        preSum[0] = arr[0];
        for (int i = 1; i < N; i++) {
            preSum[i] = preSum[i - 1] + arr[i];
        }
        return l == 0 ? preSum[r] : preSum[r] - preSum[l - 1];

    }


}
