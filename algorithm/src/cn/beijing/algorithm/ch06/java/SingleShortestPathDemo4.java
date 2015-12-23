/**
 * 
 */
package cn.beijing.algorithm.ch06.java;

import java.util.Arrays;

/**
 * 使用队列优化Bellman-Ford
 * @author zukai 2015-12-23
 */
public class SingleShortestPathDemo4 {
	static int src[][] = {
		{1,2, 2},
		{1,5,10},
		{2,3, 3},
		{2,5, 7},
		{3,4, 4},
		{4,5, 5},
		{5,3, 6}
	};
	static int n = 5,m = 7;
	static int[] u = new int[7];
	static int[] v = new int[7];
	static int[] w = new int[7];
	static int first[] = {-1,-1,-1,-1,-1,-1,-1};
	static int next[] = new int[7];
	static int que[] = new int[100];
	static int head = 0,tail = 0;
	static int distance[] = {0,0,99,99,99,99,99};//存放结果
	static int book[]  = {0,0,0,0,0,0};
	static int k;
	static{
		que[tail] = 1;
		tail++;
		book[1] = 1;
		for (int i = 0; i < src.length; i++) {
			u[i] = src[i][0];
			v[i] = src[i][1];
			w[i] = src[i][2];
			next[i] = first[u[i]];
			first[u[i]] = i;
			System.out.println(Arrays.toString(next));
			System.out.println(Arrays.toString(first));
		}
		
	}
	
	public static void main(String[] args) {
		while(head < tail){
			k = first[que[head]];//当前需要处理的队首顶点
			while(k != -1){//扫描当前顶点所有边
				if(distance[v[k]] > distance[u[k]]+w[k]){//是否松弛成功
					distance[v[k]] = distance[u[k]]+w[k];//更新顶点1到顶点v[k]的距离
					if(book[v[k]] == 0){
						que[tail++] = v[k];
						book[v[k]] = 1;
					}
				}
				k = next[k];
			}
			book[que[head]] = 0;
			head++;
		}
		
		System.out.println(Arrays.toString(distance));
	}
	
}
