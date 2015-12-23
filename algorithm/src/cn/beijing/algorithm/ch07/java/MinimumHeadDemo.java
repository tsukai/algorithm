/**
 * 
 */
package cn.beijing.algorithm.ch07.java;

import java.util.Arrays;

/**
 * 最小堆
 * 
 * @author zukai 2015-12-23
 */
public class MinimumHeadDemo {
	static int h[] = { 0, 99, 5, 36, 7, 22, 17, 92, 12, 2, 19, 25, 28, 1, 46 };
	static int n = 14;

	public static void main(String[] args) {
		for (int i = n / 2; i >= 1; i--) {
			siftdown(i);
		}
		System.out.println(Arrays.toString(h));
	}

	private static void siftdown(int i) {
		int t,flag = 0;
		while(i*2 <= n && flag == 0){
			if(h[i] > h[i*2]){
				t = i*2;
			}else t = i;
			if(i * 2 +1 <= n){//右子节点
				if(h[t] > h[i*2+1])
					t = i*2 +1;
			}
			if(t != i){
				swap(t,i);
				i = t;
			}else flag = 1;
		}
	}

	private static void swap(int t, int i) {
		int k = h[t];
		h[t] = h[i];
		h[i] = k;
	}

	@SuppressWarnings("unused")
	private static void siftup(int i) {
		int flag = 0;
		if(i == 1) return;//堆顶
		while(i != 1 && flag == 0){
			if(h[i] <= h[i/2]){
				swap(i,i/2);
			}else flag = 1;
			i = i / 2;
		}
		
	}
	
	public static int[] getMinimumHeap(){
		for (int i = n / 2; i >= 1; i--) {
			siftdown(i);
		}
		return h;
	}

}
