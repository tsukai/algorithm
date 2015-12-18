/**
 * 
 */
package cn.beijing.algorithm.ch04.java;

import cn.beijing.algorithm.ch04.pojo.SimpleQueue;

/**
 * 广度优先搜索
 * @author zukai 2015-12-18
 */
public class ShortestPathDemo2 {
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
	static int n = 5,m = 4;
	static SimpleQueue[] que = new SimpleQueue[50];
	static int head = 0,tail = 0;
	
	public static void bfs(SimpleQueue p,SimpleQueue target){
		if(p.equals(target)){
			System.out.println(p.getStep());
			return;
		}
		int i;
		for(i = 0;i <= 3;i++){
			//right
			SimpleQueue t = new SimpleQueue(p.getX() + next[i][0],p.getY() + next[i][1]);
			if(t.getX() < 0 || t.getX() >= n || t.getY() < 0 || t.getY() >= m){//走出范围
				continue;
			}
			if(a[t.getX()][t.getY()] == 0 && book[t.getX()][t.getY()] == 0){
				book[t.getX()][t.getY()] = 1;
				que[tail] = t;
				que[tail].setStep(p.getStep() + 1);//步数是父亲步数+1
				tail++;
			}
		}
		head++;
		bfs(que[head],target);
	}
	
	public static void main(String[] args) {
		que[0] = new SimpleQueue();
		que[0].setX(0);
		que[0].setY(0);
		tail++;
		
		book[0][0] = 1;
		bfs(new SimpleQueue(0, 0),new SimpleQueue(3, 2));
	}
}
