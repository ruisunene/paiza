// if文による条件分岐　else if
public class E1 {
	public static void main(String[] args) {
		int number = (int)(Math.random() * 5 + 1);
		System.out.println("あなたの順位は" + number + "位です");
		if (number == 1) {
		    System.out.println("おめでとう！");
		} else if (number == 2) {
		    System.out.println("あと少し！");
		} else {
		    System.out.println("よくがんばったね");
		}
	}
}
