// if文による条件分岐
public class E4 {
	public static void main(String[] args) {
		int number =((int)(Math.random() * 3 + 1)) * 100;
		System.out.println("あなたの得点は" + number + "ポイントです");
		if (number == 300) {
		    System.out.println("おめでとう！");
		} else {
		    System.out.println("ざんねん！");
		}
	}
}
