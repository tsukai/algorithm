/**
 * 
 */
package cn.beijing.algorithm.ch08.java;

/**
 * Prim
 * @author zukai 2015-12-24
 */
public class MinimumSpanningTreeDemo3 {
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
	static int dis[] = new int[7];
	static int book[] = {0,0,0,0,0,0,0};
	static int h[] = new int[7];//堆
	static int pos[] = new int[7];//每个顶点在堆中的位置
	static int size = 0;//堆的大小
	static int u[] = new int[19];
	static int v[] = new int[19];
	static int w[] = new int[19];
	static int first[] = new int[7];
	static int next[] = new int[19];
	static int inf = 9999;
	static int count = 0,sum = 0;
	static{
		for (int i = 1; i <= src.length; i++) {
			u[i] = src[i-1][0];
			v[i] = src[i-1][1];
			w[i] = src[i-1][2];
		}
		//无向图
		for (int i = m+1; i <= 2*m; i++) {
			u[i] = v[i-m];
			v[i] = u[i-m];
			w[i] = w[i-m];
		}
		for (int i = 1; i <= n; i++) {
			first[i] = -1;
		}
		for (int i = 1; i <= 2*m; i++) {
			next[i] = first[u[i]];
			first[u[i]] = i;
		}
	}
	static void swap(int x,int y){
		int t;
		t = h[x];
		h[x] = h[y];
		h[y] = t;
		//同步更新pos
		t = pos[h[x]];
		pos[h[x]] = pos[h[y]];
		pos[h[y]] = t;
	}
	
	//向下调整
	static void siftdown(int i){
		int t,flag = 0;
		while(i*2 <= size && flag == 0){
			if(dis[h[i]] > dis[h[i*2]]){
				t = i * 2;
			}else t = i;
			if(i * 2 + 1  < size){
				if(dis[h[i]] > dis[h[i*2+1]]){
					t = i  * 2 + 1;
				}
				
			}
			if(t != i){
				swap(t,i);
				i = t;
			}else{
				flag = 1;
			}
		}
	}
	//向上调整
	static void siftup(int i){
		int flag = 0;
		if(i == 1) return;
		while(i != 1 && flag == 0){
			if(dis[h[i]] < dis[h[i/2]]){
				swap(i,i/2);
			}else{
				flag = 1;
			}
			i = i / 2;
		}
	}
	
	static int pop(){
		int t;
		t = h[1];
		pos[t] = 0;
		h[1] = h[size];//将堆的最后一个点赋值到堆顶
		pos[h[1]] = 1;
		size--;
		siftdown(1);
		return t;
	}
	
	public static void main(String[] args) {
		book[1] = 1;
		count++;
		dis[1] = 0;
		for (int i = 2; i <= n; i++) {
			dis[i] = inf;
		}
		int k = first[1];
		while(k != -1){
			dis[v[k]] = w[k];
			k = next[k];
		}
		size = n;
		for (int i = 1; i <= size; i++) {
			h[i] = i;
			pos[i] = i;
		}
		for (int i = size/2; i >= 1; i--) {
			siftdown(i);
		}
		pop();
		int j = 0;
		while(count <n){
			j = pop();
			book[j] = 1;
			count++;
			sum = sum+dis[j];
			k = first[j];
			while(k != -1){
				if(book[v[k]] == 0 && dis[v[k]]> w[k]){
					dis[v[k]] = w[k];
					siftup(pos[v[k]]);
				}
				k = next[k];
			}
		}
		System.out.println(sum);
	}
}	
