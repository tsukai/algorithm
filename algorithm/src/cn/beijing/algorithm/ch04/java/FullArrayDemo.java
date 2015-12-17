/**
 * 
 */
package cn.beijing.algorithm.ch04.java;

import java.util.Arrays;

/**
 * 全排列(深度优先搜索模型)
 * @author zukai 2015-12-17
 */
public class FullArrayDemo {
	static int book[] = {0,0,0,0,0,0,0,0,0};//某个数字是否被占用
	static int a[] = new int[9];
	static int n = 9;
	public static void main(String[] args) {
		dfs(0);
	}
	
	public static void dfs(int step){
		if(step == n){
			if(a[0]*100+a[1]*10+a[2] + a[3]*100+a[4]*10+a[5] == a[6]*100+a[7]*10+a[8])
				System.out.println(Arrays.toString(a));
			return;
		}
		for(int i = 0;i < n;i++){
			if(book[i] == 0){//未被占用
				a[step] = i+1;
				book[i] = 1;
				dfs(step+1);
				book[i] = 0;//处理完，设为未占用
			}
		}
	}
}
