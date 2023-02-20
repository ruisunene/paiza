// if文による条件分岐　比較演算子
public class E1 {
	public static void main(String[] args) {
		int age = (int)(Math.random() * 5 + 18);
		if (age < 20) {
		    System.out.println(age + "才は飲酒不可");
		} else if (age >= 20) {
		    System.out.println(age + "才は飲酒可能");
		}
	}
}
