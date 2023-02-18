// if文による条件分岐
public class If {
	public static void main(String[] args) {
	    //int number = 1;
        int number = (int)(Math.random() * 2 + 1); //ランダムに結果を変えるとき
        if(number == 1){
            System.out.println("スキ!");    //条件式が成立した時の処理
        } else {
            System.out.println("キライ");   //条件式が成立しなかった時の処理
        }
	}
}
