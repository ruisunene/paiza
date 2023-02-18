public class E2 {
	public static void main(String[] args) {
		int number =(int)(Math.random() * 5 + 1);
		System.out.println("あなたの順位は" + number + "位です");
		if (number == 1){
		    System.out.println("おめでとう！");
		} else {
		    System.out.println("あと少し！");
		}
	}
}
