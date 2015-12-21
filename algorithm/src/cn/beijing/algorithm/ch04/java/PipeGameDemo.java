/**
 * 
 */
package cn.beijing.algorithm.ch04.java;

import cn.beijing.algorithm.ch02.pojo.SimpleStack;
import cn.beijing.algorithm.ch04.pojo.SimpleQueue;

/**
 * @author zukai 2015-12-21
 */
public class PipeGameDemo {
	/**
	 * 0:tree,
	 * 1:|_,
	 * 2:|-
	 * 3,-|,
	 * 4:_|,
	 * 5:--
	 * 6:|
	 */
	static int data[][] = {
		{5,3,5,3},
		{1,5,3,0},
		{2,3,5,1},
		{6,1,1,5},
		{1,5,5,4}
	};
	static int book[][] = {
		{0,0,0,0},
		{0,0,0,0},
		{0,0,0,0},
		{0,0,0,0},
		{0,0,0,0}
	};
	static int n = 5,m = 4;
	/**
	 * 1:进水口在左边
	 * 2:进水口在上边
	 * 3:进水口在右边
	 * 4:进水口在下边
	 */
	static int front[] = {1,2,3,4};
	static int num = 0,flag = 0;
	static SimpleStack<SimpleQueue> stack = new SimpleStack<>();
	public static void main(String[] args) {
		dfs(0,0,1);
		if(flag == 0){
			System.out.println("impossible");
		}else{
			System.out.println("找到方案");
		}
	}
	private static void dfs(int x, int y, int direction) {
		//判断是否到达终点，放到越界判断前边
		if(x == n-1 && y == m){//出口在右边
			flag = 1;//找到方案
			System.out.println(stack);
			return;
		}
		//判断是否越界
		if(x < 0 || x >= n || y < 0 || y >= m){
			return;
		}
		//判断是否路过
		if(book[x][y] == 1){
			return;
		}
		book[x][y] = 1;
		stack.push(new SimpleQueue(x, y));
		//当前水管是直管（5,6）
		if(data[x][y] >= 5 && data[x][y] <= 6){
			if(direction == front[0]){//进水口在左边
				dfs(x,y+1,direction);
			} else if(direction == front[1]){//进水口在上边
				dfs(x+1,y,direction);
			} else if(direction == front[2]){//进水口在右边
				dfs(x,y - 1,direction);
			} else if(direction == front[3]){//进水口在下边
				dfs(x - 1,y,direction);
			}
		}
		//当前水管是弯管
		if(data[x][y] >= 1 && data[x][y] <= 4){
			if(direction == front[0]){//进水口在左边
				dfs(x+1,y,2);//3号状态
				dfs(x-1,y,4);//4号状态
			} else if(direction == front[1]){//进水口在上边
				dfs(x,y+1,1);//1号状态
				dfs(x,y-1,3);//4号状态
			} else if(direction == front[2]){//进水口在右边
				dfs(x-1,y,4);//1号状态
				dfs(x+1,y,2);//2号状态
			} else if(direction == front[3]){//进水口在下边
				dfs(x,y+1,1);//2号状态
				dfs(x,y-1,3);//3号状态
			}
		}	
		book[x][y] = 0;
		stack.pop();
		return;
	}
}
