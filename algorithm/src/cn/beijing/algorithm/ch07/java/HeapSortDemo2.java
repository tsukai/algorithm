/**
 * 
 */
package cn.beijing.algorithm.ch07.java;

import java.util.Arrays;

/**
 * 堆排序
 * 最大堆
 * @author zukai 2015-12-23
 */
public class HeapSortDemo2 {
	static int h[] = MinimumHeadDemo.getMaximumHeap();
	static int n = 14;
	
	private static void swap(int t, int i) {
		int k = h[t];
		h[t] = h[i];
		h[i] = k;
	}
	
	static void heapSort(){
		while(n > 1){
			swap(1,n);
			n--;
			siftdown(1);
		}
	}
	
	private static void siftdown(int i) {
		int t,flag = 0;
		while(i*2 <= n && flag == 0){
			if(h[i] < h[i*2]){
				t = i*2;
			}else t = i;
			if(i * 2 +1 <= n){//右子节点
				if(h[t] < h[i*2+1])
					t = i*2 +1;
			}
			if(t != i){
				swap(t,i);
				i = t;
			}else flag = 1;
		}
	}
	
	public static void main(String[] args) {
		heapSort();
		System.out.println(Arrays.toString(h));
	}
}
