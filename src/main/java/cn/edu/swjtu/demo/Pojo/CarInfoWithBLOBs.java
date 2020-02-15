package cn.edu.swjtu.demo.Pojo;

public class CarInfoWithBLOBs extends CarInfo {
	private String miaoshu;

	private String src;

	private int isFavorite;

	public String getMiaoshu() {
		return miaoshu;
	}

	public void setMiaoshu(String miaoshu) {
		this.miaoshu = miaoshu == null ? null : miaoshu.trim();
	}

	public String getSrc() {
		return src;
	}

	public void setSrc(String src) {
		this.src = src == null ? null : src.trim();
	}

	public int getIsFavorite() {
		return isFavorite;
	}

	public void setIsFavorite(int isFavorite) {
		this.isFavorite = isFavorite;
	}
}