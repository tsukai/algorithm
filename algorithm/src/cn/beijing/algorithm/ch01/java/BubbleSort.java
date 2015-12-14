/**
 * 
 */
package cn.beijing.algorithm.ch01.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author tsukai
 */
public class BubbleSort {
	public static void main(String[] args) throws IOException {
		int a[] = new int[10];
		int i,j,t,n;
		String str = null;
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("please input the num of that needs to sort:");
		str = reader.readLine();
		n = Integer.parseInt(str);
		for(i = 0;i < n;i++){
			str = reader.readLine();
			a[i] = Integer.parseInt(str);
		}
		
		for(i = 1;i <= n - 1;i++){//1234365789
			for(j = 0;j < n - i;j++){
				if(a[j] < a[j+1]){
					t = a[j];
					a[j] = a[j+1];
					a[j+1] = t;
				}
			}
		}
		
		for(i = 0;i < n;i++){
			System.out.print(a[i]+"\t");
		}
	}
}
