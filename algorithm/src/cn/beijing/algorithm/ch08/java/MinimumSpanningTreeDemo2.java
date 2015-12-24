/**
 * 
 */
package cn.beijing.algorithm.ch08.java;

import java.util.Arrays;

/**
 * Prim
 * @author zukai 2015-12-24
 */
public class MinimumSpanningTreeDemo2 {
	static int dis[] = new int[7];
	static int book[] = {0,0,0,0,0,0,0};
	static int n = 6,m = 9;
	static int src[][] = {
		{2,4,11},
		{3,5,13},
		{4,6, 3},
		{5,6, 4},
		{2,3, 6},
		{4,5, 7},
		{1,2, 1},
		{3,4, 9},
		{1,3, 2}
	};
	static int inf = 9999;
	static int e[][] = new int[7][7];
	static int count = 0,min = 0,sum = 0;
	static{
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				e[i][j] = inf;
			}
		}
		for (int i = 1; i <= src.length; i++) {//无向图
			e[src[i - 1][0]][src[i - 1][1]] = src[i-1][2];
			e[src[i - 1][1]][src[i - 1][0]] = src[i-1][2];
		}
		for (int i = 1; i <= n; i++) {
			dis[i] = e[1][i];
		}
	}
	public static void main(String[] args) {
		book[1] = 1;//将1号顶点加入生成树
		count++;
		int j = 0;
		while(count < n){
			min = inf;
			for (int i = 1; i <= n; i++) {
				if(book[i] == 0 && dis[i] < min){
					min = dis[i];
					j = i;
				}
			}
			book[j] = 1;count++;sum = sum+dis[j];
			for (int k = 1; k <= n; k++) {
				if(book[k] == 0 && dis[k] > e[j][k]){
					dis[k] = e[j][k];
				}
			}
		}
		System.out.println(Arrays.toString(dis));
		System.out.println(sum);
	}
}
