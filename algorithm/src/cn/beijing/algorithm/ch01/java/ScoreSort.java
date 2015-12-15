/**
 * 
 */
package cn.beijing.algorithm.ch01.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 简化的桶排序
 * @author zukai 2015-12-14
 */
public class ScoreSort {
	public static void main(String[] args) throws IOException {
		int a[] = new int[11];
		int i,j,k;
		String str = null;
		for(i = 0;i <= 10;i++){
			a[i] = 0;
		}
		
		System.out.println("please input:");
		for(i = 1;i <= 5;i++){
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			str = reader.readLine();
			k = Integer.parseInt(str);
			a[k]++;
		}
		
		for(i = 0;i <= 10;i++){
			for(j = 1;j <= a[i];j++){
				System.out.print(i+"\t");
			}
		}
	}
}
