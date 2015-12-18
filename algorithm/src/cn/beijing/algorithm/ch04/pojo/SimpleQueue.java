/**
 * 
 */
package cn.beijing.algorithm.ch04.pojo;

/**
 * @author zukai 2015-12-18
 */
public class SimpleQueue {
	private int x;
	private int y;
	private int step = 0;
	
	public SimpleQueue() {
	}
	public SimpleQueue(int x, int y) {
		this.x = x;
		this.y = y;
	}
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
	public final int getStep() {
		return step;
	}
	public final void setStep(int step) {
		this.step = step;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj == null) return false;
		if(this == obj) return true;
		SimpleQueue other = (SimpleQueue) obj;
		return this.x == other.x && this.y == other.y;
	}
	
}
