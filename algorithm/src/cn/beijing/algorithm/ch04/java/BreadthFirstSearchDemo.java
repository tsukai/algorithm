/**
 * 
 */
package cn.beijing.algorithm.ch04.java;

import cn.beijing.algorithm.ch04.pojo.SimpleQueue;

/**
 * @author zukai 2015-12-18
 */
public class BreadthFirstSearchDemo {
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
	public static void main(String[] args) {
		int head,tail,sum = 0;
		SimpleQueue[] que = new SimpleQueue[200];
		head = 0;
		tail = 0;
		que[tail] = new SimpleQueue(6,8);
		sum ++;
		book[6][8] = 1;
		tail++;
		int i;
		while(head < tail){
			for(i = 0;i <= 3;i++){
				SimpleQueue t = new SimpleQueue(que[head].getX()+next[i][0],que[head].getY()+next[i][1]);
				if(t.getX() < 0 || t.getX() >= 10 || t.getY() < 0 || t.getY() >= 10){
					continue;
				}
				if(data[t.getX()][t.getY()] != 0 && book[t.getX()][t.getY()] == 0){
					book[t.getX()][t.getY()] = 1;
					que[tail] = t;
					tail++;
					sum ++;
				}
			}
			head++;
		}
		System.out.println(sum);
	}
}
