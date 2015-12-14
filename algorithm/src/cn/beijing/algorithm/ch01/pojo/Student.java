package cn.beijing.algorithm.ch01.pojo;

public class Student {
	private String name;
	private int socre;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSocre() {
		return socre;
	}
	public void setSocre(int socre) {
		this.socre = socre;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", socre=" + socre + "]";
	}
	
}
