package cn.edu.swjtu.demo;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;

public class test {

	public static void main(String[] args) {
		String exe = "python";
		String filePath = "/Users/alberto/Downloads/58/来源/58RecommendationRank/recommend.py";
		String cookieid = "++3r5luTpb1nr9srmUwn2w==";
		String[] cmdArr = new String[] { exe, filePath, cookieid };
		Process process;
		try {
			process = Runtime.getRuntime().exec(cmdArr);
			InputStream is = process.getInputStream();
			DataInputStream dis = new DataInputStream(is);
			String str = dis.readLine();
			try {
				process.waitFor();
				System.out.println(str);
			} catch (InterruptedException e) {
				System.err.println(e);
			}
		} catch (IOException e) {
			System.err.println(e);
		}
	}
}
