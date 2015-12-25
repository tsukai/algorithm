/**
 * 
 */
package cn.beijing.algorithm.ch08.java;

import cn.beijing.algorithm.ch08.pojo.Edge;

/**
 * 图的最小生成树
 * @author zukai 2015-12-24
 */
public class MinimumSpanningTreeDemo {
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
	static int f[] = {0,1,2,3,4,5,6};
	static Edge edges[] = new Edge[10];
	
	public static void main(String[] args) {
		int count = 0;
		int sum = 0;
		for (int i = 1; i <= src.length; i++) {
			edges[i] =  new Edge(src[i-1][0], src[i-1][1], src[i-1][2]);
		}
		
		quickSort(1,m);
//		System.out.println(Arrays.toString(edges));
		//并查集
		for (int i = 1; i <= m; i++) {
			if(merge(edges[i].getU(), edges[i].getV())){//没有联通
				count++;
				sum = sum + edges[i].getW();
			}
			if(count == n - 1){
				break;
			}
		}
		
		System.out.println(sum);
	}

	private static void quickSort(int left, int right) {
		int i,j;
		Edge e;
		if(left > right) return;
		i = left;
		j = right;
		while(i != j){
			while(edges[j].getW() >= edges[left].getW() && i < j)
				j--;
			while(edges[i].getW() <= edges[left].getW() && i < j)
				i++;
			if(i < j){
				 e = edges[i];
				 edges[i] = edges[j];
				 edges[j] = e;
			}
		}
		e = edges[left];
		edges[left] = edges[i];
		edges[i] = e;
		
		quickSort(left, i - 1);
		quickSort(j + 1, right);
		return;
	}
	
	private static int getf(int v){
		if(f[v] == v) return v;
		else {
			f[v] = getf(f[v]);
			return f[v];
		}
	}
	
	static boolean merge(int v,int u){
		int t1,t2;
		t1 = getf(v);
		t2 = getf(u);
		if(t1 != t2){
			f[t2] = t1;
			return true;
		}
		return  false;
	}
	
	
}
