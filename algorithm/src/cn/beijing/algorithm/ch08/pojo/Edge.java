package cn.beijing.algorithm.ch08.pojo;

public class Edge {
	private int u;
	private int v;
	private int w;
	
	public Edge() {
	}
	
	public Edge(int u, int v, int w) {
		this.u = u;
		this.v = v;
		this.w = w;
	}

	public int getU() {
		return u;
	}
	public void setU(int u) {
		this.u = u;
	}
	public int getV() {
		return v;
	}
	public void setV(int v) {
		this.v = v;
	}
	public int getW() {
		return w;
	}
	public void setW(int w) {
		this.w = w;
	}

	@Override
	public String toString() {
		return "Edge [u=" + u + ", v=" + v + ", w=" + w + "]";
	}
	
	
}
