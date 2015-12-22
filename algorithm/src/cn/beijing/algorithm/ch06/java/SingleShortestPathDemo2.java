/**
 * 
 */
package cn.beijing.algorithm.ch06.java;

/**
 * 
 * @author zukai 2015-12-22
 */
public class SingleShortestPathDemo2 {
	static int src[][] = {
		{0,0,0},
		{1,4,9},
		{4,3,8},
		{1,2,5},
		{2,4,6},
		{1,3,7}
	};
	//使用邻接表保存图
	static int u[] = new int[6];//比边数大1
	static int v[] = new int[6];
	static int w[] = new int[6];
	static int first[] = new int[6];//比顶点数大1 表示每个顶点第一条边的的编号
	static int next[] = new int[6];//存储编号为i的边的下一条边的编号
	
	static{
		for (int i = 1; i < first.length; i++) {
			first[i] = -1;//表示1~n个顶点暂时没有边
		}
		for (int i = 1; i < u.length; i++) {
			u[i] = src[i][0];
			v[i] = src[i][1];
			w[i] = src[i][2];
			next[i] = first[u[i]];
			first[u[i]] = i;
		}
	}
	
	public static void main(String[] args) {
		for (int i = 1; i < first.length; i++) {
			int k = first[i];
			while(k != -1){
				System.out.println(u[k]+","+v[k]+","+w[k]);
				k = next[k];
			}
		}
	}
}
