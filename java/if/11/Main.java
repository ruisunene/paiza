// 税込み金額を計算する

public class Main {
    public static void main(String[] args) {
        int price = 3500;
        System.out.println("定価：" + price + "円");
        int discountPrince = (int)(price * 0.85);
        System.out.println("割引価格は、" + discountPrince + "円です。");
        int amount = (int)(discountPrince * 1.08);
        System.out.println("税込金額は、" + amount + "円です。");
        int person = 5;
        System.out.println("人数が、" + person + "人の場合、");
        int amountPerPerson = amount / person;
        int remainder = amount % person;
        System.out.println("一人当たり" + amountPerPerson + "円、余り" + remainder + "円です。");
    }
}
