/**
 * 
 */
package cn.beijing.algorithm.ch02.pojo;

/**
 * @author zukai 2015-12-15
 */
public class SimpleQueue {
	public int data[] = new int[1000];
	public int head = 0;
	public int tail = 0;
	
	public void push(int n){
		data[tail++] = n;
	}
	
	public int remove(){
		return data[head++];
	}
	
	public int size(){
		return tail - head;
	}
	
	@Override
	public String toString() {
		for(int i = head;i < tail;i++){
			System.out.print(data[i]+" ");
		}
		System.out.println();
		return "";
	}
	
}
