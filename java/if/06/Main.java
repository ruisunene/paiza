// 西暦年から平成年を求める

import java.util.Calendar;
public class Main {
	public static void main(String[] args) {
	    Calendar calendar = Calendar.getInstance();
        int seireki = calendar.get(Calendar.YEAR);
        System.out.print("西暦" + seireki + "年は、");

        //西暦年から平成年を計算する
        //平成1年は、西暦1989年、その差は、1988
        //西暦年 - 1988 = 平成*年
        //例：西暦1989年 - 1988 = 平成1年
        //例：西暦2015年 - 1988 = 平成27年

        int heisei = seireki - 1988;
        System.out.println("平成" + heisei + "年です。");
        //令和元年は2019年 その差は2018
        //西暦年 - 2018 = 令和*年
        int reiwa = seireki - 2018;
        System.out.println("令和" + reiwa + "年です");
	}
}
