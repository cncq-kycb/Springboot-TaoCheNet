package cn.edu.swjtu.demo.Utils;

import java.util.Random;

public class Utils {

	public static String getRandomCookieid() {
		String str = "zxcvbnmlkjhgfdsaqwertyuiopQWERTYUIOPASDFGHJKLZXCVBNM1234567890";
		Random random = new Random();
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < 25; ++i) {
			int number = random.nextInt(62);
			sb.append(str.charAt(number));
		}
		return sb.toString();
	}

	public static String[] splitString(String input) {
		String[] temp = input.split(",");
		return temp;
	}
}
