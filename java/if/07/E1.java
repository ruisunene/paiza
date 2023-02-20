// 順位に合わせてメッセージを表示する

public class E1 {
    public static void main(String[] args) {
        double rand = (Math.random() * 10) + 1;
        int number = (int) rand;
        System.out.println("あなたの順位は" + number + "位です");

        if (number >= 2 && number <= 5) {
            System.out.println("あと少し");
        }//　ここにifを追加する

    }
}
