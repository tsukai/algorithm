/**
 * 
 */
package cn.beijing.algorithm.ch05.java;

/**
 * 深度遍历图
 * @author zukai 2015-12-21
 */
public class DepthGraphDemo {
	//图的邻接矩阵存储法
	static int[][] data = {
		{ 0, 1, 1,-1, 1},
		{ 1, 0,-1, 1,-1},
		{ 1,-1, 0,-1, 1},
		{-1, 1,-1, 0,-1},
		{ 1,-1, 1,-1, 0},
	};
	static int book[] = {0,0,0,0,0};
	static int n = 5;
	static void dfs(int cur){
		System.out.println(cur);
		if(cur == n) return;
		for (int i = 0; i < data.length; i++) {
			if(data[cur][i] == 1 && book[i] == 0){
				book[i] = 1;
				dfs(i);
			}
		}
		return;
	}
	
	public static void main(String[] args) {
		book[0] = 1;
		dfs(0);
	}
}
