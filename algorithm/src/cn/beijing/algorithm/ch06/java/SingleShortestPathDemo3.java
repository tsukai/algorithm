/**
 * 
 */
package cn.beijing.algorithm.ch06.java;

import java.util.Arrays;

/**
 * 带负权边的最短路径
 * Bellman-Ford算法
 * @author zukai 2015-12-22
 */
public class SingleShortestPathDemo3 {
	static int distance[] = {0,0,99,99,99,99};
	static int u[] = {2, 1,1,4,3};
	static int v[] = {3, 2,5,5,4};
	static int w[] = {2,-3,5,2,3};
	static int n = 5,m = 5;
	static int inf = 9999;//{0,0,-3,99,99,5};
	public static void main(String[] args) {
		for (int i = 1; i <= n - 1; i++) {
			for (int j = 0; j <= m-1; j++) {
				if(distance[v[j]]  > distance[u[j]] + w[j]){
					distance[v[j]]  = distance[u[j]] + w[j];
				}
			}
		}
		int flag = 0;
		for (int j = 0; j < m - 1; j++) {
			if(distance[v[j]]  > distance[u[j]] + w[j]){
				flag = 1;
				break;
			}
		}
		if(flag == 1){
			System.out.println("此图含有负权回路");
		}else{
			System.out.println(Arrays.toString(distance));
		}
	}
}
