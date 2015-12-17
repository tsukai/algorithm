/**
 * 
 */
package cn.beijing.algorithm.ch04.java;

import cn.beijing.algorithm.ch04.pojo.Point;

/**
 * @author zukai 2015-12-17
 */
public class ShortestPathDemo {
	static int min = 99999;
	static int n = 5,m = 4,num = 0;
	static int a[][] = {
		{0,0,1,0},
		{0,0,0,0},
		{0,0,1,0},
		{0,1,0,0},
		{0,0,0,1}
	},
	book[][] = {
		{0,0,0,0},
		{0,0,0,0},
		{0,0,0,0},
		{0,0,0,0},
		{0,0,0,0}
	};
	static int next[][] = {
		{0,1},//move right
		{1,0},//move down
		{0,-1},//move left
		{-1,0}//move up
	};
	public static void dfs(Point p,Point target,int step){
		if(p.equals(target)){
			if(step < min) min = step;
			return;
		}
		for (int i = 0; i < next.length; i++) {
			Point t = new Point(p.getX()+next[i][0],p.getY()+next[i][1]);
			if(t.getX() < 0 || t.getX() >= n || t.getY() < 0 || t.getY() >= m){//走出范围
				continue;
			}
			System.out.println(t+"===="+ (++num));
			//是否为障碍物或则已经路过
			if(a[t.getX()][t.getY()] == 0 && book[t.getX()][t.getY()] == 0){
				book[t.getX()][t.getY()] = 1;//标记为已经路过
				dfs(t,target,step+1);
				book[t.getX()][t.getY()] = 0;//尝试结束，取消这个点的标记
			}
		}
	}
	
	
	public static void main(String[] args) {
		Point target = new Point(3,2);
		book[0][0] = 1;
		dfs(new Point(0,0),target,0);
		System.out.println(min);
	}
	
}
