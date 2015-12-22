/**
 * 
 */
package cn.beijing.algorithm.ch06.java;

import java.util.Arrays;

/**
 * 多源最短路径
 * Floyd-Warshall算法(O(N^3))
 * @author zukai 2015-12-22
 */
public class MultiShortestPathDemo {
	static int data[][] = {
		{ 0, 2, 6, 4},
		{99, 0, 3,99},
		{ 7,99, 0, 1},
		{ 5,99,12, 0},
	};
	static int n = 4;
	
	public static void main(String[] args) {
		for (int i = 0; i < data.length; i++) {
			System.out.println(Arrays.toString(data[i]));
		}
		System.out.println("==========================");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				for (int k = 0; k < n; k++) {
					if(data[j][k] >= data[j][i] + data[i][k])
						data[j][k] = data[j][i] + data[i][k];
				}
			}
		}
		
		for (int i = 0; i < data.length; i++) {
			System.out.println(Arrays.toString(data[i]));
		}
	}
}
