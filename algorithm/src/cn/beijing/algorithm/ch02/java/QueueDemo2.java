/**
 * 
 */
package cn.beijing.algorithm.ch02.java;

import cn.beijing.algorithm.ch02.pojo.SimpleQueue;

/**
 * @author zukai 2015-12-15
 */
public class QueueDemo2 {
	public static void main(String[] args) {
		SimpleQueue queue = new SimpleQueue();
		queue.head = 0;
		queue.tail = 0;
		queue.data = new int[100];
		int i;
		for(i = 0;i < 10;i++){
			queue.data[i] = i;
			queue.tail++;
		}
		while(queue.head < queue.tail){
			System.out.print(queue.data[queue.head]);
			queue.head++;
			
			queue.data[queue.tail] = queue.data[queue.head];
			queue.tail++;
			queue.head++;
		}
	}
}
