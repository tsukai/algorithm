package cn.beijing.algorithm.ch07.java;

/**
 * 堆排序
 * @author zukai 2015-12-23
 */
public class HeapSortDemo {
	static int[] h = MinimumHeadDemo.getMinimumHeap();
	static int n = 14;
	public static void main(String[] args) {
		for (int i = 1; i < h.length; i++) {
			System.out.println(deleteMax());
		}
	}
	
	public static int deleteMax(){
		int t;
		t = h[1];
		h[1] = h[n];
		n--;
		siftdown(1);
		return t;
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
}
