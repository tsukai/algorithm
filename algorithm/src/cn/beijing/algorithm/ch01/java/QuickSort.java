/**
 * 
 */
package cn.beijing.algorithm.ch01.java;

/**
 * 快速排序
 * @author zukai 2015-12-15
 */
public class QuickSort {
	static int a[] = {6,1,2,7,9,3,4,5,10,8};
	public static void main(String[] args) {
		int n = 10;
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
		quicksort(0,n-1);
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}
	}
	public static void quicksort(int left, int right) {
		if(left > right) return;
		int i,j,t,temp;
		temp = a[left];
		i = left;
		j = right;
		while(i != j){//与基数比较，分为两队
			while(a[j] >= temp && i < j)
				j--;
			while(a[i] <= temp && i < j)
				i++;
			if(i < j){
				t = a[i];
				a[i] = a[j];
				a[j] = t;
			}
		}
		
		a[left] = a[i];
		a[i] = temp;
		
		quicksort(left, i - 1);
		quicksort(j+1, right);
		
	}
	
	public static void quicksort(int[] arr,int left, int right) {
		if(left > right) return;
		int i,j,t,temp;
		temp = arr[left];
		i = left;
		j = right;
		while(i != j){//与基数比较，分为两队
			while(arr[j] >= temp && i < j)
				j--;
			while(arr[i] <= temp && i < j)
				i++;
			if(i < j){
				t = arr[i];
				arr[i] = arr[j];
				arr[j] = t;
			}
		}
		
		arr[left] = arr[i];
		arr[i] = temp;
		
		quicksort(arr,left, i - 1);
		quicksort(arr,j+1, right);
		
	}
}
