/**
 * 
 */
package cn.beijing.algorithm.ch05.pojo;

/**
 * @author zukai 2015-12-21
 */
public class Point {
	private int x;
	private int y;
	public final int getX() {
		return x;
	}
	public final void setX(int x) {
		this.x = x;
	}
	public final int getY() {
		return y;
	}
	public final void setY(int y) {
		this.y = y;
	}
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public Point() {
	}
	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj == null) return false;
		if(this == obj) return true;
		Point other = (Point)obj;
		return this.x == other.x && this.y == other.y;
	}
	
}
