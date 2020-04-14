package cn.edu.swjtu.demo.Utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
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

	public static List<String> splitJson(String input) {
		input = input.replace("\\", "").replace(":", "").replace(",", "").replace("{", "").replace("}", "")
				.replace("\"", "");
		String[] temp = input.split(" ");
		List<String> result = new ArrayList<String>();
		for (int i = 0; i < temp.length; i += 2) {
			result.add(temp[i]);
		}
		return result;
	}

	public static String cmdCall(String lang, String file) {
		String exe = lang;
		String filePath = file;
		String[] cmdArr = new String[] { exe, filePath };
		Process process;
		try {
			process = Runtime.getRuntime().exec(cmdArr);
			BufferedReader br = null;
			br = new BufferedReader(new InputStreamReader(process.getInputStream()));
			String line = null;
			StringBuilder sb = new StringBuilder();
			while ((line = br.readLine()) != null) {
				sb.append(line + "\n");
			}
			System.out.println();
			// process.waitFor();
			return sb.toString();
		} catch (IOException e) {
			System.err.println(e);
		}
		return "Call function failed";
	}

}
