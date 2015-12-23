/**
 * 
 */
package cn.beijing.algorithm.ch07.java;

import java.util.Arrays;

/**
 * 并查集算法
 * @author zukai 2015-12-23
 */
public class AndFindSetsDemo {
	static int f[] = new int[11];
	static int data[][] = {
		{1,2},
		{3,4},
		{5,2},
		{4,6},
		{2,6},
		{8,7},
		{9,7},
		{1,6},
		{2,4}
	};
	static{
		for (int i = 0; i < f.length; i++) {
			f[i] = i;
		}
	}
	
	//找犯罪团伙的最高领导人
	static int getf(int v){
		if(f[v] == v){
			return v;
		}else{
			f[v] = getf(f[v]);//把一个团伙的人都改为最后的最高领导人
			return f[v];
		}
	}
	
	//合并两个自子集
	static void merge(int v,int u){
		int t1,t2;
		t1 = getf(v);
		t2 = getf(u);
		if(t1 != t2){
			f[t2] = t1;//靠左原则
		}
	}
	
	public static void main(String[] args) {
		int sum = 0;
		System.out.println(Arrays.toString(f));
		for (int i = 0; i < data.length; i++) {
			merge(data[i][0], data[i][1]);
			System.out.println(Arrays.toString(f));
		}
		for (int i = 1; i < f.length; i++) {
			if(f[i] == i){
				sum++;
			}
		}
		System.out.println(sum);
		System.out.println(Arrays.toString(f));
	}
}
