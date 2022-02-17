package course.noob.two;

public class Code02_RandToRand {


    /**
     * f() 等概率得到 1 2 3 4 5
     * 求 等概率得到 1～7 （int）
     */

    public static int f() {
        return (int) (Math.random() * 5) + 1;
    }

    // 带概率返回 0，1
    public static int p() {
        int ans = 0;
        do {
            ans = f();
        } while (ans == 3);
        return ans < 3 ? 0 : 1;
    }

    // 等概率返回 1～7
    public static int foo() {
        int ans = 0;
        do {
            ans = (p() << 2) + p() << 1 + p();
        } while (ans == 7);
        // 等改率返回 0 ～ 6
        return ans + 1;
    }


    // 不等概率 返回 0，1。 p 概率返回 0，1-p 概率返回1
    // 转化为等概率 p*(1-p)
    public static int x() {
        return Math.random() < 0.84 ? 0 : 1;
    }

    // 使用 x() 等概率返回 0 ，1
    public static int y() {
        int ans = 0;
        do {
            ans = x();
        } while (ans == x());
        return ans;
    }





    public static void main(String[] args) {

        // Math.random() --> double -- [0,1)  计算机里的数是有精度的，故可以等概率返回 0 ～ 1 中的数
        double ans = Math.random();
        System.out.println(ans);

        int testTimes = 1000000;

        int count = 0;

        for (int i = 0; i < testTimes; i++) {
            if (Math.random() < 0.75) {
                count++;
            }
        }

        System.out.println((double) count / (double) testTimes);
    }
}
