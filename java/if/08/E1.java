// 不快指数

public class E1 {
    public static void main(String[] args) {
        double rand = (Math.random() * 71) + 30;
        int discomfort = (int) rand;
        System.out.println("不快指数は" + discomfort + "です。");

        //　ここにifを追加する
        if (discomfort <= 55 || discomfort >= 70) {
            System.out.println("不快です");
        }
    }
}
