/**
 * 
 */
package cn.beijing.algorithm.ch05.java;


/**
 * 最短路径
 * @author zukai 2015-12-21
 */
public class ShortestPathDemo {
	//有向图
	static int data1[][] = {
		{ 0, 2,-1,-1,10},
		{-1, 0, 3,-1, 7},
		{ 4,-1, 0, 4,-1},
		{-1,-1,-1, 0, 5},
		{-1,-1, 3,-1, 0}
	};
	//无向图
	static int data[][] = {
		{ 0, 2, 4,-1,10},
		{ 2, 0, 3,-1, 7},
		{ 4, 3, 0, 4, 3},
		{-1,-1, 4, 0, 5},
		{10, 7, 3, 5, 0}
	};
	
	
	static int book[] = {0,0,0,0,0};
	static int min = 9999;
	static int max = 0;
	static void dfs(int cur,int dis){
		if(dis > min) return;//如果当前走过的路程大于之前走过的最短路径，返回
		if(cur == 4){
			min = dis < min ? dis : min;
			return;
		}
		for (int i = 0; i < data[cur].length; i++) {
			if(book[i] == 0 && data[cur][i] > 0){
				book[i] = 1;
				dfs(i,dis+data[cur][i]);
				book[i] = 0;
			}
		}
	}
	public static void main(String[] args) {
		dfs(0,0);
		System.out.println(min);
	}
}
