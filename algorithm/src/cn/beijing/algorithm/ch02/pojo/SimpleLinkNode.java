package cn.beijing.algorithm.ch02.pojo;

public class SimpleLinkNode<T> {
	private T data;
	private SimpleLinkNode<T> next;
	
	public SimpleLinkNode() {
	}
	public SimpleLinkNode(T data) {
		this.data = data;
		this.next = null;
	}
	public final T getData() {
		return data;
	}
	public final void setData(T data) {
		this.data = data;
	}
	public final SimpleLinkNode<T> getNext() {
		return next;
	}
	public final void setNext(SimpleLinkNode<T> next) {
		this.next = next;
	}
	
	
}
