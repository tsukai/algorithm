/**
 * 
 */
package cn.beijing.algorithm.ch02.java;

/**
 * @author zukai 2015-12-15
 */
public class QueueDemo {
	public static void main(String[] args) {
		int a[] = {6,3,1,7,5,8,9,2,4,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
		int head,tail;
		head = 0;tail = 9;
		while(head < tail){
			//打印队首，并将队首出队
			System.out.print(a[head]);
			head++;
			
			//队首添加到队尾
			a[tail] = a[head];
			head++;
			tail++;
		}
	}
}
