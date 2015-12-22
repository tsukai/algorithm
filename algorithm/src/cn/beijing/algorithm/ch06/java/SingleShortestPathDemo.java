/**
 * 
 */
package cn.beijing.algorithm.ch06.java;

import java.util.Arrays;

/**
 * 单源最短路径
 * Dijkstra算法（边松弛）
 * @author zukai 2015-12-22
 */
public class SingleShortestPathDemo {
	static int data[][] = {
		{ 0, 1,12,99,99,99},
		{99, 0, 9, 3,99,99},
		{99,99, 0,99, 5,99},
		{99,99, 4, 0,12,15},
		{99,99,99,99, 0, 4},
		{99,99,99,99,99, 0}
	};
	
	static int result[] = {0,1,12,99,99,99};
	static int book[] = {0,0,0,0,0,0};
	static int inf = 9999,min,n = 6;
	public static void main(String[] args) {
		book[0] = 1;
		int u = 0;
		//core part
		for (int i = 0; i < n -1; i++) {
			min = inf;
			for (int j = 0; j < n; j++) {//找到离0号顶点最近的顶点
				if(book[j] == 0 && result[j] < min){
					min = result[j];
					u = j;
				}
			}
			book[u] = 1;
			for (int k = 0; k < n; k++) {
				if(data[u][k] < inf){
					if(result[k] > result[u] + data[u][k]){
						result[k] = result[u] + data[u][k];
					}
				}
			}
		}
		
		System.out.println(Arrays.toString(result));
		
	}
	
}
