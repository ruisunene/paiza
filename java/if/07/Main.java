// 複数の条件を組み合わせる - AND

public class Main {
    public static void main(String[] args) {
        int number1 = 1;
        int number2 = 2;
        if (number1 == 1 && number2 == 1) {
            System.out.println("スキ");
        } else {
            System.out.println("キライ");
        }
        
        double rand = Math.random() * 100 + 1;
        int number3 = (int)rand;
        System.out.println(number3);
        if (number3 >= 30 && number3 <= 60) {
            System.out.println("あたり");
        } else {
            System.out.println("残念！");
        }
        
    }
}
