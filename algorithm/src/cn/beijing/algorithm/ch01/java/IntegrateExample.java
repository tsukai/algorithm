package cn.beijing.algorithm.ch01.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 去重排序
 * @author zukai 2015-12-15
 */
public class IntegrateExample {
	public static void main(String[] args) throws IOException {
		int a[] = new int[10];
		for (int j = 0; j < a.length; j++) {
			a[j] = 0;
		}
		int i,t,n=10;
		String str = null;
		System.out.println("please input the num of all isbn:");
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//		str = reader.readLine();
//		n = Integer.parseInt(str);
		for (i = 0; i < n; i++) {
			str = reader.readLine();
			t = Integer.parseInt(str);
			a[t] = 1;
		}
		
		for (int j = 0; j < n; j++) {
			if(a[j] != 0){
				System.out.print(j+" ");
			}
		}
	}
}
