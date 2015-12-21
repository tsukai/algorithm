/**
 * 
 */
package cn.beijing.algorithm.ch04.java;

import java.util.Arrays;

import cn.beijing.algorithm.ch04.pojo.SimpleQueue;

/**
 * @author zukai 2015-12-18
 */
public class DepthFirstSearchDemo {
	static int data[][]  = {
		{1,2,1,0,0,0,0,0,2,3},
		{3,0,2,0,1,2,1,0,1,2},
		{4,0,1,0,1,2,3,2,0,1},
		{3,2,0,0,0,1,2,4,0,0},
		{0,0,0,0,0,0,1,5,3,0},
		{0,1,2,1,0,1,5,4,3,0},
		{0,1,2,3,1,3,6,2,1,0},
		{0,0,3,4,8,9,7,5,0,0},
		{0,0,0,3,7,8,6,0,1,2},
		{0,0,0,0,0,0,0,0,1,0}
	};
	static int n = 10;
	static int book[][] = {
		{0,0,0,0,0,0,0,0,0,0},
		{0,0,0,0,0,0,0,0,0,0},
		{0,0,0,0,0,0,0,0,0,0},
		{0,0,0,0,0,0,0,0,0,0},
		{0,0,0,0,0,0,0,0,0,0},
		{0,0,0,0,0,0,0,0,0,0},
		{0,0,0,0,0,0,0,0,0,0},
		{0,0,0,0,0,0,0,0,0,0},
		{0,0,0,0,0,0,0,0,0,0},
		{0,0,0,0,0,0,0,0,0,0}
	};
	
	static int next[][] = {
		{0,1},//move right
		{1,0},//move down
		{0,-1},//move left
		{-1,0}//move up
	};
	static int sum;
	private static void dfs(SimpleQueue point,int step){
		if(data[point.getX()][point.getY()] == 0){
			return;
		}
		data[point.getX()][point.getY()] = step;
		int i;
		for(i = 0;i <= 3;i++){
			SimpleQueue t = new SimpleQueue(point.getX()+next[i][0], point.getY()+next[i][1]);
			if(t.getX() < 0 || t.getX() >= 10 || t.getY() < 0 || t.getY() >= 10){
				continue;
			}
			if(data[t.getX()][t.getY()] > 0 && book[t.getX()][t.getY()] == 0){
				sum++;
				book[t.getX()][t.getY()] = 1;
				dfs(t,step);
//				book[t.getX()][t.getY()] = 0;
			}
		}
	}
	
	public static void main(String[] args) {
		@SuppressWarnings("unused")
		SimpleQueue start = new SimpleQueue(6,8);
		//dfs(start,-1);
//		System.out.println(sum);
		int num = 0;
		for (int i = 0; i < data.length; i++) {
			for (int j = 0; j < data[i].length; j++) {
				if(data[i][j] > 0){
					num --;
					book[i][j] = 1;
					dfs(new SimpleQueue(i,j),num);
				}
			}
		}
		
		for (int i = 0; i < data.length; i++) {
			System.out.println(Arrays.toString(data[i]));
		}
	}
}
