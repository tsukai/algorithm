/**
 * 
 */
package cn.beijing.algorithm.ch01.java;

/**
 * 排序去重
 * @author zukai 2015-12-15
 */
public class IntegrateExample2 {
	static int a[] = {2,3,4,1,3,5,3,6,7,4};
	public static void main(String[] args) {
		QuickSort.quicksort(a,0, 9);
		System.out.print(a[0]+" ");
		for (int i = 1; i < a.length; i++) {
			if(a[i] != a[i-1])
				System.out.print(a[i]+" ");
		}
	}
}
